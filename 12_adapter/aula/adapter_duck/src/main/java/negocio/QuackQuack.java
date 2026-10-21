package negocio;

public class QuackQuack implements QuackBehavior {

    @Override
    public void performQuack() {
        System.out.println("Quack Quack!");
    }

}
