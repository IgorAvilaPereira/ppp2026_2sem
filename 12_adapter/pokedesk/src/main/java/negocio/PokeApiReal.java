package negocio;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PokeApiReal implements PokeApiSubject{

    public String request(String pokemon) throws IOException, InterruptedException {
        long tempoInicial = System.nanoTime();

        // 1. Criar o cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        // 2. Construir a requisição
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://pokeapi.co/api/v2/pokemon/"+pokemon))
                .GET()
                .build();

        // 3. Enviar a requisição e obter a resposta
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // 4. Imprimir o resultado
        // System.out.println("Status: " + response.statusCode());
        // System.out.println("Corpo: " + response.body());

        long tempoFinal = System.nanoTime();
        long duracaoNano = tempoFinal - tempoInicial;

        // Convertendo para milissegundos ou segundos, se desejar
        double duracaoMillis = duracaoNano / 1_000_000.0;
        System.out.println("Tempo decorrido: " + duracaoMillis + " ms");
    
        return  response.body();
    }

}
