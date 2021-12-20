package Home$Work.Homework.Homework1;

import java.util.Scanner;

public class CapacityCalculator {
    public static void main(String[] args) {
        /*
        Create the application to print true if there is enough space for NBA game
        and print false if there is no ticket for the game.
        To be able to calculate the result you need to store max capacity of the stadium
        and total number of ticket which is sold. If the there is no ticket left print false,
         otherwise print false.

Example 1: Please enter max capacity: 18 Please enter number of sold tickets: 20 true

Example 1: Please enter max capacity: 25 Please enter number of sold tickets: 25 false
         */
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter max capacity:");
        // create int variable
        int capacity = scanner.nextInt();
        System.out.println("Please enter number of sold tickets");
        // create int variable
        int soldTicket =scanner.nextInt();
        // create boolean variable for result
        boolean enoughSpace = capacity > soldTicket;

        // print only result
        System.out.print(enoughSpace);
    }
}

