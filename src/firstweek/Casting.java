package firstweek;

public class Casting {
    public static void main(String[] args) {
        /*
        Type casting is when you assign a value of one primitive data type to another type.
        In Java, there are two types of casting:
        Implicit Casting (Widening) (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double

       Explicit Casting (Narrowing) (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte
        */
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        //Widening Casting       System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
        //Narrowing Casting
        double myDouble1 = 9.78d;
        int myInt1 = (int) myDouble1; // Manual casting: double to int
        System.out.println(myDouble1);   // Outputs 9.78
        System.out.println(myInt1);      // Outputs 9

                byte b1 = 12;
                short sh1 = b1;
                short sh2 = 3;
        /*
        byte b2 = sh2; compile time error, you can not store large data type into smaller data type
        short result1 = b1 + sh2; compile time error
         */
                byte b2 = 2;
                //byte result2 = b1 + b2;compile time error
                int result2 = b1 + b2;// numeric promotion happens and java promotes smaller data types to int
                int  i1 = 4;
                double d1  = i1;
                //int i2 = d1; compile time error
                float f1  = 1.2f;
                float f2 = 3.4f;
                float result3 = f1+f2;
                double d3 = result3;
                //float f3 = d3; compile time error
                double d4 = 1.2;
                //float result = f1 + d4; compile time error
        int num1 = 23;
        long l11 = num1; // implicit casting(happens by Java)
        short sh11 = (short)num1;// explicit casting(you have to do it
        byte by1 = 1;
        byte by2 = 2;
        // short sum1 = by1 + b2; compile time error
        //due to numeric promotion java wants to store results into large data type (int)
        // that s why it is not compiling
        short sum2 = (short) (by1+ by2); // explicit casting
        // short sum2 = (short) (by1) + (short)by2;; this is still individual casting for each variable
        //result is not casted yet
        int price = (int) 750.99; // if you wish your variable
        // which is double number to be int
        System.out.println(price); // will print 750
        double samsung = 900.45;
        int priceSamsung = (int) samsung;

        System.out.println("Samsung --> "+samsung);
        System.out.println("Price Samsung in int --> " +priceSamsung);
    }
}
