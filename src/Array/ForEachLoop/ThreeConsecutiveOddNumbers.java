package Array.ForEachLoop;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ThreeConsecutiveOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers you want to check?");
        int num = input.nextInt();
        int numbers[] = new int[num];
        input = new Scanner(System.in);
        for(int i = 0; i<num; i++){
            System.out.println("enter your "+(i+1)+" number");
            numbers[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        for (int j = 0; j+2<numbers.length; j++){
            if(numbers[j] % 2==0 && numbers[j+1] % 2 ==0 && numbers[j+2] % 2==0){
                System.out.println("There are 3 consecutive even numbers in your array");
            } else if (numbers[j] % 2!= 0 && numbers[j+1] % 2 != 0 && numbers[j+2] % 2!= 0){
                System.out.println("There are 3 consecutive odd numbers in your array");
            } else{
                System.out.println("There are no 3 consecutive numbers in your array");
            }
        }
    }
}
