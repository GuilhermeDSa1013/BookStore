
package DOA;

import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProdutosCONEC {
    
    Connection conn;
    PreparedStatement rue;
    ResultSet rs;
    ArrayList<Produto> lista = new ArrayList<>();
    
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
      
        //Seleciona linha onde o titulo é igual ao digitado
        String url = "select * from prods where titulo = ?";
        Produto novo = new Produto(0,"","",0,"","",null);
        conn = new Conexao().conectaBD();
        
        try {
            
            rue = conn.prepareStatement(url);
            
            rue.setString(1,titulo);
            rs = rue.executeQuery();
            
            if(rs.next()){
                
                //Se houver tal produto no banco ele retorna as informações no objetto
                novo.setTitulo(rs.getString("titulo"));
                novo.setAutor(rs.getString("autor"));
                novo.setEditora(rs.getString("editora"));
                novo.setValor(rs.getDouble("valor"));
                novo.setDescricao(rs.getString("descricao"));
                //novo.setImagem(rs.getBytes("imagem"));
                
                
                
                return novo;
                
            }else{
                
               return null; 
                
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Consultar prods" +  erro.getMessage());
            return null;
        
        }
        }
       
        
         public ArrayList<Produto> listarLivros(){
      
        //Vai na tabela de livros
        String url = "select * from prods ";
      
        
        conn = new Conexao().conectaBD();
        
            try {

                rue = conn.prepareStatement(url);

                rs = rue.executeQuery();

                while(rs.next()){
                       
                    Produto novo = new Produto(0,"","",0,"","",null);
                    
                    //Adiciona a lista todos os produtos existentes
                    novo.setTitulo(rs.getString("titulo"));
                    novo.setAutor(rs.getString("autor"));
                    novo.setValor(rs.getDouble("valor"));
                    novo.setEditora(rs.getString("editora"));
                    novo.setDescricao(rs.getString("descricao"));
                    novo.setImagem(rs.getBytes("imagem"));
                        

                    lista.add(novo);

                }

            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null," Listar livros " +  erro.getMessage());
                return null;

            }
            
            return lista;
        }
         
        
    
        
}