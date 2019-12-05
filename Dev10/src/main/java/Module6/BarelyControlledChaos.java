/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module6;

/**
 *
 * @author Dylan
 */
import java.util.Random;

public class BarelyControlledChaos {
    public static void main(String[] args) {
        color =  color();
        animal = animal();
        colorAgain = color();
        weight = weight();
        distance = distance();
        number = number();
        time = time();
        
    }
    public static String color() {
        Random randomizer = new Random();
        int low = 1;
        int high = 5;
        int result = randomizer.nextInt(high-low) + low;
        if (result == 1){
            System.out.println("Blue");
        } else if (result == 2){
            System.out.println("Red");
        }else if (result == 3){
            System.out.println("Yellow");
        }else if (result == 4){
            System.out.println("Green");
        }else if (result == 5){
            System.out.println("Black");
        }
    }
    public static String animal(){
        Random randomizer = new Random();
        int low = 1;
        int high = 5;
        int result = randomizer.nextInt(high-low) + low;
        if (result == 1){
            System.out.println("Bear");
        } else if (result == 2){
            System.out.println("Tiger");
        }else if (result == 3){
            System.out.println("Eagle");
        }else if (result == 4){
            System.out.println("Snake");
        }else if (result == 5){
            System.out.println("Shark");
        }
    }
    public static int weight() {
        
    }
    public static int distance() {
        
    }
    public static int number() {
        
    }
    public static int time() {
        
    }
}
