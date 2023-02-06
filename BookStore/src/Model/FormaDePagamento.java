package Model;

import java.util.*;

public class FormaDePagamento {

    public double efetuarCompra(String x,Double y,Double desconto) {
        
        Double valorfinal = 0.0;
        
        if(x == "BP") {
            
            valorfinal =  1.12*(((0.95 * y) - desconto));
            return valorfinal;
        }else if(x == "B20") {
            
            valorfinal =  1.12*(((0.95 * y) * 1.1) - desconto);
            return valorfinal;
        }else if(x == "B10") {
            
            valorfinal =  1.12*(((0.95 * y) * 1.15) - desconto);
            return valorfinal;
        }else{
            
            return 0.0;
        }
        
    }

}
