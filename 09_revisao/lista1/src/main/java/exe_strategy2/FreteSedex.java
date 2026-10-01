package exe_strategy2;

/**
 * FreteSedex
 */
public class FreteSedex implements IFrete {

    @Override
    public double calcular(double peso, double distancia) {
        return 4*peso + distancia;
    }

}
