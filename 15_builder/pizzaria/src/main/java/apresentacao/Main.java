package apresentacao;

import negocio.Pizza;

public class Main {
    public static void main(String[] args) {
        // Pizza pizza = new Pizza(false, false, false, false, 0, null);

        Pizza pizza = new Pizza.PizzaBuilder().comAzeitona(false).qtdeQueijo(100).build();
        System.out.println(pizza);
    }
}