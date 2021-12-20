package loops.While_DoWhile;

import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("type a String");
        String str = input.nextLine();
        int b = 0;
        while (b < str.length()) {
            System.out.print(str.charAt(b)+", ");
            b++;
        }
        System.out.println();

            String str1 = str;
            int lastIndex = str1.length() - 1;

            while (lastIndex >= 0) {
                System.out.print(str1.charAt(lastIndex) + ", ");
                lastIndex--;
            }
        }
    }
/*
type a String
winter
w, i, n, t, e, r,
r, e, t, n, i, w,
 */