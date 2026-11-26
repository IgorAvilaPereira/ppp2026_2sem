package apresentacao;

import negocio.Notificacao;
import negocio.NotificacaoBasica;
import negocio.NotificacaoEmail;
import negocio.NotificacaoSMS;

public class Main {
    public static void main(String[] args) {
        Notificacao notificacao = new NotificacaoBasica();
        notificacao = new NotificacaoSMS(notificacao, "53999999", "51999999");
        notificacao = new NotificacaoEmail(notificacao, "igor.pereira@riogrande.ifrs.edu", "luciano@riogrande.ifrs.edu.br" );
        notificacao.enviar("oi");
    }
}