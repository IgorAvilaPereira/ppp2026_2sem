package apresentacao;

import negocio.Pato1;
import negocio.Pato5;
import negocio.QuilkQuilk;
import negocio.SemAsas;

public class Main {
    public static void main(String[] args) {

        Pato1 patoDonald = new Pato1();
        patoDonald.barulhar();
        patoDonald.voar();

        patoDonald.setVoo(new SemAsas());
        patoDonald.voar();


        Pato5 patolino = new Pato5();
        patolino.barulhar();
        patolino.setBarulho(new QuilkQuilk());
        patolino.barulhar();


    }
}