package Home$Work.Homework.Homework121721;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        /*
        Write a program in Java to make such a pattern like a pyramid with numbers increased by 1.
        For this task ask the user to enter a number of the line.

Example: Please enter line number: 4
Expected output: Expected output:
1
2 3
4 5 6
7 8 9 10
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of line");

        int numLine = sc.nextInt();
        // 2
        // Loop has to run same time with number of line
        int startNum = 1;

        for (int i = 1; i <= numLine; i++) {

            for (int j = 1; j <= i; j++) {

                if (j == i) {
                    System.out.print(startNum++);
                } else {
                    System.out.print(startNum++ + " ");
                }
            }
            System.out.println();
        }
    }
}