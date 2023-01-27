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
        //Faz a conexão com o banco de dados
        Connection conn = null;
        
        try {
            //Endereço local do banco de dados o usuario e a senha
            String url = "jdbc:mysql://localhost:3306/produtos?user=root&password=";
            //Conexão prporcionada pelo driver
            conn = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Conexao" + erro.getMessage());
            
        }
       return conn; 
    }
    
    
    
}
