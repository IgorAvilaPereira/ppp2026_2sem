package negocio;

import java.time.LocalDate;

public class Usuario {
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private LocalDate dataNascimento;
    private boolean administrador;

    private Usuario(String nome, String email, String telefone, String endereco, LocalDate dataNascimento,
            boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.administrador = administrador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public static class UsuarioBuilder {
        private String nome;
        private String email;
        private String telefone;
        private String endereco;
        private LocalDate dataNascimento;
        private boolean administrador;

        public UsuarioBuilder(String nome, String email) {
            this.nome = nome;
            this.email = email;
        }

        public UsuarioBuilder telefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public UsuarioBuilder endereco(String endereco) {
            this.endereco = endereco;
            return this;
        }
        
        public UsuarioBuilder dataNascimento(LocalDate date) {
            this.dataNascimento = date;
            return this;
        }

        public UsuarioBuilder administrador(boolean b) {
            this.administrador = b;
            return this;
        }

        public Usuario build(){
            return new Usuario(nome, email, telefone, endereco, dataNascimento, administrador);
        }

    }
}
