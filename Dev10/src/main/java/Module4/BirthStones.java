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
public class BirthStones {
    public static void main(String[] args) {
        
        double userin;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("What month's birthstone are you wanting to know?");
        userin = inputReader.nextInt();
        if (userin == 1) {
            System.out.println("January's birthstone is Garnet.");
        }else if (userin == 2) {
            System.out.println("February's birthstone is Amethyst.");
        }else if (userin == 3) {
            System.out.println("March's birthstone is Aquamarine.");
        }else if (userin == 4) {
            System.out.println("April's birthstone is Diamond.");
        }else if (userin == 5) {
            System.out.println("May's birthstone is Emerald.");
        }else if (userin == 6) {
            System.out.println("June's birthstone is Pearl.");
        }else if (userin == 7) {
            System.out.println("July's birthstone is Ruby.");
        }else if (userin == 8) {
            System.out.println("August's birthstone is Peridot.");
        }else if (userin == 9) {
            System.out.println("September's birthstone is Sapphire.");
        }else if (userin == 10) {
            System.out.println("October's birthstone is Opal.");
        }else if (userin == 11) {
            System.out.println("November's birthstone is Topaz.");
        }else if (userin == 12) {
            System.out.println("December's birthstone is Turquoise.");
        }else if (userin > 12) {
            System.out.println("The number of the month CANNOT exceed 12. (January = 1, February = 2, etc.)");
        } else {
            System.out.println("Please put in the number of the month! (January = 1, February = 2, etc.)");
        }
    }
}
