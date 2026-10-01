package exe_strategy2;

import exe_observer.Observer;

/**
 * Cliente
 */
public class Cliente implements Observer<Pedido> {
    private int id;
    private String cpf;
    private String nome;
    private String email;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
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
    @Override
    public void update(Pedido t) {
        System.out.println(this.nome +": ficou sabendo que o novo status é:"+t.getStatus().name());
    }

    


}
