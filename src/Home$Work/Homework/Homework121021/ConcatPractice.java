package Home$Work.Homework.Homework121021;

import java.util.Scanner;

public class ConcatPractice {
    public static void main(String[] args) {
        /*
        ask the user to enter two String value
  - if both string length is same concatenate them together then print the result.
  - if both String length is not same then omit last chars from the longer string
    so it is the same length as the shorter string.
    After making both strings the same length then concatenate them and print the result.
     NOTE:!!!!! Please use scanner next() method and do not use nextLine() for this task.!!!!!!!!!!!!
      EXAMPLE-1: String 1: "Cell" String 2: "Phone" Output: "CellPhon"
      EXAMPLE-2: String 1: "Cable" String 2: "Mic" Output: "CabMic"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string 1"); // cell      cable    moon
        String str1 = input.next();           // 1234      12345    1234
        int str1Length = str1.length();//          4         5        4
        System.out.println("Enter string 2"); // Phone     Mic      Soon
        String str2 = input.next();    //        12345     123      1234
        int str2Length = str2.length(); //        5         3         4
        if(str1Length == str2Length){ //         4 != 5    5!=3   4==4
            System.out.println(str1.concat(str2));// moonSoon


        } else if (str1Length > str2Length){ //  5>3 --> true;
            System.out.println(str1.substring(0 , str2Length).concat(str2));// cable --> cab +mic = cabMic
        } else{    //      4>5 && 4==5 -->   false                          // 12345     123  123   123123
            System.out.println(str1.concat(str2.substring(0 , str1Length))); //cell + (Phone-->Phon) = cellPhon
        }                                                                    //1234    12345   1234    12341234
    }
}
//  length()	                               Returns the length of a specified string
//  substring(int startIndex, int endIndex)    Returns a new string which start from a specified string
//                                               and extends to the endIndex – 1 of this string.
//  concat()	                               Appends a string to the end of another string