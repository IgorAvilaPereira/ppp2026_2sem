package negocio;

import java.util.HashMap;
import java.util.Map;

public class Repository {
    private static Repository INSTANCE = new Repository();

    private Map<String, Documento> vetPrototipos;

    private Repository(){
        this.vetPrototipos = new HashMap<String, Documento>();

        Documento documentoWord = new Documento();
        documentoWord.setPermissao("777");
        documentoWord.setLocalizacao("/home/iapereira/Documents/");
        documentoWord.setTipo(".docx");

        Documento documentoJPG = new Documento();
        documentoJPG.setLocalizacao("/home/iapereira/Pictures/");
        documentoJPG.setTipo(".jpg");

        this.vetPrototipos.put("documentoJPG", documentoJPG);
        this.vetPrototipos.put("documentoWord", documentoWord);



    }

    public static synchronized Repository getInstance() {
        return INSTANCE;
    }

    public void removeDocumento(String nome) {
        this.vetPrototipos.remove(nome);
    }

    public void addDocumento(String nome, Documento documento) {
        this.vetPrototipos.put(nome, documento);
    }

    public Documento getDocumento(String nome)  {
        try {
            return this.vetPrototipos.get(nome).clone();
        } catch (Exception e) {
            throw new IllegalArgumentException("tipo de prototipo invalido");

        }
    }

}
