package Scanner;
import java.util.Scanner;
public class ScanPrac1 {


        public static void main (String[] args) {
            // Ask user to enter an integer number
            // We will find out if this is an even number or not
            //input is 7
            // Output 7 is even number false
            // input is 8
            // output 8 is even number true
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter an integer number");
            int number = scanner.nextInt();
            boolean isEven = number%2 == 0;
            System.out.println(number+" is even number "+isEven);
        /*
        ask user to enter two integer number
        first integer you provide should be bigger than the second one
        we will print out --> true
        if second number bigger than the first number
        wi will print out false
        !!!!!!!!!!!!!             it is not finished
         */

            System.out.println(" please enter your number1");
            int number1 = scanner.nextInt();
            System.out.println(" please enter your number2");
            int number2 = scanner.nextInt();
            boolean isFirstNumberBigger = number1>number2;
            System.out.println(isFirstNumberBigger);
        /*
         to be able to graduate from school student needs
         attendancy 85%
         grade 80 or higher
         homework 70%
         create a program for teacher
         if student passes you will print --> true
         if student fail you will print --> false
    */
            System.out.println(" please enter  attendancy for student");
            int att = scanner.nextInt();
            System.out.println(" please enter your grade");
         double grade = scanner.nextDouble();
            System.out.println(" please enter your homework");
            int homeWork = scanner.nextInt();
            // how can I print for all of them
            boolean isGrade = grade>=80;
            boolean isAtt = att>=85;
            boolean isHomeWork = homeWork>=70;
            boolean isPass = isAtt && isGrade  && isHomeWork;
            System.out.println(isPass);
        }

    }


