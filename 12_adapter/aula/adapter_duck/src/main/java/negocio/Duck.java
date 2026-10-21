package negocio;

public class Duck implements IDuck {
    protected String name;
    protected double height;
    protected double weight;
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public void quack() {
        this.quackBehavior.performQuack();
    }
    @Override
    public void fly() {
        this.flyBehavior.performFly();
    }
    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    @Override
    public void swim() {
        System.out.println("pato nadando...");
    }

    


    

}
