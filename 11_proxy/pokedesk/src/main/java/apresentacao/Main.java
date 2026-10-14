package apresentacao;

import com.google.gson.JsonObject;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

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

        System.out.println(imagemUrl);

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

            
      
    }
}
