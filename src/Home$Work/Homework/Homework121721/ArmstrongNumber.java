package Home$Work.Homework.Homework121721;

import java.util.Scanner;


public class ArmstrongNumber {
    public static void main(String[] args) {
        /*
        Write a Java program to check whether a given number is an armstrong number or not.
        NOTE: An Armstrong number, also known as narcissistic number,
        is a number that is equal to the sum of the cubes of its own digits.
        For example, 370 is an Armstrong number since 370 = 3*3*3 + 7*7*7 + 0*0*0 = 27+343+0=370

Test Data : Input a number: 153 Expected Output :153 is an Armstrong number

Input a number: 230 Expected Output : 230 is not an Armstrong number
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt();
        int num1=num;
        int sum=0;
        int a;
        while (num1!=0){
            a= num1%10;
            num1=num1/10;
            sum +=a*a*a;
        }
          if (sum == num){
            System.out.println(num+" is an Armstrong number");
        } else {
            System.out.println(num+" is not an Armstrong number");
        }
        System.out.println("another solution");
          int num2=num;
          int sum1=0;
          for(;num2>0;num2=num2/10){
              int digit = num2%10;
              int cubeOfDigit = digit*digit*digit;
              sum1+=cubeOfDigit;
              }
          if (sum1==num){
              System.out.println(num+" is an Armstrong number");
          } else {
              System.out.println(num+" is not an Armstrong number");
          }

    }
}
