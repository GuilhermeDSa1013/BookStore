/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOA;


import Model.Prods_Comprados;
import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author harry
 */
public class Prods_CompradosCONEC {
    
    
    Connection conn;
    PreparedStatement rue;
    ResultSet rs;
    ArrayList<Produto> lista = new ArrayList<>();
    
    //Acha as compras cadastradas com a senha do usuario 
    public ArrayList<Produto>ListaCompras(String CompraAserListada){
        
        String sql = "select * from produtos_comprados where senha = ? ";
        conn = new Conexao().conectaBD();
        
        try {
           
            rue = conn.prepareStatement(sql);
            rue.setString(1, CompraAserListada);
            
            rs = rue.executeQuery();
                
            while(rs.next()){
                //O laço pega todas as compras cadastradas na senha do cliente
                Produto novo = new Produto(0,"","",0,"","",null);
                novo.setTitulo(rs.getString("produto_titulo"));
                novo.setValor(rs.getDouble("valor"));
                
                lista.add(novo);  
            }

        } catch (SQLException erro) {
        
        JOptionPane.showMessageDialog(null, "Lista Compras " + erro.getMessage());
        
        }
        
        
          return lista; 
        
    }
    
    
    public void CadastrarProds_comprados(Prods_Comprados x){
        
        //Insere na tabela de produtos comprados os produtos comprados por aquela senha atual
        String sql = "insert into produtos_comprados (senha,produto_titulo,valor) values(?,?,?)";
        conn = new Conexao().conectaBD();
        
        try {
            
            rue = conn.prepareStatement(sql);
            
            rue.setString(1, x.getSenha());
            rue.setString(2,x.getTitulo());
            rue.setDouble(3,x.getValor());
            
            
            
            rue.execute();
            rue.close();
                    
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Cadastrar Prods_comprados" + erro.getMessage() );
        }
        
        
        
    }
    
}
