package Home$Work.Homework.Homework121321;

import java.util.Scanner;

public class PrintDivisibles {
    public static void main(String[] args) {
        /*
        Using a scanner ask the user to provide starting and ending numbers.
        Print the numbers divisible by 3 and 5 between given number
        AND ONLY print count of those numbers which is divisible by 3 and 5.
        EXAMPLE: First number: 5 Second number: 65 Output: 4
      -> Because between 65 and 5 there is only 4 number divisible by 3 and 5
       which are 15 30 45 and 60
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a starting number");
        int numStart = input.nextInt();
        System.out.println("Enter a ending number");
        int numEnd = input.nextInt();
        int reminder3, reminder5;
        int num = 0;
       while (numStart <= numEnd){
           numStart++;
           reminder3 = numStart % 3;
           reminder5 = numStart % 5;
           if (reminder3 == 0 && reminder5 == 0){
               num++;
           }
           }
        System.out.println(num);
       }


       }

