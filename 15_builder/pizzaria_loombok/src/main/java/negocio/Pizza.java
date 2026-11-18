package negocio;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * InnerPizza
 */


@Builder 
@Getter 
@Setter 
@ToString 
public class Pizza {
    private boolean cebola;
    private boolean tomate;
    private boolean palmito;
    private boolean azeitona;
    private double qtdeQueijo;
    private Tamanho tamanho;


    

    



}
