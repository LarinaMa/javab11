package Project2;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        /*
        Using scanner enter String (any two words) value with spaces in the beginning and at the end.
        In this input, the second word is not starting with the upper case, using string methods change
        the letter with upper case and print it
Example: " Natural black " --> " Natural Black "
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String (any two words) value with spaces in the beginning and at the end");
        String str = input.nextLine();
        String str1 = str.trim();
        int a = str1.indexOf(" ");
        System.out.println(str);
    }
}
