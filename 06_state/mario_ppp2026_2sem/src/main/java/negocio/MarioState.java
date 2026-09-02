package negocio;

/**
 * MarioState
 */
public interface MarioState {
    public MarioState pegouCogumelo();
    public MarioState pegouPena();
    public MarioState levouDano();
    public MarioState pegouFlor();
    // extras
    public MarioState pegouEstrela(Mario mario);
    

}
