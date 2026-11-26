package apresentacao;

import negocio.DocumentoProxy;

public class Main {
    public static void main(String[] args) {
        DocumentoProxy documentoProxy = new DocumentoProxy("igor","igor", "/home/iapereira/igor.jpg");
        documentoProxy.exibir();
    }
}