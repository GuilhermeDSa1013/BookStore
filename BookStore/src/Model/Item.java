package Model;

import java.util.*;

public abstract class Item {

    private int quant;
    private float valorunidade;

    public Item(int quant, float valorunidade) {
        super();
        this.quant = quant;
        this.valorunidade = valorunidade;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public float getValorunidade() {
        return valorunidade;
    }

    public void setValorunidade(float valorunidade) {
        this.valorunidade = valorunidade;
    }

}
