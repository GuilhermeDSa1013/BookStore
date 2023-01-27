package Model;

import java.util.*;

public class Credito extends Cartao {

    private int parcelas;

    public Credito(String nome, String bandeira, int numero, Date validade, int parcelas) {
        super(nome, bandeira, numero, validade);
        this.parcelas = parcelas;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    
    //Polimorfismo
    public double comprarnocredito(String x,Double y, Double desconto) {
        
        
        Double valorfinal = 0.0;
        if(x == "CCP") {
            
            valorfinal =  1.12*((y - desconto));
            return valorfinal;
        }else if(x == "CC20") {
            
            valorfinal = 1.12*(( y * 1.15) - desconto);
            return valorfinal;
        }else if(x == "CC10") {
            
            valorfinal = 1.12*(( y * 1.15) - desconto);
            return valorfinal;
        }else{
            
            return 0.0;
        }
        

    }
}
