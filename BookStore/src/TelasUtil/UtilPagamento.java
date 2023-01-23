/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TelasUtil;

/**
 *
 * @author harry
 */
public class UtilPagamento {
    

    public static double paga(String x,Double y,Double desconto){
        
        Double valorfinal = 0.0;
        
        if (x == "PP") {
            
           valorfinal = 1.12*((0.92 * y) - desconto);
            return valorfinal;
           
        } else if(x == "P20") {
            
            valorfinal = 1.12*(((0.92 * y) * 1.1) - desconto);
            return valorfinal;
            
        }else if(x == "P10") {
            
            valorfinal = 1.12*(((0.92 * y) * 1.15) - desconto);
            return valorfinal;
        }else if(x == "BP") {
            
            valorfinal =  1.12*(((0.95 * y) - desconto));
            return valorfinal;
        }else if(x == "B20") {
            
            valorfinal =  1.12*(((0.95 * y) * 1.1) - desconto);
            return valorfinal;
        }else if(x == "B10") {
            
            valorfinal =  1.12*(((0.95 * y) * 1.15) - desconto);
            return valorfinal;
        }else if(x == "CDP") {
            
            valorfinal =  1.12*(((0.93 * y) - desconto));
            return valorfinal;
        }else if(x == "CD20") {
            
            valorfinal = 1.12*(((0.93 * y) * 1.15) - desconto);
            return valorfinal;
        }else if(x == "CD10") {
            
            valorfinal = 1.12*(((0.93 * y) * 1.15) - desconto);
            return valorfinal;
        }else if(x == "CCP") {
            
            valorfinal =  1.12*((y - desconto));
            return valorfinal;
        }else if(x == "CC20") {
            
            valorfinal = 1.12*(( y * 1.15) - desconto);
            return valorfinal;
        }else if(x == "CC10") {
            
            valorfinal = 1.12*(( y * 1.15) - desconto);
            return valorfinal;
        }else{
            
            valorfinal = 0.0;
            return valorfinal;
        }
        
        
    }
    
    
}
