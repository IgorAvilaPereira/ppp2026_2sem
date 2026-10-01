package exe_state;

public class Maquina {
    private int qtde;
    private String marca;
    private int voltagem;
    private Estado estado;
    private double dinheiro;

    public Maquina(double dinheiro) {
        this.dinheiro = dinheiro;
        this.estado = new ComProduto();

    }

    public int getQtde() {
        return qtde;
    }
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getVoltagem() {
        return voltagem;
    }
    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    public Estado getEstado() {
        return estado;
    }
    // public void setEstado(Estado estado) {
    //     this.estado = estado;
    // }

    public void selecionarProduto(){
        this.estado = this.estado.selecionarProduto(this);
    }
    
    public void inserirDinheiro(){
        this.estado = this.estado.inserirDinheiro(this, this.dinheiro);
    }

    public void cancelar(){
        this.estado = this.estado.cancelar(this);
    }

    public void liberarProduto(){
        this.estado = this.estado.liberarProduto(this);
    }

    

}
