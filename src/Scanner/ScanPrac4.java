package Scanner;

import java.util.Scanner;

public class ScanPrac4 {
    public static void main(String[] args) {
        String name = "david";
        System.out.println( "My is  " + name);
        //creating Scanner object
     Scanner input = new Scanner(System.in);
        System.out.println("Please enter your last name");
        String lastName = input.nextLine();
        System.out.println(lastName);
        System.out.println(lastName);

        // Task: Ask user to enter his/her city name and
        // print as: "<name><lastName> you are living in <city>"
        System.out.println("Please enter your city name");
        String city = input.nextLine(); // implemented method to take string input
        System.out.println(name + " "+ lastName + " you are living in "+city);
        System.out.println("Please enter your age");
        int age = input.nextInt(); // implemented method to take integer
        System.out.println(name + " your age is very good age. That is >> " + age);
        System.out.println("Please enter your height in feet and inches (i.e.: 5.8)");
        double height = input.nextDouble(); // for double
        System.out.println("your height is " + height);
        System.out.println("Please enter your address");
        // re-initialize scanner
        input = new Scanner(System.in);
        String address = input.nextLine();
        System.out.println("Is this correct address you provided?"+address);


    }
}

