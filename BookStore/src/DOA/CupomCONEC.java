/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOA;

import Model.Cupom;
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
public class CupomCONEC {
    
    Connection conn;
    PreparedStatement rue;
    ResultSet rs;
    ArrayList<Cupom> lista = new ArrayList<>();
    
    public void AdmCadastraCupom(Cupom x){
        
        String sql = "insert into cupons (valor,validade) values(?,?)";
        conn = new Conexao().conectaBD();
        
        try {
            
            rue = conn.prepareStatement(sql);          
            
            rue.setDouble(1,x.getValor());
            rue.setInt(2,x.getValidade());
             
            rue.execute();
            rue.close();
                    
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Cadastrar Cupom" + erro.getMessage());
        }
        
        
    }
    
    public ArrayList<Cupom> listarcupons(){
      
        //Vai na tabela de cupons
        String url = "select * from cupons ";
      
        
        conn = new Conexao().conectaBD();
        
            try {

                rue = conn.prepareStatement(url);

                rs = rue.executeQuery();

                while(rs.next()){
                       
                    Cupom novo = new Cupom(0,0,0);
                    
                    //Adiciona a lista todos os produtos existentes
                    novo.setCodigo(rs.getInt("codigo"));
                    novo.setValor(rs.getDouble("valor"));
                    novo.setValidade(rs.getInt("validade"));
                    
                        

                    lista.add(novo);

                }

            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null," Listar cupons " +  erro.getMessage());
                return null;

            }
            
            return lista;
        }
    
        
    
    
        public Cupom AutentificarOCupom(int x){
        
        //Seleciona linha onde o titulo é igual ao digitado
        String url = "select * from cupons where codigo = ?";
        
        Cupom novo = new Cupom(0,0,0);
        
        conn = new Conexao().conectaBD();
        
        try {
            
            rue = conn.prepareStatement(url);
            
            rue.setInt(1,x);
            rs = rue.executeQuery();
            
            if(rs.next()){
                
                //Se houver tal produto no banco ele retorna as informações no objeto
                novo.setValor(rs.getInt("valor"));

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
