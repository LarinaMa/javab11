package Home$Work.Homework.Homework1;

import java.util.Scanner;

public class StartingWithFirstWord {
    public static void main(String[] args) {
/*
Using scanner enter two String input. Print true if the second string
is starting with the first string’s last two characters, otherwise print false.
 */


            Scanner input = new Scanner(System.in);
            System.out.println("Enter first string value");
            String firstString = input.nextLine();
            System.out.println("Enter second string value");
            String secondString = input.nextLine();
            String firstStringTwoCharacters = firstString.substring(firstString.length()-2);
            String secondStringTwoCharacters = secondString.substring(0, 2);
            boolean result = firstStringTwoCharacters.equalsIgnoreCase(secondStringTwoCharacters);
            System.out.println(result);


        }
    }

