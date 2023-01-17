/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author guilh
 */
public class Cupom {

    private int codigo;
    private double valor;
    private String validade;
    private String descricao;

    public int getCodigo() {
        return codigo;
    }

    public double getValor() {
        return valor;
    }

    public String getValidade() {
        return validade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cupom(int codigo, double valor, String validade, String descricao) {
        this.codigo = codigo;
        this.valor = valor;
        this.validade = validade;
        this.descricao = descricao;
    }

}
