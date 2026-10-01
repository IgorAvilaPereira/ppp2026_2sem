package exe_command;

public class MainCommand {
    public static void main(String[] args) {
        Documento documento = new Documento();
        documento.setNome("igor.pdf");
        Impressora impressora = new Impressora();
        impressora.setComando(new CancelarCommand(documento));
        impressora.realizarComando();
    }

}
