package loops.ForLoop.Nested;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // civic, ana, 12344321 --> polindrome
        Scanner input = new Scanner(System.in);
        System.out.println("type your String");
        String str = input.nextLine().toLowerCase();
        int strLength = str.length();
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        if (reverse.equals(str)){
            System.out.println("It is a polindrome string");
        } else {
            System.out.println("It is Not a polindrome string");
        }
        System.out.println(str);
        System.out.println(reverse);

    }
}
// int num = 123456
// str = ""+ num