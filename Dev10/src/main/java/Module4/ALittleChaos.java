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
import java.util.Random;

public class ALittleChaos {
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        
        System.out.println("Random can make intergers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());
        
        int num = randomizer.nextInt(100) + 50;
        // Adding 50 to a r.nextInt results in the random number plus 50.
        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + "," + num);
        
        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");
        
        System.out.print(randomizer.nextInt(101) + ",");
        System.out.print(randomizer.nextInt(101) + ",");
        System.out.print(randomizer.nextInt(101) + ",");
        System.out.print(randomizer.nextInt(101) + ",");
        System.out.print(randomizer.nextInt(101));
    }
}
