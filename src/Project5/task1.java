package Project5;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
/*
Reverse a given String and return it, if they have space in the
beginning and at the end then remove it.
Example: " Job" -> "boJ"
* " Happy " -> "yppaH"
* "Sun " -> "nuS"
* " Dream Job!" -> "!boJ maerD"
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the string");
        String str = input.nextLine().trim();// assign to str string from user and removing whitespace from both ends of a string
        String reverseSTR = ""; // creating an empty string, will be used for saving letters for reverse string
        for (int i=str.length()-1; i>=0; i--){ // loop to cut every letter from the string, starting from the end
            reverseSTR = reverseSTR + str.charAt(i); // putting letters to a reverse string
        }
        System.out.println(reverseSTR);// printing reverse string
    }
}
