package negocio;

import javax.swing.JOptionPane;

public class QuilkQuilk implements Barulho {

    @Override
    public void emitirBarulho() {
        JOptionPane.showMessageDialog(null,"OIOIOI!");
    }

}
