package negocio;

public class LuzRomanticMomentsCommand implements Command {

    private Luz luz;

    public LuzRomanticMomentsCommand(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void execute() {
        this.luz.setLigada(true);
        this.luz.setCor("VERMELHO");
        System.out.println("Luz preparada para o amor!");
    }

    @Override
    public void undo() {
        this.luz.setLigada(false);
    }

}
