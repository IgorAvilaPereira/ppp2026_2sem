package exe_strategy2;


public class MainStrategyObserver {
    public static void main(String[] args) {
        Cliente igor = new Cliente("Igor Pereira");        
        igor.setCpf("000000000");
        igor.setEmail("igor.pereira@riogrande.ifrs.edu.br");

        Pedido pedidoIgor = new Pedido(igor, 100);
        pedidoIgor.addObserver(new Cliente("Patroa"));
        pedidoIgor.addObserver(new ReceitaFederal());
        pedidoIgor.setFrete(new FreteDrone());
        System.out.println(pedidoIgor.valorFrete(1, 100));
        pedidoIgor.changeState(Status.ENVIADO);

    }
}