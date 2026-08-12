package negocio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Exportador {

    protected String nomeArquivo;
    protected ArrayList<Pessoa> vetPessoa;

    public Exportador(){
        this.vetPessoa = new ArrayList<Pessoa>();
    }

    public final void exportar(String nomeArquivo){
        this.nomeArquivo = nomeArquivo;
        lerArquivo();        
        gancho();
        gravar(transformar());
    }

    protected void gancho() {
    }

    protected void gravar(String output) {
        try (FileWriter escritor = new FileWriter("exportador/src/main/resources/output."+this.getClass().getSimpleName().replace("Exportar", "").toLowerCase())) {
            escritor.write(output);
            System.out.println("Arquivo salvo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }

    abstract String transformar();

    private void lerArquivo() {
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            linha = br.readLine();
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(";");
                String cpf = campos[0];
                String nome = campos[1];
                String endereco = campos[2];
                this.vetPessoa.add(new Pessoa(cpf, nome, endereco));
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    } 

}
