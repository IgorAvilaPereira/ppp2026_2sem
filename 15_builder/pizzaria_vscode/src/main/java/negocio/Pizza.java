package negocio;





public class Pizza {
    private boolean cebola;
    private boolean tomate;
    private boolean palmito;
    private boolean azeitona;
    private double qtdeQueijo;
    private Tamanho tamanho;
  
    public static class Builder {
        private boolean cebola;
        private boolean tomate;
        private boolean palmito;
        private boolean azeitona;
        private double qtdeQueijo;
        private Tamanho tamanho;

        public Builder() {}

        
        public Builder cebola(boolean cebola) {
            this.cebola = cebola;
            return this;
        }

        public Builder tomate(boolean tomate) {
            this.tomate = tomate;
            return this;
        }

        public Builder palmito(boolean palmito) {
            this.palmito = palmito;
            return this;
        }

        public Builder azeitona(boolean azeitona) {
            this.azeitona = azeitona;
            return this;
        }

        public Builder qtdeQueijo(double qtdeQueijo) {
            this.qtdeQueijo = qtdeQueijo;
            return this;
        }

        public Builder tamanho(Tamanho tamanho) {
            this.tamanho = tamanho;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    private Pizza(Builder builder) {
        this.cebola = builder.cebola;
        this.tomate = builder.tomate;
        this.palmito = builder.palmito;
        this.azeitona = builder.azeitona;
        this.qtdeQueijo = builder.qtdeQueijo;
        this.tamanho = builder.tamanho;
    }

    public static Builder builder() {
        return new Builder();
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
