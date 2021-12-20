package Home$Work.Homework.Homework121021;

import java.util.Scanner;

public class WithOutX {
    public static void main(String[] args) {
        /*
        Given a string, if one or both of the first 2 chars is 'x', print the string without those 'x' chars,
         and otherwise print the string unchanged.
         Examples: "xHi" → "Hi" "Hxi" → "Hi" "Tesxt" → "Testxt"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string value");
        //    index number --->                 012345  01234  01234   012345
        String str = input.nextLine(); //       xxtest  txest  xtest   tesxxt
        String str1 = str.substring(0, 2);  //  xx      tx     xt      te
        //                                      01      01     01      01
        //substring(int startIndex, int endIndex)
        //Returns a new string which start from 0 and extends to the endIndex – 1 of this string ( 2-1 = 1)
        String str2 = str.substring(2);//         test    est    est     sxxt
        //                                        2345    234    234     2345
// substring(int startIndex)--> Returns a new string which start from 2nd index
//                              and extends to the end of this string.
        if (str1.contentEquals("xx") ){ // xx (from xxtest) contains xx --> true
            System.out.println(str.substring(2)) ;//  xxtest --> test

        } else if (str1.endsWith("x")) { // tx (from txest) ends with x --> true
            System.out.println(str1.substring(0, 1).concat(str2));// xtest --> test
        } else if (str1.startsWith("x")) { //xt (from xtest) starts with x --> true
                System.out.println(str1.substring(1).concat(str2)); //xtest --> test
        }
        else { // tesxxt  t != x; e != x;  te != xx
            System.out.println(str); // tesxxt --> unchanged
        }
    }
}
// The endsWith() method   --> checks whether a string ends with the specified character(s).
// true - if the string ends with the specified character(s)
// false - if the string does not end with the specified character(s)
//The startsWith() method  --> checks whether a string starts with the specified character(s).
// true - if the string starts with the specified character(s)
// false - if the string does not start with the specified character(s)
