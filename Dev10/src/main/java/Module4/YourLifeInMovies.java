/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module4;

import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class YourLifeInMovies {
    public static void main(String[] args) {
        
        double year;
        String name;
        
        Scanner inputReader = new Scanner(System.in);

        System.out.println("Hey, let's play a game! What's your name?");
        name = inputReader.next();
        System.out.println("Ok, " + name + " when were you born? (year)");
        year = inputReader.nextInt ();
        
        System.out.println("Well " + name + "...");
        
        if(year < 2005){
            System.out.println("Did you know that Pixar's 'UP' came out half a decade ago?");
        }
        if(year < 1995){
            System.out.println("And that the first Harry Potter came out over 15 years ago!");
        }
        if(year < 1985){
            System.out.println("Also, Space Jam came out not last decade, but the one before THAT.");
        }
        if(year < 1975){
            System.out.println("Did you also know the original Jurassic Park release is closer to the date of the first lunar landing than it is to today.");
        }
        if(year < 1965){
            System.out.println("Can you believe that the MASH TV series has been around for almost half a century");
        }
        
    }
}
