package negocio;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

import org.json.JSONObject;

// Concrete Subject
public class DefesaCivil implements Subject {
    private ArrayList<Observer> vetObserver;
    private String climaAtual;

    public DefesaCivil() {
        this.vetObserver = new ArrayList<Observer>();
    }

    public void changedState() {
        this.climaAtual = "0";
        // Exemplo de coordenadas para Rio Grande - RS
        // double latitude = -32.035;
        // double longitude = -52.0986;

        // Coordenadas de Rio Grande - RS
        // double latitude = -32.03;
        // double longitude = -52.10;

        // URL configurada para trazer dados atuais, horários e diários de chuva/vento
        String urlString = String.format(Locale.US,
                "https://api.open-meteo.com/v1/forecast?latitude=-32.035&longitude=-52.0986&hourly=temperature_2m");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlString))
                .GET()
                .build();

        try {
            // System.out.println("Buscando previsão do tempo...\n");
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                String jsonResponse = response.body();
                JSONObject jsonObject = new JSONObject(jsonResponse);

                int pos = new Random().nextInt(10);
                if (!this.climaAtual.trim().equals(jsonObject.getJSONObject("hourly").getJSONArray("temperature_2m").get(pos).toString().trim())) {
                    this.climaAtual = jsonObject.getJSONObject("hourly").getJSONArray("temperature_2m").get(pos)
                            .toString().trim();
                                    this.notifyObservers();

                    // System.out.println(": " +
                    // jsonObject.getJSONObject("hourly").getJSONArray("temperature_2m").get(0));

                    // Exibe o JSON bruto retornado pela API contendo todos os blocos de dados
                    // System.out.println("=== DADOS METEOROLÓGICOS RECEBIDOS ===");
                    // System.out.println(jsonResponse);
                    // System.out.println("=======================================");

                    // Alerta simulado com base no weather_code crítico (ex: tempestades/ciclone)
                    // System.out
                    // .println("\n[Aviso de Processamento]: Para separar as tabelas horárias e
                    // diárias deste JSON, " +
                    // "recomenda-se o uso de uma biblioteca de parse como Jackson ou Gson.");
                }
            } else {
                System.out.println("Erro na requisição. Status: " + response.statusCode());
            }

        } catch (Exception e) {
            System.err.println("Erro ao conectar com a API: " + e.getMessage());
        }

    }

    @Override
    public void addObserver(Observer observer) {
        this.vetObserver.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.vetObserver.remove(observer);
    }

    @Override
    public void removeObserver(int pos) {
        this.vetObserver.remove(pos);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.vetObserver) {
            observer.update("Mudando de clima:" + this.climaAtual);

        }
    }

}
