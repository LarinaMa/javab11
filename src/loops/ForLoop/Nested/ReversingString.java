package loops.ForLoop.Nested;

import java.util.Scanner;

public class ReversingString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("type your string");
        String str = input.nextLine();
        int strLength = str.length();
      String reverse = "";
        for (int i = str.length()-1; i >= 0; i--){
          reverse += str.charAt(i);
        }
        System.out.println(str);
        System.out.println(reverse);


    }
}
