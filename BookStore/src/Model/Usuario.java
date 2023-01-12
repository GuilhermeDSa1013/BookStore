
package Model;

public class Usuario {
    private String nome;
    private String endereco;
    private String cpf;
    private String senha;

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario(){}
    public Usuario(String nome, String endereco, String cpf, String senha) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.senha = senha;
    }
    
}
