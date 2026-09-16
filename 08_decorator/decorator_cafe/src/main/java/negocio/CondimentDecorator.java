package negocio;

public class CondimentDecorator extends Beverage {
    private Beverage beverage;
    // private static int qtde = 0;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public  String getDescription() {
        
        // if (++qtde > 2) throw new IllegalArgumentException("Deu xabum!");
        return this.beverage.getDescription() + "\n" + this.description;
    }

    @Override
    public  double cost() {
        return this.cost + this.beverage.cost();
    }

    public Beverage removeItem() {
        return beverage;
    }
   
   

}
