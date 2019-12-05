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
import java.util.ArrayList;

public class FruitSalad {
    public static void main(String[] args) {
        
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};
        
        ArrayList<String> fruitSalad = new ArrayList<String>();
        
        int a = 1;
        int o = 1;
        int f = 0;
        for(int i=0;i<fruit.length;i++) {
            
            if(fruit[i].contains("Tomato")){
                System.out.println("That doesn't go in a fruitsalad");
            }else if(fruit[i].contains("Apple") && a<=3){
                System.out.println("I put " + fruit[i] + " in the fruit salad!");f++; a++;
                fruitSalad.add(fruit[i]);
            }else if(fruit[i].contains("Apple") && a > 3){
               System.out.println("No more room for Apples."); a++;
            }else if(fruit[i].contains("Orange") && o <=2){
               System.out.println("I put " + fruit[i] + " in the fruit salad!");f++; o++; 
               fruitSalad.add(fruit[i]);
            }else if(fruit[i].contains("Orange") && o > 2){
               System.out.println("No more room for Oranges.");o++;
            }else if(f == 12){
                System.out.println("We have " + f + " fruits in the fruit salad!" );
                break;
            }else{
                System.out.println("I put " + fruit[i] + " in the fruit salad!"); f++;
                fruitSalad.add(fruit[i]);
            }
        }
        System.out.println(fruitSalad);
        
    }
}
