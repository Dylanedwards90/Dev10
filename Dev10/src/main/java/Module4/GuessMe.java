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
public class GuessMe {
    public static void main(String[] args) {
        
        double userin, plugin;
        plugin = 55;
        
        Scanner inputReader = new Scanner(System.in);

        System.out.println("I've chosen a number. Betcha can't guess it!");
        System.out.println("Your guess: ");
        userin = inputReader.nextInt();

        if(userin < plugin){
            System.out.println("Ha, nice try - too low! I chose " + plugin + ".");
        }
        if(userin > plugin){
            System.out.println("Too bad, way too high. I chose " + plugin + ".");
        }
        if(userin == plugin){
            System.out.println("Wow, nice guess! That was it!");
        }
    }
}
