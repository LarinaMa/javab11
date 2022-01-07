package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Sum100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers you want to check?");
        int num = input.nextInt();
        int[] numbers = new int[num];
        input = new Scanner(System.in);
        for(int i = 0; i<num; i++){
            System.out.println("type your "+(i+1)+ " number");
            numbers[i]= input.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        for (int j= 0; j<numbers.length;j++){
            for (int a=j+1;a<numbers.length;a++){
                if (numbers[j] + numbers[a] == 100) {
                    System.out.println(numbers[j]+ " + "+ numbers[a]+ " = 100");
                }
            }
        }
    }
}
