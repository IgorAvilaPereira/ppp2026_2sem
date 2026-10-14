package negocio;

import java.io.IOException;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPooled;

// -- 1ª vez
// docker run --name redis -p 6379:6379 -d redis:latest
// docker exec -it redis redis-cli
// -- demais vezes
// sudo docker start redis
// sudo docker exec -it redis redis-cli

public class PokeApiProxy implements PokeApiSubject {

    private PokeApiReal pokeApiReal;

    public PokeApiProxy() {
        this.pokeApiReal = new PokeApiReal();
    }

    @Override
    public String request(String pokemon) throws IOException, InterruptedException {
        String result = null;
        JedisPool pool = new JedisPool("localhost", 6379);
        try (Jedis jedis = pool.getResource()) {
            jedis.select(0);
            if (jedis.exists(pokemon)) {
                System.out.println();
                long tempoInicial = System.nanoTime();
                System.out.println("Pelo cache!");
                result = jedis.get(pokemon).toString();
                long tempoFinal = System.nanoTime();
                long duracaoNano = tempoFinal - tempoInicial;
                double duracaoMillis = duracaoNano / 1_000_000.0;
                System.out.println("Tempo decorrido 2: " + duracaoMillis + " ms");
            } else {
                System.out.println("Pela api!");
                result = this.pokeApiReal.request(pokemon);
                System.out.println("gravando no cache");
                jedis.setex(pokemon, 15, result);
            }
        }
        return result;

    }

}
