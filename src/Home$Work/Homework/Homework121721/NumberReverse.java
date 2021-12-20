package Home$Work.Homework.Homework121721;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        /*
        Write a program in Java to display any number in reverse order.
        Please look examples below carefully.

Test Data : Input : 12345 (it can be any number like 5 digits or 6 digits etc) Expected Output : 54321

Input : 765432 Expected Output : 234567

Input : 23914 Expected Output : 41932
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int num2=num;
        int a;
        while (num != 0) {
            a = num % 10;
            num = num / 10;
            System.out.print(a);
        }
        System.out.println();
        System.out.println("another solution");
        int num1=num2;
        for(;num1>0;num1=num1/10){
            int lastDigit = num1%10;
            System.out.print(lastDigit);
        }
    }


}