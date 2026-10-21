package negocio;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DigimonAPI {
    public static final String URL = "https://digi-api.com/api/v1/digimon/";

    public String request_digimon(String name) throws IOException, InterruptedException{
              // 1. Criar o cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        // 2. Construir a requisição
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL+name))
                .GET()
                .build();

        // 3. Enviar a requisição e obter a resposta
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // 4. Imprimir o resultado
        // System.out.println("Status: " + response.statusCode());
        // System.out.println("Corpo: " + response.body());
    
        return  response.body();
    }

}
