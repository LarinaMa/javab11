package Project2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        /*
        Write program will add up the value of a number of quarters, dimes, nickels, and pennies.
        The number of each type of coin is input by the user.
        The total value is printed in dollars.
 Example:
Quarters:   5
Dimes:      4
Nickels:    3
Pennies:    2
The total in dollars is $1.82
Description
         */
        // 1)convert everything to pennies
        // 5 * 25 = 125        125 + 40 + 15+ 2= 182
        // 4 * 1  = 40
        // 3 * 5  = 15
        //           2
        //
        // 2)convert pennies to $ --> 182/100 = $1.82

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how many quarters you have");
        int quarter = input.nextInt();
        quarter = quarter*25;// 5*25=125
        System.out.println("Please enter how many dimes you have");
        int dime = input.nextInt();
        dime = dime*10;//  4*10=40
        System.out.println("Please enter how many nickels you have");
        int nickel = input.nextInt();
        nickel = nickel*5;//3*5=15
        System.out.println("Please enter how many pennies you have");
        int penny = input.nextInt();
      double sum = (double)(quarter+dime+nickel+penny)/100; // (125 + 40 + 15+ 2)/100 = 1.82
        System.out.println("The total in dollars is $"+sum);





    }
}
