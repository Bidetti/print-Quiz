/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


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
    
    public static void questionRandom() {
    Random rand = new Random();
    List<Integer> listID = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
    int number = 0;
    int numberOfElements = 14;

    for (int i = 0; i < numberOfElements; i++) {
        int randomIndex = rand.nextInt(listID.size());
        Integer randomElement = listID.get(randomIndex);
        listID.remove(randomIndex);
        number = randomElement;
        System.err.println(randomElement);
    }
}
    public static void main(String[] args) throws Exception {

        UILogin frame = new UILogin();
        frame.setVisible(true);
        MySQL.getConnection();
        
    }
    

}
