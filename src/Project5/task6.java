package Project5;

import java.util.Locale;
import java.util.Scanner;
/*
Using the scanner ask the user to enter one string value and print only
unique letters combined as String also without any space in the beginning and at the end
example-1: i am happy ---> i am hpy
example-2: contribute ---- contribue
 */
public class task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String");
        String str = input.nextLine().toLowerCase();
        String let , let2 ;
        str=" "+str;
        for (int i = 0; i < str.length(); i++) {
            let = str.substring(i, i + 1);
            for (int j = i + 1; j < str.length(); j++) {
                let2 = str.substring(j, j + 1);
                if (let2.equals(" ")) {
                } else if (let.equals(let2)) {
                    str = str.substring(0, j) + str.substring(j + 1);
                    i = 0;
                }
            }
        }
     str = str.trim();
        System.out.println(str);
    }
}
