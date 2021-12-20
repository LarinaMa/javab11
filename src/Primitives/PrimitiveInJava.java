package Primitives;

public class PrimitiveInJava {
    public static void main(String[] args) {
        /*
        Java's Built-in Primitive Data types (8)
        boolean --> represent true/false values
        char --> 16 bit represent all characters found in all human languages  (0 to 65,535)
                    A data type that is used to store a single character
        float --> 32 bit single-precision floating point
                   Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double --> 64 bit double-precision floating point
                   Stores fractional numbers. Sufficient for storing 15 decimal digits
        byte --> 8 bit integer (-128 to 127)
        short --> 16 bit Short integer (-32,768 to 32,767)
        int --> 32 bit Integer (-2,147,483,648 to 2,147,483,647)
        long --> 64 bit Long integer (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,808)
        */
        boolean b;
        b = false;
        System.out.println("b is "+b); // b is false
        b = true;
        System.out.println("b is "+b); //b is true
        char  ch;
        ch = 'X';
        System.out.println(ch); // X
        float number5 = 1.5f; //1.5
        //by default, floating-point literals are of type double
        // to specify a float literal, append an F or f to the constant
        System.out.println(number5);
        float number6 = 4; // 4.0
        // not a floating-point , do not require f
        System.out.println(number6);
        double number7 = 7; // 7.0
        System.out.println(number7);
        double number8 = 98.9; // 98.9
        System.out.println(number8);
        byte myAge = 25; // 25
        System.out.println(myAge);
        short num1 = 32123; // 32123
        System.out.println(num1);
        int num3 = 456; // 56
        System.out.println(num3);
        long num4= 12345677L; // 12345677
        // to specify a long literal, append an L or l to the constant
        //an integer literal can always be assigned to a long variable
        System.out.println(num4);
        long myMoney = 200_000_000L; // 200000000
        // this specifies the value 200,000,000
        // just used to make it easier to read the value
        System.out.println(myMoney);

        int myFirstNumber = 111;
        int mySecondNumber = 222;
        System.out.println("My first number is: " +  555); // My first number is: 555
        System.out.println("My second number is: " + 222); // My second number is: 222
        System.out.println("My numbers are= " + myFirstNumber+ " and "+mySecondNumber); // My numbers are= 111 and 222

        int a1, b1, c1; // you can declare and initialize variables in same line if they are same data type
        a1 = 14;
        b1 = 3;
        c1 = 58;
        System.out.println(a1+b1+c1); // 75
        System.out.print(a1);
        System.out.print(b1);
        System.out.print(c1); // 14358
        System.out.println();
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MIN_VALUE);

    }
}
