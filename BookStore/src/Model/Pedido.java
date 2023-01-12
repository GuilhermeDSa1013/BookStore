package Model;

import java.util.*;

public class Pedido {

    private int id;
    private Date datapedido;
    private Date datentrega;
    private float valorimposto;
    private float valortotal;
    private float valordesconto;

    public Pedido(int id, Date datapedido, Date datentrega, float valorimposto, float valortotal, float valordesconto) {
        super();
        this.id = id;
        this.datapedido = datapedido;
        this.datentrega = datentrega;
        this.valorimposto = valorimposto;
        this.valortotal = valortotal;
        this.valordesconto = valordesconto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDatapedido() {
        return datapedido;
    }

    public void setDatapedido(Date datapedido) {
        this.datapedido = datapedido;
    }

    public Date getDatentrega() {
        return datentrega;
    }

    public void setDatentrega(Date datentrega) {
        this.datentrega = datentrega;
    }

    public float getValorimposto() {
        return valorimposto;
    }

    public void setValorimposto(float valorimposto) {
        this.valorimposto = valorimposto;
    }

    public float getValortotal() {
        return valortotal;
    }

    public void setValortotal(float valortotal) {
        this.valortotal = valortotal;
    }

    public float getValordesconto() {
        return valordesconto;
    }

    public void setValordesconto(float valordesconto) {
        this.valordesconto = valordesconto;
    }

    public int calcularValortotal() {

        return 0;

    }

}
