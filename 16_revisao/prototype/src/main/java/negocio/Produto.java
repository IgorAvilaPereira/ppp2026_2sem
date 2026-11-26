package negocio;

public class Produto implements Cloneable {
    private String nome;
    private double preco;
    private Categoria categoria;

    
   
    public Produto(String nome, double preco, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", categoria=" + categoria.getDescricao() + "]";
    }


    public Produto clone(){
        return new Produto(this.nome, this.preco, new Categoria(this.getCategoria().getDescricao()));
    }
    
}