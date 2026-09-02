package negocio;

/**
 * MarioFlor
 */
public class MarioFlor implements MarioState {
    private static MarioFlor INSTANCE = new MarioFlor();

    private MarioFlor() {

    }

    public synchronized static MarioFlor getInstance() {
        return INSTANCE;
    }

    @Override
    public MarioState pegouCogumelo() {
        return this;
    }

    @Override
    public MarioState pegouPena() {
        return new MarioPena();
    }

    @Override
    public MarioState levouDano() {
        return new MarioPequeno();
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
