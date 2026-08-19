package negocio;

public class TvCCE {
    private int voltagem;
    private int volumeAtual;
    private boolean ligada;
    private int canal;
    // ....
    private int brilho;
    private boolean modoSleep;

    public TvCCE(){
        this.ligada = false;
    }

    public int getVoltagem() {
        return voltagem;
    }
    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    public int getVolumeAtual() {
        return volumeAtual;
    }
    public void setVolumeAtual(int volumeAtual) {
        this.volumeAtual = volumeAtual;
    }
    public boolean isLigada() {
        return ligada;
    }
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    public int getBrilho() {
        return brilho;
    }
    public void setBrilho(int brilho) {
        this.brilho = brilho;
    }
    public boolean isModoSleep() {
        return modoSleep;
    }
    public void setModoSleep(boolean modoSleep) {
        this.modoSleep = modoSleep;
    }


    

}
