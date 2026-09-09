package restaurante_ppp2026_2sem;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String vetAlmoco[] = { "File", "Torradão", "Bacon com Fritas" };
        List<String> vetCafe = List.of("Café", "ovos com bacon", "leite", "suco de laranja");
        // printCardapio(vetCafe.iterator());
        // printCardapio(new CafeInvertidoIterator(vetCafe));
        printCardapio(new CafeComOIterator(vetCafe));
        System.out.println("---------------------");
        printCardapio(new RefeicoesDoAlmocoIterator(vetAlmoco));
        System.out.println("--------------");
        printCardapio(new JantaIterator());



        // for (String string : vetCafe) {
        // System.out.println(string);
        // }
        // for (int i = 0; i < vetAlmoco.length; i++) {
        // System.out.println(vetAlmoco[i]);
        // }

    }

    private static void printCardapio(Iterator<?> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}