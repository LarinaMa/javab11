package firstweek;

public class ReminderPractice {
        public static void main(String[] args) {
            //modulus--> % --> reminder (left over after division)
            int num1 = 45;
            int num2 = 6;
            int remainder1 = num1 % num2; // 45/6 = 7 reminder 3
            System.out.println(" Remainder1 is >> " + remainder1);
            // find the sum of digit from giving number
            // 123--> 1+2+3 = 6 -->> sout(sum is >> <sum>)
            // if you divide any number by 10 reminder will be the last digit
            // 123 % 10 --> 3
            //  12 % 10 --> 2
            //   1 % 10 --> 1
            int MyNum = 123;
            int digit3 = MyNum % 10;
            MyNum = MyNum / 10;
            int digit2 = MyNum % 10;
            MyNum = MyNum / 10;
            int digit1 = MyNum % 10;
            System.out.println(digit1);
            System.out.println(digit2);
            System.out.println(digit3);
            int sum = digit1 + digit2 + digit3;
            System.out.println("The sum is = " + sum);
            // find the product of digits from given number
            // 456 --> 4 * 5 * 6 = 120 sout (The product is + " + <product>
            int num  =  456;

            int d1 = num % 10;
            num =num/10;

            int d2 = num % 10;
            num =num/10;

            int d3 = num % 10;
            num =num/10;

            int product = d1*d2*d3;
            System.out.println("The product is = "+(d1 * d2 * d3));
            System.out.println("The product is = "+product);

        }
        }
