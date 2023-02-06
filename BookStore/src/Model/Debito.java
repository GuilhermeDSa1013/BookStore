package Model;

import java.util.*;

public class Debito extends Cartao {

    public Debito(String nome, String bandeira, int numero, Date validade) {
        super(nome, bandeira, numero, validade);

    }
    
//Sobrecarga do método efetuarCompra
    public double efetuarCompra(String x,Double y,Double desconto) {
        
        Double valorfinal = 0.0;
        
        if(x == "CDP") {
            
            valorfinal =  1.12*(((0.93 * y) - desconto));
            return valorfinal;
            
        }else if(x == "CD20") {
            
            valorfinal = 1.12*(((0.93 * y) * 1.15) - desconto);
            return valorfinal;
            
        }else if(x == "CD10") {
            
            valorfinal = 1.12*(((0.93 * y) * 1.15) - desconto);
            return valorfinal;
        }else{
            
            return 0.0;
        }

    }

}
