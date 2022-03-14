/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piproject.api;

/**
 *
 * @author rafae
 */
public class API {
    
    String nameUser;
    String passwordUser;
    
    public String getUser(){
        return nameUser;
    }
    
    public String setUser(String user){
        this.nameUser = user;
        return user;
    }
    
    public String getPassword(){
        return passwordUser;
    }
    
    public void setPassword(String password){
        this.passwordUser = password;
    }
}
