package Model;

import java.util.*;

public class Produto {
    
    private int id;
    private String titulo;
    private String autor;
    private double valor;
    private String editora;
    private String descricao;
    private byte[] imagem;

    public Produto(int i, String string, String string0, int i0, String string1, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }
    
     public byte[] getImagem() {
        return imagem;
    }

    
    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public Produto(int id, String titulo, String autor, double valor, String editora, String descricao,byte[] imagem) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.valor = valor;
        this.editora = editora;
        this.descricao = descricao;
        this.imagem = imagem;
    }

 }
