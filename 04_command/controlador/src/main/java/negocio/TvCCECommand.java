package negocio;

public class TvCCECommand implements Command {

    private TvCCE tvCCE;

    public TvCCECommand(TvCCE tvCCE) {
        this.tvCCE = tvCCE;
    }

    @Override
    public void execute() {
        if (!this.tvCCE.isLigada()) {
            System.out.println("Liguei!");
            this.tvCCE.setLigada(true);
        } 
    }

    @Override
    public void undo() {
        System.out.println("Desliguei!");
        this.tvCCE.setLigada(false);
    }


}
