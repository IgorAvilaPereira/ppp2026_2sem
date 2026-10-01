package exe_state;

/**
 * Estado
 */
public interface Estado {
    Estado selecionarProduto(Maquina maquina);

    Estado inserirDinheiro(Maquina maquina, double valor);

    Estado cancelar(Maquina maquina);

    Estado liberarProduto(Maquina maquina);
}
