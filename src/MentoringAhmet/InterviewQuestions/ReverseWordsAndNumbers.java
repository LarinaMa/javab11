package MentoringAhmet.InterviewQuestions;

import java.util.Locale;
import java.util.Scanner;

public class ReverseWordsAndNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type your word");
        String word = scanner.nextLine().toLowerCase();
        String strReverse = "";
        for(int i= word.length()-1; i>=0; i-- ){
            strReverse = strReverse+word.charAt(i);
        }
        System.out.println(strReverse);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int a;
        while (num != 0) {
            a = num % 10;
            num = num / 10;
            System.out.print(a);
        }
    }

}
