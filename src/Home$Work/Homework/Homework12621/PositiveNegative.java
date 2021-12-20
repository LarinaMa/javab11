package Home$Work.Homework.Homework12621;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        /*
        Write a Java program to get an integer number from the user and print whether it is positive or negative.
Example Input number: 35 Output: positive Input number: -35 Output: negative
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int num = input.nextInt();
        if (num >= 0){
            System.out.println("positive");
        }else {
            System.out.println("negative");
        }
    }
}
