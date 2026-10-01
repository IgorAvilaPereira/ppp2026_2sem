package exe_command;

public class CancelarCommand implements Command {

     private Documento documento;

    public CancelarCommand(Documento documento) {
        this.documento = documento;
    }

    @Override
    public void execute() {
        System.out.println("Cancelando documento"+documento.getNome());
    }

}
