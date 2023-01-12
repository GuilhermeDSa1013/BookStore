package DOA;

import Model.Produto;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harry
 */
public class ProdutosCONEC {
    
    Connection conn;
    PreparedStatement rue;
    ResultSet result;
    ArrayList<Produto> lista = new ArrayList<>();
    
    public void cadastrarProd(Produto x){
        
        String sql = "insert into prods (id,nome,tipo,descricao,fornecedor) values(?,?,?,?,?)";
        conn = new Conexao().conectaBD();
        
        try {
            
            rue = conn.prepareStatement(sql);
            
            rue.setInt(1, x.getId());
            rue.setString(2,x.getNome());
            rue.setString(3,x.getTipo());
            rue.setString(4,x.getDescricao());
            rue.setString(5,x.getFornecedor());
            
            rue.execute();
            rue.close();
                    
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"Cadastrar"+erro );
        }
        
    }
    
    public ArrayList<Produto> PesquisarProd(){
        
        String sql = "select * from prods";
        conn = new Conexao().conectaBD();
        
        try {
            
            rue = conn.prepareStatement(sql);
            result = rue.executeQuery();
           
            while(result.next()){
             Produto nnovo = new Produto(0,"","","","");
             nnovo.setId(result.getInt("id"));
             nnovo.setNome(result.getString("nome"));
             nnovo.setTipo(result.getString("tipo"));
             nnovo.setDescricao(result.getString("descricao"));
             nnovo.setFornecedor(result.getString("fornecedor"));
                
             
             lista.add(nnovo);
            }
            
        } catch (SQLException erro){ 
            JOptionPane.showMessageDialog(null, "PESQUISAR PROD" +erro);
            
        }
        
        
        
        return lista;
                
    }
}
