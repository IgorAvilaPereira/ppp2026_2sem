package exe_strategy2;

import exe_observer.Observer;

public class ReceitaFederal implements Observer<Pedido> {

    @Override
    public void update(Pedido t) {
        System.out.println("Nós como Receita federal ficamos sabendo da movimentação de status do pedido:"+t.getNroNota().toString());
    }

}
