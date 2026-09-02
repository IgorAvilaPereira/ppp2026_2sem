package negocio;

/**
 * MarioGrande
 */
public class MarioGrande implements MarioState {

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
        return MarioFlor.getInstance();

    }

   @Override
    public MarioState pegouEstrela(Mario mario) {
        return new MarioEstrela(mario);
    }

}
