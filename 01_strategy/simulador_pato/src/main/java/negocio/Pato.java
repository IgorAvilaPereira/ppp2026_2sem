package negocio;

public abstract class Pato {
    private int id;
    private String nome;
    private double peso;
    private double altura;
    private Voo voo;
    private Barulho barulho;

    
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
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void voar(){
        this.voo.realizarVoo();
    }

    public void barulhar(){
        this.barulho.emitirBarulho();
    }
    public Voo getVoo() {
        return voo;
    }
    public void setVoo(Voo voo) {
        this.voo = voo;
    }
    public Barulho getBarulho() {
        return barulho;
    }
    public void setBarulho(Barulho barulho) {
        this.barulho = barulho;
    }

    

}
