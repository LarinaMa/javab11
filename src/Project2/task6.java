package Project2;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        /*
      Using a scanner enter three different ingredients for the product on the same line.
      Then ask the user to enter any int number.
      Change the first letter of the ingredients starting from the entered number.
      (Ingredients should start with different letters. Please read the example carefully )
Example 1:
    Please enter three ingredients with spaces:
    Milk Peanuts Butter
    Please enter the int number:
    5
    The output is:
    5ilk 6eanuts 7utter
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter three different ingredients for the product on the same line");
        String product = input.nextLine();
        System.out.println("enter any int number");
       int num = input.nextInt();
       String num1 = input.nextLine();
        int indexOfFS = product.indexOf(" ");

        System.out.println(product);
    }
}
