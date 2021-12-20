package Home$Work.Homework.Homework121021;

import java.util.Scanner;

public class SubstringPractice {
    /*
    Using the scanner ask the user to enter one String value.
    If the string length is bigger than or equals to 3 print the string without first and last char.
    If the length is not bigger than 3 print as it is. (for this task you need to use if statement).
    Example 1: Please enter the String value: test The output is: es
    Example 2: Please enter the String value: Hello The output is: ell
     */
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string"); //test
                //                          1234
    String str = input.nextLine();
if (str.length()>= 3){ // 4 > 3 ---> true
    System.out.println(str.substring(1 , str.length()-1)); //test --> es
    } else {
    System.out.println(str);
    //System.out.println(str.substring(1 , str.length()-1));
}
}



    }

