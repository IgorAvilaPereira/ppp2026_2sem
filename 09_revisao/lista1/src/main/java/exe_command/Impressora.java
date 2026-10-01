package exe_command;

public class Impressora {
    private String marca;
    private String modelo;
    private double nivelTinta;
    private Command comando;


    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getNivelTinta() {
        return nivelTinta;
    }
    public void setNivelTinta(double nivelTinta) {
        this.nivelTinta = nivelTinta;
    }
    public Command getComando() {
        return comando;
    }
    public void setComando(Command comando) {
        this.comando = comando;
    }

    public void realizarComando() {
        this.comando.execute();
    }

    
    

}
