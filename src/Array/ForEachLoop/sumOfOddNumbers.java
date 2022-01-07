package Array.ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class sumOfOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many numbers you want to store?");
        int num = input.nextInt();
        int numbers[] = new int[num];
        input = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            System.out.println("Enter  " + (i + 1) + " number");
            numbers[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        int sumOdd = 0;
        int sumEven = 0;
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] % 2 != 0) sumOdd += numbers[j];
            if (numbers[j] % 2 == 0) sumEven += numbers[j];
        }

        System.out.println(sumEven + " is sum of Even numbers of your Array");
        System.out.println(sumOdd + " is sum of Odd numbers of your Array");
    }
}
