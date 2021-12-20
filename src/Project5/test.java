package Project5;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter one number between 1 to 10");
        int line = sc.nextInt();
        for (int i = 1; line >= i; i++) {
            if (i == 1) {
            } else {
                System.out.println();
            }
            for (int j = 1; i >= j; j++) {
                System.out.print(i);
            }
        }
    }
}


