package apresentacao;

import negocio.Aluno;
import negocio.DefesaCivil;
import negocio.SiteDoIFRS;

public class Main {
    public static void main(String[] args) {
        DefesaCivil defesaCivil = new DefesaCivil();
        Aluno guilherme = new Aluno("111111", "Guilherme");
        Aluno lucas = new Aluno("2222", "Lucas");

        defesaCivil.addObserver(guilherme);
        defesaCivil.addObserver(lucas);
        defesaCivil.addObserver(new SiteDoIFRS());
        defesaCivil.changedState();

        defesaCivil.removeObserver(guilherme);

        defesaCivil.changedState();
    }
}