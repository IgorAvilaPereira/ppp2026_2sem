package exe_strategy2;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import exe_observer.Observer;
import exe_observer.Subject;

public class Pedido implements Subject {
    private UUID nroNota;
    private double valorTotal;
    private IFrete frete;
    private Cliente cliente;
    private Status status;
    private List<Observer> vetObservers;
   

    public Pedido(Cliente cliente, double valorTotal){
        this.nroNota = UUID.randomUUID();
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.frete = new FretePAC();
        this.vetObservers = new ArrayList<Observer>();
        this.status = Status.PAGO;
        this.addObserver(cliente);

    }


    public UUID getNroNota() {
        return nroNota;
    }


    public void setNroNota(UUID nroNota) {
        this.nroNota = nroNota;
    }


    public double getValorTotal() {
        return valorTotal;
    }


    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }


    public IFrete getFrete() {
        return frete;
    }


    public void setFrete(IFrete frete) {
        this.frete = frete;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double valorFrete(double peso, double distancia){
        return this.frete.calcular(peso, distancia);
    }


    public Status getStatus() {
        return status;
    }


    // public void setStatus(Status status) {
    //     this.status = status;
    // }


    @Override
    public void addObserver(Observer observer) {
        this.vetObservers.add(observer);
    }


    @Override
    public void removeObserver(Observer observer) {
        this.vetObservers.remove(observer);
    }


    @Override
    public void removeObserver(int pos) {
        this.vetObservers.remove(pos);
    }


    @Override
    public void notifyObservers() {
        for (int i = 0; i < this.vetObservers.size(); i++){
            this.vetObservers.get(i).update(this);
        }
        
    }


    @Override
    public void changeState(Status status) {
        this.status = status;
        this.notifyObservers();
    }

    


}
