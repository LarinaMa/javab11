package Project2;


import java.util.Scanner;

public class task3a {
    public static void main(String[] args) {
         /*
        ask user to enter his balance
write a program that will take a given amount of money and return the number of dollars in quarters,
dimes, nickels, and pennies that make up that given amount
Example 1:
Please enter your balance: 2.36
$2.36 will make 9 quarters 1 dime 0 nickels and 1 pennies
          */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your balance");
        int nickel=0;

        double balance1 = input.nextDouble();// input by user
        int balance = (int) balance1*100;//2.36*100=236
     double dollar = balance/100;//236/100=2-->$2
      dollar = dollar/0.25;// 2/0.25=8 --> quaters

        balance = balance/10;//230/10=23
        int dime = balance%10;//23%10=3 --dime
              int penny = balance%10;//236%10=6 --> penny
        if (penny>5){
            penny = penny-5;
            ++nickel;
        }
        System.out.println("$"+balance1 +" will make "+dime+" dime "+ nickel+" nickel and "+penny+" pennies");
    }
}
