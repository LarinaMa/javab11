package loops.While_DoWhile;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a whole number");
        int numberUser = input.nextInt();
        int multiplicator = 1;
        int n = 10;
        int total;
        while (multiplicator <= n){
            total = numberUser * multiplicator;
            System.out.println( numberUser+  " * " + multiplicator +" = " +total);
            multiplicator++; }
    }
}
/*
Please enter a whole number
5
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50

 */
