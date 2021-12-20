package TernaryOperator;

import java.util.Locale;

public class task1 {
    public static void main(String[] args) {
        int a = 2, b = 3;
        String result1 = a<b? "Hello" : "Bye";
        System.out.println(result1);// Hello
        //String result2 = a<b     ?   a*b  "Text" : "Bye"; to able to store the result of ternary
        //               boolean       int                //both options has to be same data type
        System.out.println(a<b ? a*b : "Text" ); // 6

       boolean result3 = a >= b ? a == b : a < b;
        System.out.println(result3); // true

       int result4 =  'a' > 'Z' ? 5+6+7: 7-4-1;
       //                           18     2
       //  compares numbers from ASCII table
        System.out.println(result4); // 18
        String str = "David";
       String result5 = str.substring(3).equals("id") ? str.toLowerCase().concat(" is number") : str.toUpperCase().concat(" is String");
        System.out.println(result5); //david is number

        System.out.println(str.equalsIgnoreCase("David") ? str.substring(3).toUpperCase() : str.substring(3).toLowerCase());
        // ID

        int n1 = 2;
        int n2 = 3;
        int result6 = n1% 2 == 0 ? 5 : 6;

    }
}
