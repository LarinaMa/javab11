package Home$Work.Homework.Homework1;

import java.util.Scanner;
/*
Using Scanner ask user to enter one string value with three words
 1) Print first letter of each word together
 2) Print last letter of each word together
 3) Print length of each word
  - print first word's length
  - print second word's length
  - lastly print last word's length
   Example: Please enter value: "Java String Test" Output: JST agt 4 6 4
 */

public class ThreeWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
                                                            // 123456789      16 --> length
        System.out.println("Please enter your three words");// Java String Test
                                                            // 0  3456    11   15 --> index nmber
        Scanner myScanner = new Scanner(System.in);// Create a Scanner object
        String words = myScanner.nextLine();// Read user input
        int lengthWords = words.length(); // 16
        int firstSpace = words.indexOf(" "); // 4
        int secondSpace = words.indexOf(" ", firstSpace+1); // 11
        char firstLetter1 = words.charAt(0);
        int firstWordIndex2 = firstSpace-1;
        char firstLetter2 = words.charAt(firstWordIndex2);
        int secondWordIndex1 = firstSpace+1;
        char secondLetter1 = words.charAt(secondWordIndex1);
        int secondWordIndex2 = secondSpace-1;
        char secondLetter2 = words.charAt(secondWordIndex2);
        int thirdWordIndex1 = secondSpace+1;
        char thirdLetter1 = words.charAt(thirdWordIndex1);
        int thirdWordIndex2 = lengthWords-1;
        char thirdLetter2 = words.charAt(thirdWordIndex2);
        System.out.print(firstLetter1);
        System.out.print(secondLetter1);
        System.out.println(thirdLetter1);
        System.out.print(firstLetter2);
        System.out.print(secondLetter2);
        System.out.println(thirdLetter2);
        int firstWordLength = firstSpace;
        int secondWordLength = secondSpace-firstSpace-1;
        int thirdWordLength = lengthWords-thirdWordIndex1;
        System.out.println(firstSpace);
        System.out.println(secondWordLength);
        System.out.println(thirdWordLength);

    }
}
