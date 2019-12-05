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
public class HealthyHearts {
    public static void main(String[] args) {
     
        double age, max, hrl, hrh; //hrl is "heart rate low", hrh is "heart rate high"
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("What is your age? ");
        age = inputReader.nextInt();
        max = 220 - age;
        hrl = max * .5;
        hrh = max * .85;
        
        System.out.println("Your maximum heart rate should be " + max + " beats per minute.");
        System.out.println("Your target HR Zone is " + hrl + " - " + hrh + " beats per minute.");
    }
}