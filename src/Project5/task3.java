package Project5;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
/*
Using a scanner ask a user to provide one int number. if the
number is a prime number, then print "Prime Number"
otherwise print it is not a prime number.
NOTE:
A prime number is a whole number greater than 1 whose only
factors are 1 and itself. A factor is a whole number that can
be divided evenly into another number. The first few prime
numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23, and 29.
 */
        Scanner input = new Scanner(System.in);
        System.out.println("please provide an integer number");
        int num = input.nextInt(); // assign number provided by user to variable num
        int sum = 0;
        for (int i = 1; i<=num; i++){ // using "for loop" to count factors
            if (num % i == 0){
                sum++;
            }
        } if (sum>2){
            System.out.println("Not a Prime Number");
        } else{
            System.out.println("Prime Number");
        }
    }
}

