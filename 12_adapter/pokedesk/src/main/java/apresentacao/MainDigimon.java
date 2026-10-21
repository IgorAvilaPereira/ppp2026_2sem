package apresentacao;

import java.io.IOException;

import negocio.DigimonAPI;

public class MainDigimon {
    public static void main(String[] args) throws IOException, InterruptedException {
        DigimonAPI digimonAPI = new DigimonAPI();
        System.out.println(digimonAPI.request_digimon("Angewomon"));
    }

}
