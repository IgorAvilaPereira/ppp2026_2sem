package apresentacao;

import negocio.Duck;
import negocio.FlyWithWings;
import negocio.IDuck;
import negocio.QuackQuack;
import negocio.Turkey;
import negocio.TurkeyAdapter;

public class Main {
    public static void main(String[] args) {
        Duck pato = new Duck();
        pato.setName("PatoDonald");
        pato.setFlyBehavior(new FlyWithWings());
        pato.setQuackBehavior(new QuackQuack());
        pato.fly();

        Turkey peru = new Turkey();
        TurkeyAdapter peruAdaptado = new TurkeyAdapter(peru);
        peruAdaptado.quack();
        peruAdaptado.fly();
        peruAdaptado.swim();

        if (pato instanceof IDuck) {
            System.out.println("pato eh pato");
        }
        if (peruAdaptado instanceof IDuck) {
            System.out.println("É peru mais parece ser um pato");
        }
    }
}