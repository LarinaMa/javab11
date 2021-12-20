package ifPractice;

import java.util.Scanner;
/*
find out if zipcode is even number or odd number?
 */
public class ifElsePractice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Provide your zipcode ");
        int zipcode = input.nextInt();
        if(zipcode %2 ==0){
            System.out.println("Your zipcode is even number");
        } else {
            System.out.println("Your zipcode is odd number");
        }

            }
}
