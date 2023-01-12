package Model;

import java.util.*;

public class Rastreio {

    private String localpedido;
    private String ultimaatt;

    public Rastreio(String localpedido, String ultimaatt) {
        super();
        this.localpedido = localpedido;
        this.ultimaatt = ultimaatt;
    }

    public String getLocalpedido() {
        return localpedido;
    }

    public void setLocalpedido(String localpedido) {
        this.localpedido = localpedido;
    }

    public String getUltimaatt() {
        return ultimaatt;
    }

    public void setUltimaatt(String ultimaatt) {
        this.ultimaatt = ultimaatt;
    }

    public void rastrear() {

    }

}
