package negocio;

public class Mario {
    private int nroVidas;
    private int faseAtual;
    private String mundoAtual;
    private MarioState estadoAtual;

    public Mario() {
        this.estadoAtual = new MarioPequeno();
    }

    public void cogumelo() {
        this.estadoAtual = this.estadoAtual.pegouCogumelo();
    }

    public void pena() {
        this.estadoAtual = this.estadoAtual.pegouPena();
    }

    public void flor() {
        this.estadoAtual = this.estadoAtual.pegouFlor();
    }

    public void dano() {
        this.estadoAtual = this.estadoAtual.levouDano();
    }

    public void estrela(){
                System.out.println(this.getEstadoAtual().getClass().getSimpleName());

        this.estadoAtual.pegouEstrela(this);

                System.out.println(this.getEstadoAtual().getClass().getSimpleName());


    }

    public int getNroVidas() {
        return nroVidas;
    }

    public void setNroVidas(int nroVidas) {
        this.nroVidas = nroVidas;
    }

    public int getFaseAtual() {
        return faseAtual;
    }

    public void setFaseAtual(int faseAtual) {
        this.faseAtual = faseAtual;
    }

    public String getMundoAtual() {
        return mundoAtual;
    }

    public void setMundoAtual(String mundoAtual) {
        this.mundoAtual = mundoAtual;
    }

    public MarioState getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(MarioState estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

}
