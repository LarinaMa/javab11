package Home$Work.Homework.Homework121321;

import java.util.Scanner;

public class ReplaceWithA {
    public static void main(String[] args) {
        /*
       Using the scanner ask the user to provide String value.
       Then replace all the char of the String with 'a' using loop
       PRINT IN EVERY STEP.
       Success Output: "auccess" "aaccess" “aaacess” "aaaaess" "aaaaass" "aaaaaas" "aaaaaaa" “aaaaaaa”
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string value");
        String str = input.nextLine();
        String str1 = str;
        int strLength = str.length();
        int n = 1;
        String a = "";
        while (n<=strLength ){
            a += "a";
            System.out.println(a+str.substring(n));
            ++n;
        }
        System.out.println("================");
        System.out.println("another solution");
        String A = "a";
        for(int i=1; i <= str1.length(); i++){
            System.out.println(A+str1.substring(i));
            A+= "a";
        }
    }
}