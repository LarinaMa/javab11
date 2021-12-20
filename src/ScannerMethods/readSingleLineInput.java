package ScannerMethods;

import java.util.Scanner;

public class readSingleLineInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
         // this will eat the new line and move forward for other inputs.
        //sc.nextLine()

    }
}
