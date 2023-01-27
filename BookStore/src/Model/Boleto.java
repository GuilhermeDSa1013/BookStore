package Model;

import java.util.*;

public class Boleto extends FormaDePagamento {

    private String codigo;
    private Date datavencimento;

    public Boleto(String codigo, Date datavencimento) {
        super();

        this.codigo = codigo;
        this.datavencimento = datavencimento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getDatavencimento() {
        return datavencimento;
    }

    public void setDatavencimento(Date datavencimento) {
        this.datavencimento = datavencimento;
    }
    
    //Polimorfismo
    public double pagarcomboleto(String x,Double y,Double desconto) {
        
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
