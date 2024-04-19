/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aprendiz
 */
public class DBConnection {
    
    public static Connection DBConnection(){
        
        Connection conx = null;
        
        try{
        
        Driver drv = new Driver();
        DriverManager.registerDriver(drv);
        String url = "jdbc:mysql://localhost:3306/medistockdb?user=root&password=";
        conx = DriverManager.getConnection(url);
                
        }catch (SQLException e){
        System.out.println("Error de conexion.");
        }
        
        return conx;
    }
    
}
