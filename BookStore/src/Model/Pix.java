package Model;

import java.util.*;

public class Pix extends FormaDePagamento {

    public Pix(String chavepix) {
        super();
        this.chavepix = chavepix;
    }

    private String chavepix;

    public String getChavepix() {
        return chavepix;
    }

    public void setChavepix(String chavepix) {
        this.chavepix = chavepix;
    }
    
    
//Sobrecarga do método efetuarCompra
    public double efetuarCompra(String x,Double y,Double desconto) {
        
        
        Double valorfinal =0.0;
        
        if (x == "PP") {
            
           valorfinal = 1.12*((0.92 * y) - desconto);
            return valorfinal;
           
        } else if(x == "P20") {
            
            valorfinal = 1.12*(((0.92 * y) * 1.1) - desconto);
            return valorfinal;
            
        }else if(x == "P10") {
            
            valorfinal = 1.12*(((0.92 * y) * 1.15) - desconto);
            return valorfinal;
        }else{
            
            return 0.0;
        }
        

    }

}
