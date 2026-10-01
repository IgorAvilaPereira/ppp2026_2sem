package exe_command;

public class ImprimirCommand implements Command {
    private Documento documento;

    public ImprimirCommand(Documento documento) {
        this.documento = documento;
    }

    @Override
    public void execute() {
        System.out.println("Imprimindo documento"+documento.getNome());
    }

    

}
