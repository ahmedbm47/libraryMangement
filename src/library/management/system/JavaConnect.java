/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

/**
 *
 * @author Aspire 3
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class JavaConnect {
    Connection conn;
    
    public static Connection ConnectDb(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/newlibrary","root","");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
    
}
