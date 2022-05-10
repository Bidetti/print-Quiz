/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piproject.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rafae
 */
public class MySQL {
    
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    private static final String URL = "jdbc:mysql://localhost:3306/piproject";

    private static final String USER = "root";

    private static final String PASSWORD = "";
    
    public static Connection getConnection() throws Exception{
        try {
            //Class.forName(DRIVER);
            
            Connection conn  = DriverManager.getConnection(URL, USER, PASSWORD);
            //System.out.println("Connected");
            
            return conn;
        }catch(SQLException e) {
            System.err.println(e);
        
        return null;
        }
    }
}
