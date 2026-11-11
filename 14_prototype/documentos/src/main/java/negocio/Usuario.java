package negocio;

import java.time.LocalDateTime;

/**
 * Usuario
 */
public class Usuario {
    private int id;
    private String nome;
    private LocalDateTime ultimoAcesso;

    public Usuario(){
        this.ultimoAcesso = LocalDateTime.now();
    }

    public Usuario(String nome) {
        this();
        this.nome = nome;

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

    public LocalDateTime getUltimoAcesso() {
        return ultimoAcesso;
    }

    public void setUltimoAcesso(LocalDateTime ultimoAcesso) {
        this.ultimoAcesso = ultimoAcesso;
    }

    

}
