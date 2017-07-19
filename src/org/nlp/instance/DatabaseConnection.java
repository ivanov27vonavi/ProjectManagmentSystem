
package org.nlp.instance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DatabaseConnection {
    
    
 
    private Connection con;
    private static DatabaseConnection dbc;
    
    private DatabaseConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectmanager","root", "04031980" );
            System.out.println("Connection Esteblished");
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    public static DatabaseConnection getDatabaseConnection(){
        if(dbc == null){
           dbc = new DatabaseConnection();
        }
        
        return dbc;
    }
    
    public Connection getConnection(){
        return con;
    }
    
    
    
}
