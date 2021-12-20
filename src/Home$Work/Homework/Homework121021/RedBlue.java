package Home$Work.Homework.Homework121021;

import java.util.Scanner;

public class RedBlue {
    public static void main(String[] args) {
        /*
        Using the scanner ask the user to enter any String value.
        If this String has a color like red or blue with lower case print the red or blue.
        Other wise do not print anything. EXAMPLE-1: Input: "xxredyy" Output: red
        EXAMPLE-2: Input: "xbxltue" Output: blue
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter a String value");
        String str1 = input.nextLine();
        String str = str1.toLowerCase();
       // if (){}
        if (str.contains("r") && str.contains("e") && str.contains("d")){
            System.out.println("red");
        } else if (str.contains("b") && str.contains("l") && str.contains("u") && str.contains("e")){
            System.out.println("blue");
        } else {
            System.out.println();
        }
    }
}
