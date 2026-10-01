package exe_state;

public class MainState {
    public static void main(String[] args) {
        Maquina maquina = new Maquina(10);
        System.out.println(maquina.getEstado().getClass().getSimpleName());
        maquina.inserirDinheiro();
        System.out.println(maquina.getEstado().getClass().getSimpleName());
        maquina.cancelar();
        System.out.println(maquina.getEstado().getClass().getSimpleName());
        maquina.inserirDinheiro();
        System.out.println(maquina.getEstado().getClass().getSimpleName());
    }
}
