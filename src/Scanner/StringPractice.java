package Scanner;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        /*
        .toLowerCase();
        .toUpperCase();
        ! if you will not reassign the string it will not change its value
         */
        String str = "madina";
        System.out.println(str);
        str = str.toUpperCase(); //reassign the string
        System.out.println(str);
        String strL = "LARINA";
        System.out.println(strL);
        strL = strL.toLowerCase();

        strL = strL.toLowerCase(); //reassign the string
        System.out.println(strL);
    Scanner input = new Scanner(System.in);


        System.out.println("enter your  first name");
        String name1 = input.next();
        System.out.println("enter your  last name");
        String name2 = input.next();
        System.out.println(name1.toLowerCase() + "  " + name2.toUpperCase());
        //when we use nextLine() we can enter multiple words
        // when use next it will not take more than one word
        Scanner scanner1 = new Scanner(System.in);
        String str5 = input.nextLine();
        System.out.println("This value of first string " + str5);
        String str6 = input.next();
        System.out.println("This value of second string " + str6);


    }
    }
