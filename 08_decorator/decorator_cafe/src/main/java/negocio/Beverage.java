package negocio;

public abstract class Beverage {
    protected String description;
    protected double cost;

    public abstract String getDescription();

    public abstract double cost();

    public Beverage removeItem() {
        return null;
    }
}
