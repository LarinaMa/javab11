package JavaStringMethods;

import java.util.Scanner;

public class isUpperCaseMethod {
    public static void main(String[] args) {
        /*

         */

        /*
         * This example source code demonstrates the use of
         * isUpperCase(char ch) method of Character class.
         */
                      // Ask for user input
                System.out.print("Enter a character:");

                // use scanner to get the user input

                Scanner s = new Scanner(System.in);
                // get a single character
                char value = s.nextLine().toCharArray()[0];

                // close the scanner object
                s.close();

                // check if the user input is upper case or not
                boolean checkBool = Character.isUpperCase(value);
                // print result
                if(checkBool){
                    System.out.println("User input \'"+value+"\' is Upper case");
                }
                else{
                    System.out.println("User input \'"+value+"\' is not Upper case");
                }

            }

        }


