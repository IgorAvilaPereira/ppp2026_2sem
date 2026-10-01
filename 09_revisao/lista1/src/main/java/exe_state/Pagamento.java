package exe_state;

/**
 * Pagamento
 */
public class Pagamento implements  Estado {

    @Override
    public Estado selecionarProduto(Maquina maquina) {
        return new LiberadoProduto();
    }

    @Override
    public Estado inserirDinheiro(Maquina maquina, double valor) {
        return this;
    }

    @Override
    public Estado cancelar(Maquina maquina) {
        return new Cancela();
    }

    @Override
    public Estado liberarProduto(Maquina maquina) {
        return new LiberadoProduto();
    }

}
