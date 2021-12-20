package Scanner;

import java.util.Scanner;

public class ScanPrac6 {
                  public static void main(String[] args) {
            String str = "madina";
            System.out.println(str);
            str = str.toUpperCase();
            System.out.println(str);
            String strL = "LARINA";
            System.out.println(strL);
            strL = strL.toLowerCase();
            strL = strL.toLowerCase();
            System.out.println(strL);
            Scanner input = new Scanner(System.in);
            System.out.println("enter your  first name");
            String name1 = input.next();
            System.out.println("enter your  last name");
            String name2 = input.next();
            System.out.println(name1.toLowerCase() + "  " + name2.toUpperCase());
            new Scanner(System.in);
            String str5 = input.nextLine();
            System.out.println("This value of first string " + str5);
            String str6 = input.next();
            System.out.println("This value of second string " + str6);
        }
    }


