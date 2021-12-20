package SwithStatment;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        /*
        get a number between 1 to 4 from user
        print out name of a season as
        1 --> winter
        2 --> spring
        3 -- summer
        4 --> fall
         */
        Scanner input = new Scanner(System.in);
        System.out.println(" please enter number between 1 to 4");
        int season = input.nextInt();
        switch (season){
           case 1:
               System.out.println("winter");
               break;
            case 2:
                System.out.println("spring");
                break;
            case 3:
                System.out.println("summer");
                break;
            case 4:
                System.out.println("fall");
                break;
            default:
                System.out.println("check your number");

        }
    }
}
