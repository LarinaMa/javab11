package Project2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        /*
        ask user to enter his balance
write a program that will take a given amount of money and return the number of dollars in quarters,
dimes, nickels, and pennies that make up that given amount
Example 1:
Please enter your balance:
2.36
$2.36 will make 9 quarters 1 dime 0 nickels and 1 pennies
         */
        Scanner input = new Scanner(System.in);//Create a Scanner object
        System.out.println("please enter your balance");
        double balance = input.nextDouble();// amount entered by user --> 2.36
        int amount$= (int) balance;// dollar amount --> 2
        // double--> int 2.36 --> 2
        double x = amount$;
        double quarters1 = x/0.25;// formula to convert $ to quarters
        int quarters = (int) quarters1;// quarters amount --> 8

        float reminder1 = (float)(balance-amount$)*100;// (2.36-2.00)*100=36 --> amount of cents

        byte reminder2 = (byte)reminder1;// change amount --> 36
        int reminder3;
        int pennies;
        int nickel;
         reminder3 = reminder2 % 10;// 36 % 10 = 6 pennies
        int dimes = reminder2/10;// 36/10 = 3.6 but because of int type it became 3 dimes
        if (reminder3>=5) { // 5 penny = 1 nickel
            pennies = reminder3-5;
            System.out.println("$"+balance+" will make "+quarters+" quarters "+dimes+" dime "
                    + "1 nickels " +pennies+" pennies");
        } else {
        System.out.println("$"+balance+" will make "+quarters+" quarters "+dimes+" dime "
        +  " 0 nickels " + reminder3+" pennies");}











    }
}
