
package DOA;

import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class ProdutosCONEC {
    
    Connection conn;
    PreparedStatement rue;
    ResultSet rs;
    
    public void AdmCadastraProduto(Produto x){
        
        String sql = "insert into prods (titulo,autor,valor,editora,descricao,imagem) values(?,?,?,?,?,?)";
        conn = new Conexao().conectaBD();
        
        try {
            
            rue = conn.prepareStatement(sql);
            
            rue.setString(1,x.getTitulo());
            rue.setString(2,x.getAutor());
            rue.setDouble(3,x.getValor());
            rue.setString(4,x.getEditora());
            rue.setString(5,x.getDescricao());
            rue.setBytes(6,x.getImagem());
            
            rue.execute();
            rue.close();
                    
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Cadastrar Cliente" + erro.getMessage() );
        }
        
    }
    
    
    
    
    public Produto consultarProds(String titulo){
      
        
        String url = "select * from prods where titulo = ?";
        Produto novo = new Produto(0,"","",0,"","",null);
        conn = new Conexao().conectaBD();
        
        try {
            
            rue = conn.prepareStatement(url);
            
            rue.setString(1,titulo);
            rs = rue.executeQuery();
            
            if(rs.next()){
                
                novo.setAutor(rs.getString("autor"));
                novo.setEditora(rs.getString("editora"));
                novo.setValor(rs.getDouble("valor"));
                novo.setDescricao(rs.getString("descricao"));
                novo.setImagem(rs.getBytes("imagem"));
                
                
                
                return novo;
                
            }else{
                
               return null; 
                
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Consultar prods" +  erro.getMessage());
            return null;
        
        }
        }
       
        
            
    
     
        
}