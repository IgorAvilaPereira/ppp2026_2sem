package apresentacao;

import negocio.Categoria;
import negocio.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Samsung", 1.99, new Categoria("eletro"));

        Produto tvLg = produto.clone();
        tvLg.setNome("Tv Lg");
        tvLg.getCategoria().setDescricao("cozinha");
        

        System.out.println(produto.getCategoria().getDescricao());
        System.out.println(tvLg.getCategoria().getDescricao());
    }
}