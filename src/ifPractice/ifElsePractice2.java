package ifPractice;

import java.util.Scanner;

public class ifElsePractice2 {
    public static void main(String[] args) {
        /*
         when your order total is more than $1000 you get %20 discount, other wise you get %5 discount
        calculate and print total discount and payment in each case
         */
        Scanner input = new Scanner(System.in);
        System.out.println(" Provide your total order ");
        double order = input.nextInt();
        if (order >= 1000){
            System.out.println("Your total discount is "+ order*0.2);
            System.out.println("Your payment after 20% discount is "+ (order-(order*0.2)));
        } else {
            System.out.println("Your total discount is "+ order*0.05);
            System.out.println("Your payment after 5% discount is "+ (order-(order*0.05)));
        }
    }
}
