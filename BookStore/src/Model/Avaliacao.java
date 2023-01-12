package Model;

import java.util.*;

public class Avaliacao {

    private String comentario;
    private int nota;

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Avaliacao(String comentario, int nota) {
        super();
        this.comentario = comentario;
        this.nota = nota;
    }

    public void calcularmedia() {
    }

}
