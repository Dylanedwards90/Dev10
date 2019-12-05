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
        
        Random random = new Random();
        
        String color = color();
        String animal = animal();
        String colorAgain = color();
        
        int weight = random.nextInt(200-5+1) + 5;
        int distance = random.nextInt(20-10+1) + 10;
        int number = random.nextInt(20000-10000+1) + 10000;
        int time = random.nextInt(6-2+1) + 2;
        
        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal 
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over " 
            + number + " " + colorAgain + " poppies for nearly " 
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, " 
            + "let me tell you!");
    }
    
    public static String color() {
        Random randomizer = new Random();
        int low = 1;
        int high = 5;
        int result = randomizer.nextInt(high-low) + low;
        String result1 = "color";
        
        if (result == 1){
            result1 = "Blue";
        }else if (result == 2){
            result1 = "Red";
        }else if (result == 3){
            result1 = "Yellow";
            return result1;
        }else if (result == 4){
            result1 = "Green";
            return result1;
        }else if (result == 5){
            result1 = "Black";
            return result1;
        }
        
        return result1;
    }
    public static String animal(){
        Random randomizer = new Random();
        int low = 1;
        int high = 5;
        int result = randomizer.nextInt(high-low) + low;
        String result1 = "animal";
        
        if (result == 1){
            result1 = "Bear";
        } else if (result == 2){
            result1 = "Tiger";
        }else if (result == 3){
            result1 = "Eagle";
        }else if (result == 4){
            result1 = "Snake";
        }else if (result == 5){
            result1 = "Shark";
        }
        return result1;
    }
    
    
}
