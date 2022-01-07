package Project5;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
/*
Ask the user to enter one in number between 1 to 10 then, Write the
program to print the string in the following format:
Example:
Input: 6
Output:
666666
55555
4444
333
22
1
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number between 1 to 10");
        int num = input.nextInt();//assign number provided by user to variable num
        int num1 = num;// new variable, used to preserve number provided by user
        if (num>=1 && num<=10){// using "if condition" to check if number is between 1 and 10
             for (int i=1; i<=num; i++, num1--){// this loop will work from the number provided by user till it will reach number 1
                for (int j=num1; j>=1; j--){// this loop is used to fill line with numbers starting from the number provided by user till it reach 1
                   System.out.print(num1);// printing numbers in the same line till it will become equal to the number
               }
              System.out.println();// used to start new line
             }
        } else{
            System.out.println("check your number");
        }

    }
}
