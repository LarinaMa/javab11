package Project5;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
/*
Using the scanner asks the user to input the min and max
number. Write a java code that will calculate the sum of
numbers between the range of min and max and those that
can only be divided by 2 and 7.
(min and max numbers are included)
Example:
0, 50 -> 14 + 28 + 42 = 84
 */
        Scanner input = new Scanner(System.in);
        System.out.println("please enter min number");
        int min = input.nextInt();//assign number provided by user to variable min
        System.out.println("please enter max number");
        int max = input.nextInt();// assign number provided by user to variable max
        int sum = 0;
        for (; min <= max; min++){// creating loop, it will check every number form min to max
            if (min % 2 == 0 && min % 7 == 0){ // checking if number is divided by 2 and 7 by using modulus
              sum+=min; // sum of numbers, which can be divided by 2 and 7
             }
        }
        System.out.println(sum);
    }
}
