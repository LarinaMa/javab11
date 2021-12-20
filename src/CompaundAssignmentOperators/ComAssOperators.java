package CompaundAssignmentOperators;

public class ComAssOperators {
    public static void main(String[] args) {
        int x = 2, z = 3;
        x = x * z;// simple assignment operator
        System.out.println(x); // output 6 (2 * 3 = 6)

        x *= z; // compound assignment operator
        System.out.println(x); // output 18 (6*3 = 18)
        int a = 10;
        int b = 20;
        int c = 0;


        c = a + b; //10+20=30
        System.out.println("c = a + b = " + c ); // 30

        c += a ; // 30+10=40
        System.out.println("c += a  = " + c ); // 40

        c -= a ; //40-10=30
        System.out.println("c -= a = " + c ); //30

        c *= a ; //30*10=300
        System.out.println("c *= a = " + c ); //300

        a = 10;
        c = 15;
        c /= a ;
        System.out.println("c /= a = " + c ); // 1

        a = 10;
        c = 15;
        c %= a ;
        System.out.println("c %= a  = " + c );

        c <<= 2 ;
        System.out.println("c <<= 2 = " + c );

        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );

        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );

        c &= a ;
        System.out.println("c &amp;= a  = " + c );

        c ^= a ;
        System.out.println("c ^= a   = " + c );

        c |= a ;
        System.out.println("c |= a   = " + c );
    }
}

