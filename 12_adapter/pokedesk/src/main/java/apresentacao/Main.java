package apresentacao;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import com.google.gson.JsonObject;

import negocio.DigimonAPI;
import negocio.DigimonAdapter;
import negocio.PokeApiProxy;

public class Main {
    public static void main(String[] args) throws Exception {
        PokeApiProxy pokeApiProxy = new PokeApiProxy();
        String resposta = pokeApiProxy.request("charmander");
        JsonObject objeto = com.google.gson.JsonParser.parseString(resposta).getAsJsonObject();
        String imagemUrl = objeto
            .getAsJsonObject("sprites")
            .getAsJsonObject("other")
            .getAsJsonObject("home")
            .get("front_shiny")
            .getAsString();

        DigimonAdapter digimonAdapter = new DigimonAdapter(new DigimonAPI());
        JsonObject objetoDigimon = com.google.gson.JsonParser.parseString(digimonAdapter.request("Angemon")).getAsJsonObject();
        // System.out.println(objetoDigimon.toString());
        String imagemUrlDigimon =  objetoDigimon.getAsJsonArray("images")
                               .get(0).getAsJsonObject()
                               .get("href").getAsString();
      

        SwingUtilities.invokeLater(() -> {
            try {
                JFrame janela = new JFrame("Meu Pokémon");
                janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                janela.add(new JLabel(new ImageIcon(new URL(imagemUrl))));
                janela.pack();
                janela.setLocationRelativeTo(null);
                janela.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });


         SwingUtilities.invokeLater(() -> {
            try {
                JFrame janela = new JFrame("Meu Digimon");
                janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                janela.add(new JLabel(new ImageIcon(new URL(imagemUrlDigimon))));
                janela.pack();
                janela.setLocationRelativeTo(null);
                janela.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

            
      
    }
}
