package Model;

import java.util.*;

public class Cliente {

    private int id;
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String senha;
    private String email;
    private int bookcoin;
    

    public Cliente(int id, String nome, String endereco, String telefone, String cpf,String senha,int bookcoin) {
        super();
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
        public String getSenha() {
        return senha;
    }

    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public int getBookcoin() {
        return bookcoin;
    }

   
    public void setBookcoin(int bookcoin) {
        this.bookcoin = bookcoin;
    }
    
     public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }
    public void consultarprod() {

    }

    public void addcarrinho() {

    }

    public void removercarrinho() {

    }

    public void realizarpagammento() {

    }

    public void inserirmetpagamento() {

    }



}    
    