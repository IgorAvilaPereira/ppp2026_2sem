package negocio;

public class QuackQuack implements Barulho {

    @Override
    public void emitirBarulho() {
        System.out.println("Quack quack");
    }

}
