package Home$Work.Homework.Homework121321;

import java.util.Scanner;
/*
Using Scanner ask user to provide any int number
and print multiplication table of given number
EXAMPLE:
Input number: 5 Output : 5 1 = 5 5 2 = 10 5 3 = 15 5 4 = 20 5 5 = 25 5 6 = 30 5 7 = 35 5 8 = 40 5 9 = 45 5 10 = 50
 */

public class LoopMultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int num = input.nextInt();

        int multiplicator = 1;
        while (multiplicator <=10){
            int sum = num * multiplicator;
            System.out.println(num+" * "+ multiplicator+" = "+sum);
            multiplicator++;

        }

    }
}
