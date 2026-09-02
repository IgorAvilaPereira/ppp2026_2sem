package negocio;

/**
 * MarioPena
 */
public class MarioPena implements MarioState {

    @Override
    public MarioState pegouCogumelo() {
        return this;
    }

    @Override
    public MarioState pegouPena() {
        return this;
    }

    @Override
    public MarioState levouDano() {
        return new MarioGrande();
    }

    @Override
    public MarioState pegouFlor() {
        return MarioFlor.getInstance();
    }

     @Override
    public MarioState pegouEstrela(Mario mario) {
        return new MarioEstrela(mario);
    }

}
