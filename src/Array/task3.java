package Array;

import java.util.Arrays;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
         /*
        -ask user, how many names that s/he wants to store in array
        -store those names by getting it from user in to array that is called 'names'
        if name has 5 or more letters store it in "longName" array
        if name has less than 5 letters store it in "shortName array
        -print them out by using ->Arrays.toString(); method
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many names you want to store?");
        int number = scanner.nextInt();
        String[] longName = new String[number];
        String[] shortName = new String[number];
        scanner = new Scanner(System.in);

        for (int i = 0; i<number; i++){
            System.out.println("enter" + (i+1) + ". name");
            String name = scanner.nextLine();
            if (name.length()>5){
                longName [i] = name;}
            else{
                shortName [i] = name;
            }
        }
        System.out.println(Arrays.toString(longName));
        System.out.println(Arrays.toString(shortName));
    }
}



