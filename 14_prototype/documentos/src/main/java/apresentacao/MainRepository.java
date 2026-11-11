package apresentacao;

import negocio.Documento;
import negocio.Repository;

public class MainRepository {
    public static void main (String args[]) {
        Repository repository = Repository.getInstance();
        Documento d1 = repository.getDocumento("documentoJPG");
        d1.setLocalizacao("/home/iapereira/imagens/");
        Documento d2 = repository.getDocumento("documentoJPG");
        System.out.println(d1.getTipo());
        System.out.println(d2.getTipo());
        System.out.println(d1.getLocalizacao());
        System.out.println(d2.getLocalizacao());
        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());
        repository.addDocumento("documentoJPG2", d1);
        Documento d3 = repository.getDocumento("documentoJPG2");
        System.out.println(d3.getLocalizacao());

        Repository repository2 = Repository.getInstance();
        Documento d4 = repository2.getDocumento("documentoJPG2");
        System.out.println(d4.getLocalizacao());
    }

}
