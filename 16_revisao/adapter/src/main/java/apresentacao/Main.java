package apresentacao;

import negocio.PagamentoAdapter;

public class Main {
    public static void main(String[] args) {
        PagamentoAdapter pagamentoAdapter = new PagamentoAdapter();
        pagamentoAdapter.pagar(1000);
    }
}