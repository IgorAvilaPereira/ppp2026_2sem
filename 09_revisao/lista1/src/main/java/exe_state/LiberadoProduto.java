package exe_state;

/**
 * LiberadoProduto
 */
public class LiberadoProduto implements Estado {

    @Override
    public Estado selecionarProduto(Maquina maquina) {
        return this;
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
        return this;
    }

}
