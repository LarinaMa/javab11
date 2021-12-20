package MentoringAhmet.InterviewQuestions;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        // write a program that will accept number like 578432
        // get the multiplication of the number 5*7*8*4*3*2
        //get the sum of the number 5+7+8+4+3+2
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number");
        int num = input.nextInt();
        int SumOfMultiplication = 1;
        int SumOfNumbers = 0;
      while  (num!=0){
          int digit = num%10;
          num = num/10;
            SumOfMultiplication = digit*     SumOfMultiplication;
          SumOfNumbers = digit+SumOfNumbers;
      }
        System.out.println(SumOfMultiplication);
        System.out.println(SumOfNumbers);
      }
    }
