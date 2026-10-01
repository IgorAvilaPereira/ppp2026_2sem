package exe_command;

/**
 * Documento
 */
public class Documento {
    private String nome;
    private double tamanho;
    private String conteudo;
    private String caminho;
    private String extensao;
    

    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getTamanho() {
        return tamanho;
    }


    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }


    public String getConteudo() {
        return conteudo;
    }


    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }


    public String getCaminho() {
        return caminho;
    }


    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }


    public String getExtensao() {
        return extensao;
    }


    public void setExtensao(String extensao) {
        this.extensao = extensao;
    }


    public String getNome() {
        return this.nome;

    }

}
