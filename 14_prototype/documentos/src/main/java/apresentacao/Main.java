package apresentacao;

import negocio.Documento;

public class Main {
    public static void main(String[] args) {

        Documento prototipo = new Documento();
        prototipo.setPermissao("755");
        prototipo.setLocalizacao("/home/iapereira/");
        // Documento documentoNovo = prototipo.clone();

        Documento documentoNovo = prototipo.clone();
        documentoNovo.getSoftwaresCompativeis().add("Winrar");

        Documento documentoNovo2 = documentoNovo.clone();

        System.out.println(String.join(";", prototipo.getSoftwaresCompativeis()));
        System.out.println(String.join(";", documentoNovo.getSoftwaresCompativeis()));
        System.out.println(String.join(";", documentoNovo2.getSoftwaresCompativeis()));

        System.out.println(prototipo.getLocalizacao());
        System.out.println(documentoNovo.getLocalizacao());
        documentoNovo.setLocalizacao("/tmp/");
        System.out.println(documentoNovo.getLocalizacao());
        System.out.println(prototipo.getLocalizacao());
        System.out.println(prototipo.hashCode());
        System.out.println(documentoNovo.hashCode());
        System.out.println(documentoNovo2.hashCode());

    }
}