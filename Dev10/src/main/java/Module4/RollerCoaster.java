/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module4;

/**
 *
 * @author Dylan
 */
import java.util.Scanner;
    
public class RollerCoaster {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("We're going to go on a roller coaster...");
        System.out.println("Let me know when you want to get off...!");
        
        String keepRiding = "y";
        int loopsLooped = 0;
        while(keepRiding.equals("y")) {
            System.out.println("WHEEEEEeeEEEeeEeEeEeeEE...!!!");
            System.out.println("Want to keep going? (y/n) :");
            keepRiding = userInput.nextLine();
            loopsLooped++;
        }
        System.out.println("Wow, that was FUN!");
        System.out.println("We looped that loop " + loopsLooped + " times!!");
    }
}
