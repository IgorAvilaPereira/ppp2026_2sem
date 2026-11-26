package negocio;

public class NotificacaoEmail extends  Decorator {
    private String remetente;
    private String destinatario;

    public NotificacaoEmail(Notificacao notificacao, String remetente, String destinatario) {
        super(notificacao);
        this.remetente = remetente;
        this.destinatario = destinatario;
    }

    @Override
    public boolean enviar(String mensagem) {
        System.out.println("Enviando via email:"+remetente +" >> " + destinatario);
        notificacao.enviar(mensagem);
        return true;
    }

}
