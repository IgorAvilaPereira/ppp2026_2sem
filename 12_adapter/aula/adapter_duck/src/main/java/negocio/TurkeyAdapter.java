package negocio;

public class TurkeyAdapter implements IDuck{
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        System.out.println(this.turkey.gobble());
    }

    @Override
    public void fly() {
        System.out.println(this.turkey.flyLikeTurkey());
    }

    @Override
    public void swim() {
        throw new UnsupportedOperationException("No simulador Peru não nada - mesmo sendo adaptado como Pato");
    }

}
