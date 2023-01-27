/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOA;

import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author harry
 */
public class ClienteCONEC {
    //Criação de variaveis para relacionamento com o banco de dados
    Connection conn;
    PreparedStatement rue;
    ResultSet rs;
    ArrayList<Cliente> lista = new ArrayList<>();
    
    public void cadastrarCliente(Cliente x){
        
        //Comando sql a ser passado para o banco para cadastrar o usuario
        String sql = "insert into usuarios (id,nome,endereco,telefone,cpf,senha,email) values(?,?,?,?,?,?,?)";
        conn = new Conexao().conectaBD();
        
        try {
            
            //Passa o comando da string ao banco de dados
            rue = conn.prepareStatement(sql);
            
            rue.setInt(1, x.getId());
            rue.setString(2,x.getNome());
            rue.setString(3,x.getEndereco());
            rue.setString(4,x.getTelefone());
            rue.setString(5,x.getCpf());
            rue.setString(6,x.getSenha());
            rue.setString(7,x.getEmail());
            
            //Executa o comando passado
            rue.execute();
            rue.close();
                    
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Cadastrar Cliente" + erro.getMessage() );
        }
        
    }
    
    public ResultSet AutentificarOLogin(Cliente novo){
        
        //Faz a conexao com o banco
        conn = new Conexao().conectaBD();
        
        try {
            //Procura no banco de dados a linha  que possui as duas variaveis
            String sql = "select * from usuarios where email = ? and senha = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,novo.getEmail());
            pstm.setString(2, novo.getSenha());
            
            ResultSet setar = pstm.executeQuery();
            //Se a houver o cadastro 
            return setar;
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Autentificao do cadastro" + erro.getMessage());
            return null;
        }
        
        
    }
    
    public ResultSet Autentificarocadastro(Cliente novo){
        
        //Faz a conexao
        conn = new Conexao().conectaBD();
        try {
            
            //Olha se a senha é igual
            String sql = "select * from usuarios where senha = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, novo.getSenha());
            
            ResultSet setar = pstm.executeQuery();
            //Se a houver o cadastro 
            return setar;
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Autentica o login" + erro.getMessage());
            return null;
        }
        
        
    }
    
    public ArrayList<Cliente>setacadastros(String Contaaseralterada){
        
        //Procura no banco a conta cujo a senha é a digitada
        String sql = "select * from usuarios where senha = ? ";
        conn = new Conexao().conectaBD();
        
        try {
           
            rue = conn.prepareStatement(sql);
            rue.setString(1, Contaaseralterada);
            
            //Result set é usado para relacionar banco-> java, trazendo o resultado achado no banco para o rs
            rs = rue.executeQuery();
            
            Cliente novo = new Cliente(0, "", "", "", "", "", 0);
            
            if(rs.next()){
                //Se existir essa senha é retornada um arraylist com as informções do cliente
                novo.setId(rs.getInt("id"));
                novo.setNome(rs.getString("nome"));
                novo.setEmail(rs.getString("email"));
                novo.setEndereco(rs.getString("endereco"));
                novo.setSenha(rs.getString("senha"));     
                novo.setTelefone(rs.getString("telefone"));
                novo.setCpf(rs.getString("cpf"));
                
                lista.add(novo);
                   
            }else{
                
                return null;
                
            }
      
        } catch (SQLException erro) {
        
        JOptionPane.showMessageDialog(null, "Seta cadastros" + erro.getMessage());
        
        }
        
        
          return lista; 
        
    }
    
  
    public void AlterarCadastro( Cliente novo,String senhadig){
        
        //Faz o upadte dos dados alterados pelo cliente onde a sua senha for identificada
        String sql = "update usuarios set nome = ? , endereco = ?, telefone = ?, cpf = ?,email = ? where senha = ?";
        conn = new Conexao().conectaBD();
        
        
        try {
            
            //Passa o "statement" digitado na sql para o banco
            rue = conn.prepareStatement(sql);
            rue.setString(6, senhadig);
            
            rue.setString(1,novo.getNome());
            rue.setString(2,novo.getEndereco());
            rue.setString(3,novo.getTelefone());
            rue.setString(4,novo.getCpf());
            rue.setString(5,novo.getEmail());
            
            //Executa o comando passado
            rue.execute();
            //Fecha a conexão estabelecida
            rue.close();
                  
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null,"Alterar Cliente" + erro.getMessage() );
        }
    }
       
      
    
    public void excluirCliente(Cliente x){
        
        //Deleta conjunto de dados do cliente a partir do que o mesmo selecionou
        String url = "delete from usuarios where senha = ?";
        
        conn = new Conexao().conectaBD();
        
        
        try {
            
            rue = conn.prepareStatement(url);
            
            rue.setString(1,x.getSenha());
            
            rue.execute();
            rue.close();
            
        } catch (SQLException erro) {
            
            JOptionPane.showConfirmDialog(null, "Excluir cliente" + erro.getMessage());
        }
        
        
        
        
    }
   
}
