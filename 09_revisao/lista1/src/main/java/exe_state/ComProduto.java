package exe_state;

/**
 * ComProduto
 */
public class ComProduto implements Estado {

    @Override
    public Estado selecionarProduto(Maquina maquina) {
        return this;
    }

    @Override
    public Estado inserirDinheiro(Maquina maquina, double valor) {
        return new Pagamento();
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
