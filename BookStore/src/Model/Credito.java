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

    public void calcparcelas() {

    }

    public void efetuarcompra() {

    }
}
