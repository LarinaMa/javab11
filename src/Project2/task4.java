package Project2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        /*
        Write a program that will accept only 6 digit (numbers like 578432 and find multiplication)
        (5*7*8*4*3*2) of all digits and sum
        (5+7+8+4+3+2)of all digits.
       Example 1:                                 578432           327695
                  Multiplication of all digits is   6720            11340
                  The Sum of all digits is            29               32
         */

        Scanner input = new Scanner(System.in);
        System.out.println("enter 6 digit number");
        int num= input.nextInt();

        int digit6 = num % 10;
        num = num / 10;
        int digit5 = num % 10;
        num = num / 10;
        int digit4 = num % 10;
        num = num / 10;
        int digit3 = num % 10;
        num = num / 10;
        int digit2 = num % 10;
        num = num / 10;
        int digit1 = num % 10;
        num = num / 10;
        int mult = digit1 * digit2 * digit3 * digit4 * digit5 * digit6;
        int sum = digit1 +digit2 + digit3 + digit4 + digit5 + digit6;
        if (num > 0){
            System.out.println("it is not a 6 digit number, please enter 6 digit number");
        } else {
            System.out.println(mult);
            System.out.println(sum);
        }
    }
}
