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

public class StayPositive {
    public static void main(String [] args) {
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("What number should I count down from? ");
        
        int userin = inputReader.nextInt();
        
        System.out.println("Here goes!");
        
        while(userin > -1) {
            System.out.println(userin);
            userin--;
        }
        System.out.println("Whew, better stop there...!");
    }
}
