package Array;

import java.util.Arrays;

public class CombiningArrays {
    public static void main(String[] args) {
        int[] num1 = {3,4,5};
        int[] num2 = {6,7,8,9};

        int[] numCombined = new int [num1.length+num2.length];
        for (int a = 0; a < num1.length;a++){
            numCombined [a] = num1[a];
        }
        System.out.println(Arrays.toString(numCombined));//[3, 4, 5, 0, 0, 0, 0]
        for (int b = num1.length, c=0; b < numCombined.length; b++, c++) {
            numCombined[b] = num2[c];
        }
        System.out.println(Arrays.toString(numCombined));//[3, 4, 5, 6, 7, 8, 9]
    }
}
