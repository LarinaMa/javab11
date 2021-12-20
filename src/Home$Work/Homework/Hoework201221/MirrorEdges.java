package Home$Work.Homework.Hoework201221;

import java.util.Scanner;

public class MirrorEdges {
    public static void main(String[] args) {
/*
Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
In other words, zero or more characters at the very begining of the given string,
and at the very end of the string in reverse order (possibly overlapping).
For example, the string "abXYZba" has the mirror end "ab". -> Because ab is in the begining also at the end.
Examples:
Input : abca Output: a
Input : aba Output: aba
Input : eerqwertyree Output: eer
 */
       Scanner input = new Scanner(System.in);
        System.out.println("Enter a string value");
        String str = input.nextLine();
        int a= str.length()-1;
       for ( int i=0;i<str.length();i++,a--){
            if (str.charAt(i) == str.charAt(a)) {
                System.out.print(str.charAt(a));;
                            }
        }

    }
}
