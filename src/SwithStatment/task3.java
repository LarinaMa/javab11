package SwithStatment;

import java.util.Locale;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your favorite fruit? Please enter it");
        String fruit = input.nextLine().toLowerCase();
        switch (fruit) {
            case "mango":
                System.out.println("We have your mango in our store");
                break;
            case "orange":
                System.out.println("We have your orange in our store");
                break;
            case "apple":
                System.out.println("We have your apple in our store");
                break;
            case "banana":
                System.out.println("We have your banana in our store");
                break;
            case "kiwi":
                System.out.println("We have your favorite fruit in our store");
                break;
            default:
                System.out.println("We do not have your favorite fruit in our store");
        }
    }

}
