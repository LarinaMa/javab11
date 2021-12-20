package ifPractice;

import java.util.Scanner;

public class ifPractice2 {
    public static void main(String[] args) {
         /*
    military time
    if hour <12 print Good morning
    if hour 12 < hour<18 print good afternoon
    if hour <18 print good evening
     */
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter hour as:  1 - 24");
        int hour = (int)sc.nextDouble();
        if (hour < 12 && hour >= 0 ){
            System.out.println("Good morning");
        }
        if (hour >= 12 && hour < 18 ){
            System.out.println("Good afternoon");
        }
        if (hour >= 18 && hour < 24 ){
            System.out.println("Good evening");
        }
        if (hour < 0 || hour > 23 ){
            System.out.println("check your time");
        }
    }
}


