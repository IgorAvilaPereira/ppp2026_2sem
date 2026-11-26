package negocio;

public class Configuracao {
    private static final Configuracao INSTANCE = new Configuracao();

    private String versao;
    private String so;
    private String ambiente;

    private Configuracao() {}


    public String getVersao() {
        return versao;
    }
    public void setVersao(String versao) {
        this.versao = versao;
    }
    public String getSo() {
        return so;
    }
    public void setSo(String so) {
        this.so = so;
    }
    public String getAmbiente() {
        return ambiente;
    }
    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public static synchronized Configuracao getInstance(){
        return INSTANCE;
    }
    

}
