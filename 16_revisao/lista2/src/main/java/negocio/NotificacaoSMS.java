package negocio;

public class NotificacaoSMS extends  Decorator {
    private String remetente;
    private String destinatario;

    public NotificacaoSMS(Notificacao notificacao, String remetente, String destinatario) {
        super(notificacao);
        this.remetente = remetente;
        this.destinatario = destinatario;
    }

    @Override
    public boolean enviar(String mensagem) {
        System.out.println("Enviando via sms:"+remetente +" >> " + destinatario);
        notificacao.enviar(mensagem);
        return true;
    }

}
