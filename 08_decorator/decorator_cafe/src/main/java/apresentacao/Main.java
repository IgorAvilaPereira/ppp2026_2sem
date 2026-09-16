package apresentacao;

import negocio.*;

public class Main {
    public static void main(String[] args) {
        Beverage bebida1 = new Espresso();
        bebida1 = new Sugar(bebida1);
        bebida1 = new Sugar(bebida1);
        bebida1 = new Sugar(bebida1);
        bebida1 = bebida1.removeItem();
        bebida1 = bebida1.removeItem();

        // bebida1 = new Sugar(bebida1);
        // bebida1 = new Sugar(bebida1);
        // bebida1 = new Sugar(bebida1);
        // bebida1 = new Sugar(bebida1);
        // bebida1 = new Sugar(bebida1);
        // bebida1 = new Sugar(bebida1);

        System.out.println(bebida1.getDescription()+"\n"+bebida1.cost());
    }
}