package negocio;

import java.io.IOException;

public class DigimonAdapter implements PokeApiSubject {
    private DigimonAPI digimonAPI;

    public DigimonAdapter(DigimonAPI digimonAPI) {
        this.digimonAPI = digimonAPI;
    }

    @Override
    public String request(String pokemon) throws IOException, InterruptedException {
        return this.digimonAPI.request_digimon(pokemon);
    }
    
}
