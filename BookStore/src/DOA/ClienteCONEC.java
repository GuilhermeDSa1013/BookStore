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

/**
 *
 * @author harry
 */
public class ClienteCONEC {
    
    Connection conn;
    PreparedStatement rue;
    
    public void cadastrarCliente(Cliente x){
        
        String sql = "insert into usuarios (id,nome,endereco,telefone,cpf,senha,email,bookcoin) values(?,?,?,?,?,?,?,0)";
        conn = new Conexao().conectaBD();
        
        try {
            
            rue = conn.prepareStatement(sql);
            
            rue.setInt(1, x.getId());
            rue.setString(2,x.getNome());
            rue.setString(3,x.getEndereco());
            rue.setString(4,x.getTelefone());
            rue.setString(5,x.getCpf());
            rue.setString(6,x.getSenha());
            rue.setString(7,x.getEmail());
            
            
            rue.execute();
            rue.close();
                    
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Cadastrar Cliente" + erro.getMessage() );
        }
        
    }
    
    public ResultSet AutentificarOCadastro(Cliente novo){
        
        //Recebe o cliente
        conn = new Conexao().conectaBD();
        
        try {
            //Procura no banco de dados as duas variaveis
            String sql = "select * from usuarios where email = ? and senha = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,novo.getEmail());
            pstm.setString(2, novo.getSenha());
            
            ResultSet setar = pstm.executeQuery();
            //Se a houver o cadastro 
            return setar;
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Autentificao" + erro.getMessage());
            return null;
        }
        
        
    }
    
   /* 
    public void AlterarCadastro(Cliente novo){
        
        
        String sql = "update usuarios set nome = ? , endereco = ?, telefone = ?, senha = ?, email = ? where cpf = ?";
        conn = new Conexao().conectaBD();
        
        try {
            
            rue = conn.prepareStatement(sql);
            
            
            rue.setString(2,novo.getNome());
            rue.setString(3,novo.getEndereco());
            rue.setString(4,novo.getTelefone());
            rue.setString(5,novo.getCpf());
            rue.setString(6,novo.getSenha());
            rue.setString(7,novo.getEmail());
            
            
            rue.execute();
            rue.close();
                    
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Alterar Cliente" + erro.getMessage() );
        }
    }
    */    
        
   
}
