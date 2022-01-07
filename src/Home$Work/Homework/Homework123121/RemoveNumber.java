package Home$Work.Homework.Homework123121;

import java.util.Arrays;
import java.util.Scanner;
/*
Create the int array with numbers following, 10,4,3,55,32,145,443,234,98,32 .
Then, using scanner ask user to provide any number from given array,
then remove the value from array and put 0 instead of that number and PRINT the array.
If array doesn't contain the number PRINT "false".
Example: Given Number: 145 Output: [10, 4, 3, 55, 32, 0, 443, 234, 98, 32]
Example 2: Given Number: 2000 Output: false
Example 2: Given Number: 32 Output: [10, 4, 3, 55, 0, 145, 443, 234, 98, 0]
 */
public class RemoveNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {10, 4, 3, 55, 32, 145, 443, 234, 98, 32};
        System.out.println("Please enter number from array");
        int num = input.nextInt();
        boolean numInArray = false;
        for (int i = 0; i < arr.length; i++) {

            if (num == arr[i]) {
                arr[i] = 0;
                numInArray = true;
            }
         }
        if( numInArray==true){
        System.out.println(Arrays.toString(arr));}
       if ( numInArray==false){
        System.out.println(numInArray);}
    }

}
/*
 String unique="";
            for(int i = 0; i<array.length;i++) {
                boolean isUnique = true;
                for (int k = 0; k < i; k++) {
                    if (array[i] == array[k]) {
                        isUnique = false;
                    }
                }
                if (isUnique) {
                    unique += array[i] + " ";
                }
            }
            String[] uniqueeNumbers= unique.split(" ");
            System.out.println(Arrays.toString(uniqueeNumbers));
        }
 */