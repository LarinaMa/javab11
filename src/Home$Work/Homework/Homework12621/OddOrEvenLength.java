package Home$Work.Homework.Homework12621;

import java.util.Scanner;
// If this string length is odd number print middle 3 string from given value
// If the string length is even number print string without first letter.

public class OddOrEvenLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string value");
        String inputFUser= input.nextLine();
        String a = inputFUser.substring(1);// --> string without first letter
        int x = inputFUser.length();
        int y = x/2;
       int result = x%2;// used to check odd/even --> result=0--> even
      if (result == 0){
          System.out.println(inputFUser.substring(1));
      } else {
          System.out.println(inputFUser.substring(y-1 , y+2));
      }

    }
}
