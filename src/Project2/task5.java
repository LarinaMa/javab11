package Project2;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        /*
        Write a program that will accept 5-digit number and will print reversed number at the end.
Example: 53876 --> 67835         97352 --> 25379
          */
        Scanner input = new Scanner(System.in);
        System.out.println("enter 5 digit number");
        int num= input.nextInt();

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
        if (num > 0){
            System.out.println("it is not a 5-digit number, please enter 5-digit number");
        } else {
            System.out.print(digit5);
            System.out.print(digit4);
            System.out.print(digit3);
            System.out.print(digit2);
            System.out.print(digit1);
        }
    }
}
