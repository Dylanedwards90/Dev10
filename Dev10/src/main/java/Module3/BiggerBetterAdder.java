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
public class BiggerBetterAdder {
    public static void main(String[] args) {
     
        double number1, number2, number3, number4;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("What is your 1st number? ");
        number1 = inputReader.nextInt();
        System.out.println("What is your 2nd number? ");
        number2 = inputReader.nextInt();
        System.out.println("What is your 3rd number? ");
        number3 = inputReader.nextInt();
        number4 = number1 + number2 + number3;
        System.out.println("Your total is: ");
        System.out.println(number4);
        
    }
}