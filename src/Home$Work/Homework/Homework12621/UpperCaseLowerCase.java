package Home$Work.Homework.Homework12621;

import java.util.Scanner;

public class UpperCaseLowerCase {
    public static void main(String[] args) {
        /*
        Ask user to enter a password

1) If the string doesn't have any upper case letter or any lower case letter print "Your password is not acceptable"

2) If the first character of the password is upper case letter and last character of the password
   is not a letter print "Your password is strong".

3) If first character of the password is lower case letter and last character of the string is upper case
   print "Your password should be improved"

4)For all other conditions print "Your password is not valid"

For this task you should use if else statement.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password");
        String password = input.next(); // Word7
        // uppercase and lowerCase method
        // only effect letters in the string
        // uppercase make all letters uppercase
        //lowercase make all letters lowercase

        // all letters are uppercase
        //length of uppercase and lowercase and password are the same
        String upperCase = password.toUpperCase(); //  Word7 --> WORD7
        // all letters are lowercase
        String lowerCase = password.toLowerCase(); //  Word7 --> word7
        int lastIdexOfPassword = password.length()-1;
        if (upperCase.equals(password) || lowerCase.equals(password) ){
           // WORD7 == WORD7      ||       word7 == word7 --> it means my password doesn't meet requirement
           // the string doesn't have any upper case letter or any lower case letter
            System.out.println("Your password is not acceptable");

        } else if (upperCase.charAt(0) == password.charAt(0) && lowerCase.charAt(0) != password.charAt(0) &&
                //     WORD7       ==             Word7     |    this  can be true only if it is not a letter
                //      W          ==             W         |  this statement making sure 1st letter is uppercase
                //                                          |  letter and not a symbol or integer
                // the first character of the password is upper case letter
                upperCase.charAt(lastIdexOfPassword) == lowerCase.charAt(lastIdexOfPassword)){
            // this condition can be true only if it is not a letter
            //           WORD7       ==          Word7
            //               7       ==              7
            //   last character of the password is not a letter
            System.out.println("Your password is strong");

        } else if (lowerCase.charAt(0) == password.charAt(0) &&
                //     word7       ==             word7
                //     w           ==             w
                // first character of the password is lower case letter
                upperCase.charAt(lastIdexOfPassword) == upperCase.charAt(lastIdexOfPassword) &&
        lowerCase.charAt(lastIdexOfPassword) != password.charAt(lastIdexOfPassword)) {

            //           WORD       ==          WorD
            //              D       ==             D
            //   last character of the string is upper case
            System.out.println("Your password should be improved");
        } else {
            System.out.println( "Your password is not valid");
           }
  }
}
