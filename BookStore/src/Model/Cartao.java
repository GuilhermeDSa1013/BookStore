package Model;

import java.util.*;

public class Cartao extends FormaDePagamento {

    private String nome;
    private String bandeira;
    private int numero;
    private Date validade;

    public Cartao(String nome, String bandeira, int numero, Date validade) {
        super();

        this.nome = nome;
        this.bandeira = bandeira;
        this.numero = numero;
        this.validade = validade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }
    
//Sobrecarga do método efetuarCompra
        public double efetuarCompra(String x,Double y, Double desconto) {
        
        
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
