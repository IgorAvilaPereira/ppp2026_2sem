package negocio;

/**
 * InnerPizza
 */


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

    

    @Override
    public String toString() {
        return "Pizza [cebola=" + cebola + ", tomate=" + tomate + ", palmito=" + palmito + ", azeitona=" + azeitona
                + ", qtdeQueijo=" + qtdeQueijo + ", tamanho=" + tamanho + "]";
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



    public static class PizzaBuilder {
        private boolean cebola;
        private boolean tomate;
        private boolean palmito;
        private boolean azeitona;
        private double qtdeQueijo;
        private Tamanho tamanho;

        public PizzaBuilder comCebola(boolean cebola) {
            this.cebola = cebola;
            return this;
        }

         public PizzaBuilder comTomate(boolean tomate) {
            this.tomate = tomate;
            return this;
        }
    
          public PizzaBuilder comPalmito(boolean palmito) {
            this.palmito = palmito;
            return this;
        }

        public PizzaBuilder comAzeitona(boolean azeitona) {
            this.azeitona = azeitona;
            return this;
        }

        public PizzaBuilder qtdeQueijo(double qtdeQueijo) {
            this.qtdeQueijo = qtdeQueijo;
            return this;
        }

        public PizzaBuilder tamanho(Tamanho tamanho){
            this.tamanho = tamanho;
            return this;
        }
    
        public Pizza build(){
            return new Pizza(this.cebola, this.tomate, this.palmito, this.azeitona, this.qtdeQueijo, this.tamanho);
        }
        
    }

    



}
