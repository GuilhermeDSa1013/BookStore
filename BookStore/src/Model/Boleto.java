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

    public void gerarboleto() {

    }

}
