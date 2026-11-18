package apresentacao;

import negocio.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = Pizza.builder().azeitona(false).cebola(false).build();
        System.out.println(pizza);
    }
}