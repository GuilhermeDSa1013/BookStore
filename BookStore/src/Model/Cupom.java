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
    private int validade;
    

    public int getCodigo() {
        return codigo;
    }

    public double getValor() {
        return valor;
    }

    public int getValidade() {
        return validade;
    }

    

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    

    public Cupom(int codigo, double valor, int validade) {
        this.codigo = codigo;
        this.valor = valor;
        this.validade = validade;
        
    }

}
