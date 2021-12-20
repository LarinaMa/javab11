package firstweek;

public class ArithmetcOperatorsPractice {
    public static void main(String[] args) {
        // addition            (+)
        //subtraction          (-)
        //multiplication       (*)
        //division             (/)
        //reminder (left ofer) (%) 5/2=2 reminder =1
        int num1 = 3;
        int num2 = 4;
        System.out.println(num1 + num2);// will print: 7 (3+4)
        System.out.println("Total is: " + num1 + num2); // will print:  Total is: 34
        int sum = num1 + num2;
        System.out.println(sum); // will print 7 (3+4)
        int difference;
        difference = 10 - num2;
        System.out.println("difference is = " + difference);// will print: difference is = 6
        // 10-4 = 6; difference = 10-num2 and num2 = 4
        double product = difference * num2; //(10-4)*4=24
        System.out.println(product);// will print 24
        double division = product / 3;// 24/3=8
        System.out.println(division);//will print 8
        product = product * division;//24*3=192
        System.out.println(product);//will print 192.0
        int division2 = 5 / 2; //5/2=2.5
        System.out.println(division2);// will print 2 instead 2.5 because int (whole number) product(double)=whole number
        float division4 = 5 / 2f;
        System.out.println(division4);
        float division5 = num2 / num1;
        System.out.println(division5);

        int a = 11;
        int b = 5;
        int reminder1 = a % b;
        System.out.println("The left over of 11/5 is + " + reminder1);
        int x = 13;
        int y = 5;
        int reminder2 = x % y;
        System.out.println("The left over of 13/5 is + " + reminder2);// will print 3
        System.out.println(25 % 21);// will print 4 --> 25/21 = 1 reminder 4
        /*

         */
        int result = a + b * x - y / a * b + x % 2;

    }
    }
