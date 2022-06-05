/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import piproject.mysql.MySQL;
import piproject.ui.UILogin;
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
        /*
        try (Connection con = MySQL.getConnection();){
            String SQLtest =   "SELECT * FROM (SELECT userName, ROW_NUMBER() OVER(ORDER BY userPoints DESC, userId) AS 'rank' FROM `piproject`.`user_informations`) AS rank_query WHERE userName = 'teste'";
            Statement stmt = con.createStatement();
            ResultSet rsFinal = stmt.executeQuery(SQLtest);
            if (rsFinal.next()){
                System.out.println(rsFinal.getNString("userName"));
                System.out.println(rsFinal.getInt("rank"));
            }
        }catch (Exception e){
            System.err.println(e);
        }*/
        
        
    }
    

}
