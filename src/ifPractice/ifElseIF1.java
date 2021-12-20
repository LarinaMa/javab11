package ifPractice;

import java.util.Scanner;

public class ifElseIF1 {
    public static void main(String[] args) {
        /*
        get 3 test results from user and calculate the average of these test.
        print out letter grade for student
        90-100 --> grade A
        80-89 --> B
        60-79 -- C
        <60 -- you should take the course again
         */
        Scanner input = new Scanner(System.in);
        System.out.println(" enter your first test grade ");
        double grade1 = input.nextDouble();
        System.out.println(" enter your second test grade ");
        double grade2 = input.nextDouble();
        System.out.println(" enter your third test grade ");
        double grade3 = input.nextDouble();

        double average = (grade1 + grade2 + grade3) / 3;

          if (average < 79 && average >= 60) {
            System.out.println("your grade is C");
        } else if (average < 89 && average >= 80) {
            System.out.println("your grade is B");
        } else if (average <= 100 && average >= 90) {
            System.out.println("your grade is A");
        } else {
        System.out.println("you should take course again");
        }
    }
    }