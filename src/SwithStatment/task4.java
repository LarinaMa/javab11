package SwithStatment;


import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        ask the user to type triangle or square
        calculate the area of that shape
        get length, wight for rectangle from user
        get height and base for triangle from user
        print out name of shape and area of that shape
        rectangle = l*h;
        triangle = (base*hight)/2
         */
        System.out.println("Which shape you want to calculate are of? triangle or rectangle");
        String shape = input.nextLine().toLowerCase();
switch (shape){
    case "triangle":
        System.out.println("Please enter height of your triangle");
        double h = input.nextDouble();
        System.out.println("Please enter base of triangle");
        double b = input.nextDouble();
        System.out.println("The area of triangle is: "+(b*h/2));
        break;
    case "rectangle":
        System.out.println("Please enter width of your rectangle");
        double w = input.nextDouble();
        System.out.println("Please enter length of rectangle");
        double l = input.nextDouble();
        System.out.println("The area of rectangle is: "+l*w);
        break;
    default:
        System.out.println("Check your shape selection");
        break;
}
    }
}
