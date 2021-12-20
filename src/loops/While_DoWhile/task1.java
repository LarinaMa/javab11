package loops.While_DoWhile;
// finding divisor
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        /*
        ask user to enter an integer value and find the divisor of the giving number
        10 ---> 1, 2, 5, 10
        print out .... is divisor of
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a whole number");
        int numberUser = input.nextInt();
        int divisor = 1;
        while (divisor <= numberUser){
          if (numberUser % divisor == 0){
              System.out.println("Number " +numberUser+  " can be divided by " + divisor);
          }
            divisor++; // has to be out of loop
            // because 10/3 has reminder, and it will stop the loop
        }

    }
}
/*
Please enter a whole number
10
Number 10 can be divided by 1
Number 10 can be divided by 2
Number 10 can be divided by 5
Number 10 can be divided by 10
 */
/*
10/1 = 1 reminder = 0              --> true
10/2 = 5 reminder = 0              --> true
10/3 = 3.3333 reminder != 0 --> false
10/4 = 2.5 reminder != 0    --> false
10/5 = 2 reminder = 0              --> true
10/6 = 1.666 reminder != 0  --> false
10/7 = 1.428 reminder != 0  --> false
10/8 = 1.25 != 0            --> false
10/9 =1.111 != 0            --> false
10/10 = 1  reminder = 0            --> true
 */