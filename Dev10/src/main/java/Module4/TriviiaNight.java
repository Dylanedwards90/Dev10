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

public class TriviiaNight {
    public static void main(String[] args) {
        
        double userin1, userin2, userin3, correct;//userin is 'User Input'
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("It's TRIVIA NIGHT! Are you Ready?!");
        
        System.out.println("FIRST QUESTION!");
        System.out.println("What is the first game to go into space?");
        System.out.println("1) Gears of War");
        System.out.println("2) World of Warcraft");
        System.out.println("3) Legend of Zelda");
        System.out.println("4) StarCraft");
        System.out.println("YOUR ANSWER:");
        userin1 = inputReader.nextInt();
        if (userin1 == 4){
            userin1 = 1;
        } else {
            userin1 = 0;
        }
        
        System.out.println("SECOND QUESTION!");
        System.out.println("What is the name of the baby on the TV show 'Family Guy'? ");
        System.out.println("1) Stewie Griffin");
        System.out.println("2) Honey BooBoo");
        System.out.println("3) Morty Sanchez");
        System.out.println("4) Maggie Simpson");
        System.out.println("YOUR ANSWER:");
        userin2 = inputReader.nextInt();
        if (userin2 == 1){
            userin2 = 1;
        } else {
            userin2 = 0;
        }
        
        System.out.println("THIRD QUESTION!");
        System.out.println("Which boxer was known as 'The Greatest' and 'The People's Champion'?");
        System.out.println("1) Joe Louis");
        System.out.println("2) Mike Tyson");
        System.out.println("3) Muhammad Ali");
        System.out.println("4) Floyd Mayweather");
        System.out.println("YOUR ANSWER:");
        userin3 = inputReader.nextInt();
        if (userin3 == 3){
            userin3 = 1;
        } else {
            userin3 = 0;
        }
        
        correct = userin1 + userin2 + userin3;
        
        if(correct == 0) {
            System.out.println("Sorry, you didn't get any correct.");
        } else if(correct == 3) {
            System.out.println("Great Job! You got all 3 correct!");
        } else { 
            System.out.println("You got " + correct + " correct.");
        }
        
    }
}
