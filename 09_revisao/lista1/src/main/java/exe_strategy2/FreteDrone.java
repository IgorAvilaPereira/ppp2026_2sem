package exe_strategy2;

import javax.swing.JOptionPane;

public class FreteDrone implements IFrete {

    @Override
    public double calcular(double peso, double distancia) {
        JOptionPane.showMessageDialog(null, "Aqui é tecnologic!");
        return  peso*50 + distancia * 50;
    }

}
