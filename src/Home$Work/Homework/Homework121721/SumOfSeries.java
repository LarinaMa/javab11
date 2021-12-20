package Home$Work.Homework.Homework121721;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        /*
        Write a program in Java to find the sum of the series 1 +11 + 111 + 1111 + .. n terms.
        Here the number n will come from user so if user gives number 3 you should find sum of 1 + 11 + 111.
        Please look carefully example below.
Test Data : Input the number of terms : 5
Expected Output : 12345 (Because the sum of 1 + 11 + 111 + 1111 + 11111= 12345)
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of term");
        int num = input.nextInt();
        int sum = 0;
        for (int a=0; a<num; a++){
            sum = sum+1;
            System.out.print(sum);
        }
        System.out.println();
        System.out.println("2nd solution");
       int sum1=0;
       int numInSeries = 0;
         for (;num>0;num--){
         numInSeries = numInSeries *10+1;
         sum1+=numInSeries;
}
        System.out.println(sum1);
    }
}
