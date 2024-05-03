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
import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;

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
    
    public void LargoIdUsr(FacesContext contexto, UIComponent componente, Object valor){
        contexto = FacesContext.getCurrentInstance();
        String cad = (String)valor;
        
        if(cad.length() < 3 || cad.length() > 10){
            ((UIInput)componente).setValid(false);
            
            contexto.addMessage(componente.getClientId(contexto), 
                    new FacesMessage(" Id de Usuario no válido - Imperativo") );
        }
    }

    public String authentication(){
        
        try{
        
        Connection cnx = DBConnection.DBConnection();  
        String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
        PreparedStatement ps = cnx.prepareStatement(sql);  
        ps.setString(1, user.getEmail());
        ps.setString(2, user.getPassword());
        
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
