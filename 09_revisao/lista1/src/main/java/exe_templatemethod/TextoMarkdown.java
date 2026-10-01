package exe_templatemethod;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextoMarkdown extends Texto {

    @Override
    public String formatacao(String texto) {
        return "### "+texto;
    }

    @Override
    public void gravacao(String conteudo, String nome, String extensao) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("lista1/src/main/resources/"+nome+"."+extensao))) {
            bw.write(this.formatacao(conteudo) + this.rodape());
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao gravar o arquivo: " + e.getMessage());
        }
    }

}
