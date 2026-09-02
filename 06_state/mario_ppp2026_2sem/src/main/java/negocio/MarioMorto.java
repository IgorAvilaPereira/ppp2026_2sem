package negocio;

/**
 * MarioMorto
 */
public class MarioMorto implements MarioState {

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
        return this;
    }

    @Override
    public MarioState pegouFlor() {
        return this;
    }

    @Override
    public MarioState pegouEstrela(Mario mario) {
        return new MarioEstrela(mario);
    }

}
