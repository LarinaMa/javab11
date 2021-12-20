package Home$Work.Homework.Homework2;

import java.util.Scanner;

public class StringMethods2 {
    public static void main(String[] args) {
        /*
        1) ask the user to enter a random word
        2) ask the user to input the number of letters that word consists
            --> code should print true if the user entered a right number of letters in the word,
            --> false if the wrong number is entered.
        3) ask the user to enter a letter that the user wants to find an index of.
            -->  code should print the index of the entered letter,
            --> code should print -1 if the word doesn’t contain the letter
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a random word");
        String word = input.nextLine();
        int wordLength = word.length();
        System.out.println("Enter number of letter that word consists");
        int letterNumber = input.nextInt();
        boolean result = (wordLength == letterNumber);
        System.out.println(result) ;
        System.out.println("Enter a letter that you want to find an index");
        input.nextLine();
        String letter = input.nextLine();
       int indexOfLetter = word.indexOf(letter);
        System.out.println(indexOfLetter);


    }
}
