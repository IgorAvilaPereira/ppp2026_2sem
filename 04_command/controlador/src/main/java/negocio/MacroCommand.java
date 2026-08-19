package negocio;

import java.util.ArrayList;

public class MacroCommand implements Command {

    private ArrayList<Command> commands;

    public MacroCommand(ArrayList<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }

}
