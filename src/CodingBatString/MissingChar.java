package CodingBatString;

import java.util.Scanner;

public class MissingChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("type your word");
        String word = input.nextLine();
        System.out.println("type the number of letter you want to delete");
        int n = input.nextInt();
        String front = word.substring(0, n-1);
        String back = word.substring(n ,word.length());
        System.out.println(front+back);
    }
}
