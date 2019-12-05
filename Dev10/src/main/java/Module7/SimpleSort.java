/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module7;

/**
 *
 * @author Dylan
 */
import java.util.Arrays;

public class SimpleSort {
    public static void main(String[] args) { 
        
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 55, 67, 88, 99};
        int[] secondHalf = {1, 4, 8, 11, 15, 18, 21, 44, 54, 89, 100};
        int[] wholeNumbers = new int[24];
        
        int aLen = firstHalf.length;
        int bLen = secondHalf.length;
        wholeNumbers = new int[aLen + bLen];
        
        
        System.arraycopy(firstHalf, 0, wholeNumbers, 0, aLen);
        System.arraycopy(secondHalf, 0, wholeNumbers, aLen, bLen);
        Arrays.sort(wholeNumbers);
        System.out.println("Here ya go -- all nice and ordered:");
        System.out.println(Arrays.toString(wholeNumbers));
    }
}
