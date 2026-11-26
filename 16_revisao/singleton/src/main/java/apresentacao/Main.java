package apresentacao;


import negocio.Configuracao;

public class Main {
    public static void main(String[] args) {

        Configuracao conf = Configuracao.getInstance();
        conf.setAmbiente("windows");

        System.out.println(conf.hashCode());

        Configuracao conf2 = Configuracao.getInstance();

        System.out.println(conf2.hashCode());

        System.out.println(conf2.getAmbiente());
    }
}