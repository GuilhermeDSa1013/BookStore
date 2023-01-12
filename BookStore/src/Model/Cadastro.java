package Model;

import java.util.*;

public class Cadastro {

    private String endereco;
    private String nome;
    private String senha;
    private String cpf;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Cadastro(String endereco, String nome, String senha, String cpf) {
        super();
        this.endereco = endereco;
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
    }

}
