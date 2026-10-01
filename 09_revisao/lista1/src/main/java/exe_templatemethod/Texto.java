package exe_templatemethod;


public abstract class Texto {

    public final void organizarTexto(String nome, String texto, String extensao){
        this.gravacao(this.formatacao(texto)+rodape(), nome, extensao);
        
    }

    protected String rodape() {
        return "meu rodape";
    }

    protected  abstract String formatacao(String texto);
    protected  abstract void gravacao(String conteudo, String nome, String extensao);

}
