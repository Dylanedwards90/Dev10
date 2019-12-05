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
public class FruitsBasket {
    public static void main(String[] args) {
        String[] fruit = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple", "Orange", "Orange", "Apple", "Apple", "Apple", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple", "Apple", "Apple", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Orange"};
        int i =0;
        int a =0;
        int o =0;
        for (i=0; i<fruit.length;i++) {
            if(fruit[i].equals("Apple")){
                a++;
            }else if(fruit[i].equals("Orange")){
                o++;
            }
        }
        System.out.println("Total# of Fruit in Basket: " + i);
        System.out.println("Number of Apples: " + a);
        System.out.println("Number of Oranges: " + o);
    }
}

