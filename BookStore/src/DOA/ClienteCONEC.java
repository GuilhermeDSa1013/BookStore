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
    
    Connection conn;
    PreparedStatement rue;
    ResultSet rs;
    ArrayList<Cliente> lista = new ArrayList<>();
    
    /**
     *
     * @param x
     */
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
    
    /**
     *
     * @param novo
     * @return
     */
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
    
    /**
     *
     * @param Contaaseralterada
     * @return
     */
    public ArrayList<Cliente>setacadastros(String Contaaseralterada){
        
        String sql = "select * from usuarios where senha = ? ";
        conn = new Conexao().conectaBD();
        
        try {
           
            rue = conn.prepareStatement(sql);
            rue.setString(1, Contaaseralterada);
            
            rs = rue.executeQuery();
            
            Cliente novo = new Cliente(0, "", "", "", "", "", 0);
            
            if(rs.next()){
                
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
    
    /**
     *
     * @param novo
     * @param senhadig
     */
    public void AlterarCadastro( Cliente novo,String senhadig){
        
        
        String sql = "update usuarios set nome = ? , endereco = ?, telefone = ?, cpf = ?,email = ? where senha = ?";
        conn = new Conexao().conectaBD();
        
        
        try {
            
            rue = conn.prepareStatement(sql);
            rue.setString(6, senhadig);
            
            rue.setString(1,novo.getNome());
            rue.setString(2,novo.getEndereco());
            rue.setString(3,novo.getTelefone());
            rue.setString(4,novo.getCpf());
            rue.setString(5,novo.getEmail());
            
            
            rue.execute();
            rue.close();
                  
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null,"Alterar Cliente" + erro.getMessage() );
        }
    }
       
        
   
}
