/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module3;

/**
 *
 * @author Dylan
 */
import java.util.Scanner;
public class AllTheTrivia {
    public static void main(String[] args) {
     
        String question1, question2, question3, question4;
        
        Scanner inputReader = new Scanner(System.in);
       
        
        System.out.println("1,024 Gigabytes is equal to one what?");
        question1= inputReader.next();
        System.out.println("In our solar system, which is the only planet that rotates clockwise? ");
        question2 = inputReader.next();
        System.out.println("The largest volcano ever discovered in our Solar System is located on which planet?");
        question3 = inputReader.next();
        System.out.println("What is the most abundant element in the earth's atmosphere?");
        question4 = inputReader.next();
        System.out.println("Wow, 1,024 Gigabytes is a " + question3 + "!");
        System.out.println("I didn't know that the largest ever volcano was discovered on " + question4 + "!");
        System.out.println("That's amazing that " + question2 + " is the most abundant element in the atmosphere...");
        System.out.println(question1 + " is the only planet that rotates clockwise, neat!");
    }
}