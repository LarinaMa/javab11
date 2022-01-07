package Array.ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class TwoAfterOne {
    public static void main(String[] args) {
        /*
         * Write a method that takes an array of integers and returns a boolean.
         * Return true if the array contains 1 and 2 later somewhere in the array,
         * and 1 has to come before 2.
         *
         * contains12([1, 3, 2]) -> true
         * contains12([3, 1, 2]) -> true
         * contains12([3, 1, 4, 5, 2]) -> true
         * contains12([3, 2, 4, 5, 1]) -> false
         */
        Scanner input = new Scanner(System.in);
        System.out.println("How may numbers you want in your array?");
        int num = input.nextInt();
        int arr[] = new int[num];
        input = new Scanner(System.in);
        for (int a = 0; a< arr.length; a++){
            System.out.println("enter your "+(a+1)+" number");
            arr[a]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i< arr.length; i++) {
            if (arr[i] == 1) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == 2) {
                        System.out.println("true");
                    }
                }
            }
        }
    }
}
