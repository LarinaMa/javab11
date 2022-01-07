package Home$Work.Homework.Homework010722;

import java.util.Arrays;
import java.util.Scanner;

public class SumMethod {
    /*
       Create a public method named sumOfNumbers INSIDE THE ->>Method.java<<
       that takes array of integers and returns sum of integer numbers in the array.
        */
    public static int sumOfNumbers(int[] array){
        int sum = 0;
        for (int i = 0; i<array.length; i++){
            sum+=array[i];
        }
        return sum;
    }
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
        System.out.println("Sum of numbers in the array = "+sumOfNumbers(numbers));

    }
}
