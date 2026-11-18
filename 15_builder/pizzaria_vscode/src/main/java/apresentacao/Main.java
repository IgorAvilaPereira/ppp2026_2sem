package apresentacao;

import negocio.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza p = new Pizza.Builder().azeitona(false).build();
    }
}