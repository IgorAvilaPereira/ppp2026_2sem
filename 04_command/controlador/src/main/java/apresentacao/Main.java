package apresentacao;

import java.lang.reflect.Array;
import java.util.ArrayList;

import negocio.Command;
import negocio.Controle;
import negocio.JBL;
import negocio.JBLRomanticMomentCommand;
import negocio.Luz;
import negocio.LuzRomanticMomentsCommand;
import negocio.MacroCommand;
import negocio.TvCCE;
import negocio.TvCCECommand;

public class Main {
    public static void main(String[] args) {
        Controle controle = new Controle();
        controle.setSlot(0, new TvCCECommand(new TvCCE()));

        ArrayList<Command> commands = new ArrayList<Command>();
        commands.add(new JBLRomanticMomentCommand(new JBL()));
        commands.add(new LuzRomanticMomentsCommand(new Luz()));
        MacroCommand macroCommand = new MacroCommand(commands);
       
        controle.setSlot(1, macroCommand);        
        controle.on(0); // liguei TV
        controle.off(0); // desliguei a tv

        System.out.println("====================");
        System.out.println("um clique só:");
        controle.on(1);  // habilitei o macro (jbl (love is the air) e luz (vermelha))
        System.out.println("=================");

        controle.on(2);

    }
}