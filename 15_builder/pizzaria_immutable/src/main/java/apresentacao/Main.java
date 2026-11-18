package apresentacao;

import java.util.List;

import org.immutables.value.Value.Immutable;

import negocio.Pizza;

public class Main {
    public static void main(String[] args) {

        Pizza p = Pizza.pizza(false, false, false, false, 0, null);
    }
}