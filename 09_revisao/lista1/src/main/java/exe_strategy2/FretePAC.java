package exe_strategy2;

/**
 * FretePAC
 */
public class FretePAC implements IFrete {

    @Override
    public double calcular(double peso, double distancia) {
        return peso*1 + distancia*1;
    }

}
