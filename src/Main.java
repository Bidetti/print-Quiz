/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import piproject.mysql.MySQL;
import piproject.ui.UILogin;
import piproject.ui.UIQuiz;
/**
 * @author rafae
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws Exception {

        UILogin frame = new UILogin();
        frame.setVisible(true);
        MySQL.getConnection();
        
        
    }
    

}
