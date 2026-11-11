package negocio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Documento /*implements Cloneable*/ {
    private int id;
    private String nome;
    private String localizacao;
    private String permissao;
    private String tipo;
    private Usuario criador;
    private List<String> softwaresCompativeis;

    public Documento(){
        this.criador = new Usuario();
        this.criador.setNome("Igor");
        this.softwaresCompativeis = new ArrayList<String>();
        this.softwaresCompativeis.add("Bloco de Notas");
        this.softwaresCompativeis.add("Word");
    }

    

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public String getPermissao() {
        return permissao;
    }
    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Usuario getCriador() {
        return criador;
    }
    public void setCriador(Usuario criador) {
        this.criador = criador;
    }

    public Documento clone() {
        Documento d1 = new Documento();
        d1.setCriador(this.getCriador());
        d1.setId(this.getId());
        d1.setLocalizacao(this.getLocalizacao());
        d1.setPermissao(this.getPermissao());
        d1.setTipo(this.getTipo());
        d1.setNome(this.getNome());
        d1.softwaresCompativeis = new ArrayList<String>();
        for (String software : this.getSoftwaresCompativeis()) {
            d1.softwaresCompativeis.add(software);            
        }
        return d1;
    }

/* 
    @Override 
    public Documento clone(){
        try {
            return (Documento) super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
*/


    public List<String> getSoftwaresCompativeis() {
        return softwaresCompativeis;
    }



    public void setSoftwaresCompativeis(List<String> softwaresCompativeis) {
        this.softwaresCompativeis = softwaresCompativeis;
    }

    



}
