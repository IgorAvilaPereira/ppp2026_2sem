package negocio;

public class PagamentoAdapter implements Pagamento {
    private PagamentoExterno pagamentoExterno;

    public PagamentoAdapter() {
        this.pagamentoExterno = new PagamentoExterno();
    }

    @Override
    public void pagar(double valor) {
        this.pagamentoExterno.realizarPagamento(valor);
    }

}
