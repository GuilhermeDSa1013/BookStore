package Model;

import java.util.*;

public class Carrinho {

    private int id;
    private int numprod;
    private float valortotalcarrinho;

    public Carrinho(int id, int numprod, float valortotalcarrinho) {
        super();
        this.id = id;
        this.numprod = numprod;
        this.valortotalcarrinho = valortotalcarrinho;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumprod() {
        return numprod;
    }

    public void setNumprod(int numprod) {
        this.numprod = numprod;
    }

    public float getValortotalcarrinho() {
        return valortotalcarrinho;
    }

    public void setValortotalcarrinho(float valortotalcarrinho) {
        this.valortotalcarrinho = valortotalcarrinho;
    }

    public void finalizarop() {

    }
}
