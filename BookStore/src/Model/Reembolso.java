package Model;

import java.util.*;

public class Reembolso {

    private float valorproduto;
    private String estadopedido;

    public Reembolso(float valorproduto, String estadopedido) {
        super();
        this.valorproduto = valorproduto;
        this.estadopedido = estadopedido;
    }

    public float getValorproduto() {
        return valorproduto;
    }

    public void setValorproduto(float valorproduto) {
        this.valorproduto = valorproduto;
    }

    public String getEstadopedido() {
        return estadopedido;
    }

    public void setEstadopedido(String estadopedido) {
        this.estadopedido = estadopedido;
    }

    public void extornarpedido() {

    }

}
