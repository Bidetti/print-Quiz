/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piproject.dao;

import piproject.ui.UILogin;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafae
 */
public class LoginDao extends UILogin{
    public List<UILogin> listar(){
        List<UILogin> login = new ArrayList<UILogin>();
        /*
        try {
            Connection con = new Conexao().getConnection();
            PreparedStatement smt = con.prepareStatement("SELECT * FROM user_informations");
            ResultSet rs = smt.executeQuery();
            
            while(rs.next()) {
                UILogin uil = new UILogin();
                uil.setSQLUser(rs.getString("nameUser"));
                uil.setSQLPassword(rs.getString("passwordUser"));
                
                login.add(uil);
            }
            
            rs.close();
            smt.close();
            con.close(); 
        } catch (SQLException ex) {
            throw  new RuntimeException(ex);
        }
        */
        return login;
    }
}
