package exe_state;

/**
 * Cancela
 */
public class Cancela implements Estado {

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
        return this;
    }

    @Override
    public Estado liberarProduto(Maquina maquina) {
        return this;
    }

}
