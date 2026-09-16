package negocio;

public class Milk extends CondimentDecorator{
    private String marca;



    public Milk(Beverage beverage) {
        super(beverage);
        this.cost = 10.00;
        this.description = "Leite";
        this.marca = "Elege";
    }



    public String getMarca() {
        return marca;
    }



    public void setMarca(String marca) {
        this.marca = marca;
    }

    
}
