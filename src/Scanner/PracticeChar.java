package Scanner;

import java.util.Scanner;

public class PracticeChar {
    public static void main(String[] args) {
        String device = "microphone";
        /*
        microphone
        0123456789 --> index
         */
        char ch = device.charAt(0);// index number o represent letter m
        System.out.println(ch);
        char ch1 = device.charAt(4);// index number 4 represent letter 0
        System.out.println(ch1);
        char ch2 = device.charAt(9);// index number 9 represent letter e
        System.out.println(ch2);
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = input.next();
        System.out.println("this is your first letter of the string >> "+word.charAt(0));
        System.out.println("Please enter another word");
        //without storing incoming string value, taking a letter from it and print
        System.out.println("this is your first letter of the string >> "+input.next().charAt(0));
    }
}
