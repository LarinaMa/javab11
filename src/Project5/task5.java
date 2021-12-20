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
        int num = input.nextInt();
        int num1 = num;
        if (num>=1 && num<=10){
for (int i=1; i<=num; i++, num1--){
    if(i==1){}else{
        System.out.println();
    }
    for (int j=num1; j>=1; j--){

        System.out.print(num1);
    }
            }
        } else{
            System.out.println("check your number");
        }

    }
}
