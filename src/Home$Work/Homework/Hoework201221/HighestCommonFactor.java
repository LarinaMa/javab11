package Home$Work.Homework.Hoework201221;

import java.util.Arrays;
import java.util.Scanner;

public class HighestCommonFactor {
    public static void main(String[] args) {
/*
Write a java program to find HCF (Highest Common Factor) of two numbers.

 */     Scanner input = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1 = input.nextInt();
        System.out.println("Enter the number 2");
        int num2 = input.nextInt();
       int HCF = 1;

        for (int a=1;a<=num1 && a<=num2;a++) {
            if (num1 % a == 0 && num2 % a == 0){
                HCF = a;
            }
        }
        System.out.println(HCF);

        }

    }

/*The highest common factor (HCF) of two or more numbers is the greatest number which divides each of them exactly.
Greatest Common Measure(GCM) and Greatest Common Divisor(GCD) are the other terms used to refer to HCF.
Example: HCF of 60 and 75 = 15 because 15 is the highest number which divides both 60 and 75 exactly.

Procedure to find the HCF or GCD of two numbers,
1) Take two numbers
2) Declare a temporary variable hcf to store the HCF value
3) Take an iterator variable and initialize it with 1 i.e. i=1
4) Check both numbers are divisible by iterator variable (i) or not?
5) If yes then hcf = i
6) Increase the iterator variable by 1
7) Repeat 4 to 6 step until the iterator variable is less than both numbers
 */