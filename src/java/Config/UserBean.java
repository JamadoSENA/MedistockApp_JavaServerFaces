/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import Models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Aprendiz
 */
@ManagedBean
public class UserBean {
 
    User user = new User();
    
    public User getUser() {
        return user;
    }
    
    public void  setUser (User user){
        this.user = user;
    }
    
    public String authentication(){
        
        try{
        
        Connection cnx = DBConnection.DBConnection();  
        String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
        PreparedStatement ps = cnx.prepareStatement(sql);  
        /*
        ps.setString(1, user.getEmail());
        ps.setString(2, user.getPassword());
        */
        
        ResultSet rs = ps.executeQuery();
        
        if(rs.next()){
            return "Valido. Bienvenido" + rs.getString("Name");
        }else{
            return "Invalido";
        }
        
        }catch (SQLException e){
            return e.getMessage();
        }
    }
    
}
