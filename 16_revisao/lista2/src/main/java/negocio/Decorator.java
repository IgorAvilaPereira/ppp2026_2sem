package negocio;

public abstract class Decorator implements Notificacao {
    protected Notificacao notificacao;

    public Decorator(Notificacao notificacao) {
        this.notificacao = notificacao;
    }
    

}
