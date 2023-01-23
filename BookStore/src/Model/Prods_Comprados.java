/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author harry
 */
public class Prods_Comprados {
    
    private String senha;
    private String titulo;
    private double valor;
    
    
    public Prods_Comprados(String senha,String titulo,double valor){
        super();
        this.senha = senha;
        this.titulo = titulo;
        this.valor = valor;
    }

    
    public String getSenha() {
        return senha;
    }

   
    public void setSenha(String senha) {
        this.senha = senha;
    }

   
    public String getTitulo() {
        return titulo;
    }

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
    public double getValor() {
        return valor;
    }

   
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
