/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coffee;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author AKHINA BABU
 */
public class dbconnect {
    Connection conn;
    public static Connection connectdb()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe?zeroDateTimeBehavior=convertToNull","root","");
    
            //JOptionPane.showMessageDialog(null,"DB");

             return conn;
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            //JOptionPane.showMessageDialog(null,"DB");
            
            return null;
        }
    }
    
}

    

