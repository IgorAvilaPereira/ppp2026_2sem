package negocio;

/**
 * MarioPequeno
 */
public class MarioPequeno implements MarioState {

    @Override
    public MarioState pegouCogumelo() {
        return new MarioGrande();
    }

    @Override
    public MarioState pegouPena() {
        return new MarioPena();
    }

    @Override
    public MarioState levouDano() {
        return new MarioMorto();
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
