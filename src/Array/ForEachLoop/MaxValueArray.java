package Array.ForEachLoop;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MaxValueArray {
    public static void main(String[] args) {
        int nums[] = {3,9,55,73,99,2,10};
        int min, max;
        min=max=nums[0];
        for(int i=1; i<nums.length; i++){
            if (nums[i]<min) min=nums[i];;
            if (nums[i]>max) max=nums[i];
        }
        System.out.println(min+ " is min value");
        System.out.println(max +" is max value");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many number you want to store?");
        int number = scanner.nextInt();
       int[] numbers = new int[number];
        scanner = new Scanner(System.in);
        for (int i = 0; i<number; i++){
            System.out.println("enter " + (i+1) + " number");
            numbers[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        int min1, max1;
         max1 = Integer.MIN_VALUE;
         min1 = Integer.MAX_VALUE;

         for(int i=0; i<numbers.length; i++){
             if (numbers[i] < min1) min1 = numbers[i];
             if (numbers[i] > max1) max1 = numbers[i];
         }
        System.out.println(min1+ " is min value");
        System.out.println(max1 +" is max value");

    }
}
