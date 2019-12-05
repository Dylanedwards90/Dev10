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
public class PassingTheTuringTest {
    public static void main(String[] args) {
     
        double number1, number2, number3, number4;
        String name, color, fruit;
        
        Scanner inputReader = new Scanner(System.in);
        number2 = -1;
        
        System.out.println("Howdy Partner! I'm James ");
        System.out.println("What can I call ya? ");
        name = inputReader.next();
        System.out.println(name +  "? Well nice to meet you " + name + ". What color do you like?");
        color = inputReader.next();
        System.out.println("Hmmm, " + color + "? Interesting choice. Mine's dirt brown.");
        System.out.println("I really like peaches. They're my favorite food. What YOUR favorite fruit, " + name + "?");
        fruit = inputReader.next();
        System.out.println("Really? " + fruit + "? That wild! Speaking of favorites, what's your favorite number?");
        number1 = inputReader.nextInt();
        number3 = number1 * number2;
        System.out.println(number1 + " is a pretty cool number. Mine is " + number2 + ". did you know that " + number1 + " * " + number2 + " is " + number3 + "? That is a cool number too!" );
        System.out.println("Well, thanks for talking to me, " + name + "!");
    }
}
