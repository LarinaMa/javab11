package ifPractice;

import java.util.Scanner;

public class IfPractice1 {
    public static void main(String[] args) {
        // get a number between 1 to 7 from user
        // print the name of the day  for that given number from user
        //1--> Monday
        //2--> Tuesday
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter any number from 1 to 7");
      int number = scanner.nextInt();


        if (number == 1){
        System.out.println("Monday");
         }
        if (number == 2){
            System.out.println("Tuesday");
        }
        if (number == 3){
            System.out.println("Wednesday");
        }
        if (number == 4){
            System.out.println("Thursday");
        }
        if (number == 5){
            System.out.println("Friday");
        }
        if (number == 6){
            System.out.println("Saturday");
        }
        if (number == 7) {
            System.out.println("Sunday");
        }
            if (number >7 || number<1){
                System.out.println("your entry is out of range");
            }
        }
    }

