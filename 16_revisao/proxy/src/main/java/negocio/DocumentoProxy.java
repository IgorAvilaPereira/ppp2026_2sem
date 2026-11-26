package negocio;

public class DocumentoProxy implements Documento {
    protected DocumentoReal documentoReal;

    public DocumentoProxy(String username, String password, String caminho) {
        if (username.equals("igor") && password.equals("igor")) {
            this.documentoReal = new DocumentoReal();
            this.documentoReal.setCaminho(caminho);
        } else {
            throw new IllegalAccessError("deu xabum!");
        }

    }

    @Override
    public void exibir() {
        this.documentoReal.exibir();
    }

}
