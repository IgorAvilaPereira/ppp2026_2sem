package negocio;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void performFly() {
        System.out.println("Voando com as asas - modo padrão!");
    }

}
