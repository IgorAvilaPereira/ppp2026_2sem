package negocio;

public class NotificacaoBasica implements Notificacao {


    @Override
    public boolean enviar(String mensagem) {
        System.out.println("Enviando :"+mensagem);
        return true;
    }

}
