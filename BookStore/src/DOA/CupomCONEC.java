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

/**
 *
 * @author harry
 */
public class CupomCONEC {
    
    Connection conn;
    PreparedStatement rue;
    
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
    
}
