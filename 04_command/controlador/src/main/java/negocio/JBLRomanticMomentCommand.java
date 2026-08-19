package negocio;

public class JBLRomanticMomentCommand implements Command {

    private JBL jbl;

    public JBLRomanticMomentCommand(JBL jbl) {
        this.jbl = jbl;
    }

    @Override
    public void execute() {
        this.jbl.setLigada(1);
        this.jbl.setCancao("LOve is the air!");
        this.jbl.setVolume(20);
        System.out.println("JBL está tocando:"+this.jbl.getCancao());
    }

    @Override
    public void undo() {
        this.jbl.setLigada(0);
    }

}
