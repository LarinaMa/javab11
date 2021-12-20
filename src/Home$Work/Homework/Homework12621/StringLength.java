package Home$Work.Homework.Homework12621;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        /*
        Using scanner ask user to enter one String value.
        If string length is bigger than or equals to 3 print the string without first and last char.
        If the length is smaller than 3 print as it is. (For this task you need to use if statement).
        Example 1: Please enter the String value: test The output is: es
        Example 2: Please enter the String value: Hello The output is: ell
         */
        Scanner input = new Scanner(System.in);
        String stringFUser = input.nextLine();
        int b = stringFUser.length();
        if (b >= 3){
            System.out.println(stringFUser.substring(1 ,b-1));

        } else {
            System.out.println(stringFUser);
        }
    }
}
