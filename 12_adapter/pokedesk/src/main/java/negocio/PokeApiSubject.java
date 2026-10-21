package negocio;

import java.io.IOException;

/**
 * PokeApiSubject
 */
public interface PokeApiSubject {

    public String request(String pokemon) throws IOException, InterruptedException;


}
