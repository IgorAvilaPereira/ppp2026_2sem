package negocio;

/**
 * MarioEstrela
 */
public class MarioEstrela implements MarioState {

    private Mario mario;

    public MarioEstrela(Mario mario) {      
        this.mario = mario;
        permanencia();
    }

    private void permanencia() {
        try {
            System.out.println(this.getClass().getSimpleName());
            MarioState estadoAtual = mario.getEstadoAtual();
            mario.setEstadoAtual(this);
            Thread.sleep(5000);
            mario.setEstadoAtual(estadoAtual);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public MarioState pegouCogumelo() {
        // permanencia();
        return this;
    }

    @Override
    public MarioState pegouPena() {
        // permanencia();

        return this;

    }

    @Override
    public MarioState levouDano() {
        // permanencia();

        return this;

    }

    @Override
    public MarioState pegouFlor() {
        // permanencia();

        return this;

    }

    @Override
    public MarioState pegouEstrela(Mario mario) {
        // permanencia();

        return this;

    }

}
