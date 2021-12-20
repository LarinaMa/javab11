package Home$Work.Homework.Homework1;

public class intToIndivDigits {
    public static void main(String[] args) {
        /*
        54321 = 54320+1
        if we use remainder with 10 --> this will give last digit of number
        int fifthDigit = fiveDigitNumber%10;
        int fourDigitNumber = fiveDigit/10;
        int fourDigit = fourDigitNumber%10;
        int thirdDigitNumber = thirdDigit/10;
        int secondDigit = thirdDigitNumber%10;

         */

        int num = 54321;
        System.out.println("      " + num);
        int digit5 = num % 10; // num = 54320; digit5 = 1
        num = num / 10;           // num = 5432
        int digit4 = num % 10; // digit4 = 2
        num = num / 10;
        int digit3 = num % 10;
        num = num / 10;
        int digit2 = num % 10;
        num = num / 10;
        int digit1 = num % 10;
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);
        System.out.println("==================");
        int num1 = 45678;
        System.out.println("      " + num1);
        int dig5 = num1 % 10;
        num1 = num1 / 10;
        int dig4 = num1 % 10;
        num1 = num1 / 10;
        int dig3 = num1 % 10;
        num1 = num1 / 10;
        int dig2 = num1 % 10;
        num1 = num1 / 10;
        int dig1 = num1 % 10;

        System.out.println(dig1);
        System.out.println(dig2);
        System.out.println(dig3);
        System.out.println(dig4);
        System.out.println(dig5);
    }
}




