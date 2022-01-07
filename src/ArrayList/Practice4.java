package ArrayList;

import java.util.ArrayList;

public class Practice4 {
    // method sum
    public void sum(int i1, int i2) {
        System.out.println(i1 + i2);
    }

    public void sum(int[] numbers) {
        System.out.println(numbers);
    }

    // create a method that will take arraylist as a parameter of fruits
    // this method will print put fruits ig it has 5 or more letters
    public static void printFruits(ArrayList<String> fruits) {
        for (String fruit : fruits) {
            if (fruit.length() >= 5) {
                System.out.println(fruit);
            }
        }
    }

    // create a method that will take arraylist as a parameter of fruits
    // this method will remove elements that has 4 or less letters from the arraylist
    public static void removeFruits(ArrayList<String> fruits) {
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).length() <= 4) {
                fruits.remove(i);
            }
        }
        System.out.println(fruits);
    }


    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Strawberry");
        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Watermelon");
        fruits.add("Kiwi");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("========================");
        printFruits(fruits);
        System.out.println("after removing elements");
        removeFruits(fruits);//[Strawberry, Apple, Watermelon]
    }
}