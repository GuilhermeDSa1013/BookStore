/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOA;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author harry
 */
public class Conexao {
    
    public Connection conectaBD(){
        Connection conn = null;
        
        
        try {
            
            String url = "jdbc:mysql://localhost:3306/produtos?user=root&password=";
            conn = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Conexao" + erro.getMessage());
            
        }
       return conn; 
    }
    
    
    
}
