package Project5;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
/*
Ask the user to enter one number between 1 to 10 then, Write the
program to print the string in the following format:
Example:
Input: 5
Output:
1
22
333
4444
55555
 */
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int num = input.nextInt();//assign number provided by user to variable num
        if (num > 0 && num <= 10) { // using "if condition" to check if number is between 1 and 10
            for (int i = 1; num >= i; i++) { // this loop will work till it will reach the number provided by user
                for (int j = 1; i >= j; j++) { // this loop is used to jump for next number and next line
                    System.out.print(i); // printing number on the same line
                }
                System.out.println();// used to start new line
            }
        }else{
            System.out.println("Please check your number");
        }
    }
}


