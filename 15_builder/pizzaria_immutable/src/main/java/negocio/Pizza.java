package negocio;


import org.immutables.value.Value;
import org.immutables.builder.Builder;

@Value.Immutable
public class Pizza {
    private boolean cebola;
    private boolean tomate;
    private boolean palmito;
    private boolean azeitona;
    private double qtdeQueijo;
    private Tamanho tamanho;


    private Pizza(boolean cebola, boolean tomate, boolean palmito, boolean azeitona, double qtdeQueijo,
            Tamanho tamanho) {
        this.cebola = cebola;
        this.tomate = tomate;
        this.palmito = palmito;
        this.azeitona = azeitona;
        this.qtdeQueijo = qtdeQueijo;
        this.tamanho = tamanho;
    }

    @Builder.Factory
    public static Pizza pizza(boolean cebola, boolean tomate, boolean palmito, boolean azeitona,
            double qtdeQueijo, Tamanho tamanho) {
        return new Pizza(cebola, tomate, palmito, azeitona, qtdeQueijo, tamanho);
    }

    public boolean isCebola() {
        return cebola;
    }
    public void setCebola(boolean cebola) {
        this.cebola = cebola;
    }
    public boolean isTomate() {
        return tomate;
    }
    public void setTomate(boolean tomate) {
        this.tomate = tomate;
    }
    public boolean isPalmito() {
        return palmito;
    }
    public void setPalmito(boolean palmito) {
        this.palmito = palmito;
    }
    public boolean isAzeitona() {
        return azeitona;
    }
    public void setAzeitona(boolean azeitona) {
        this.azeitona = azeitona;
    }
    public double getQtdeQueijo() {
        return qtdeQueijo;
    }
    public void setQtdeQueijo(double qtdeQueijo) {
        this.qtdeQueijo = qtdeQueijo;
    }
    public Tamanho getTamanho() {
        return tamanho;
    }
    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    
}
