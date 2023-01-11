package Model;

import java.util.*;

public class Pix extends FormaDePagamento {

    public Pix(String chavepix) {
        super();
        this.chavepix = chavepix;
    }

    private String chavepix;

    public String getChavepix() {
        return chavepix;
    }

    public void setChavepix(String chavepix) {
        this.chavepix = chavepix;
    }

    public void efetuarcompra() {

    }

}
