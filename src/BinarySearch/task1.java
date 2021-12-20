package BinarySearch;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        /*
        !-Binary_Search
-** array has to be sorted before applying binary search
-binary search will give index number for existing element in the array
-binary search will give possible place for non-existing element in the array
         */
        int[] numbers = {4,6,10,23,1,12};
        System.out.println(Arrays.binarySearch(numbers, 1));//-1
        Arrays.sort(numbers); // [1, 4, 6, 10, 12, 23]
        //     index number       0  1  2   3   4   5
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 1));//0
        System.out.println(Arrays.binarySearch(numbers, 6));//2
        System.out.println(Arrays.binarySearch(numbers, 23));//5
        System.out.println(Arrays.binarySearch(numbers, 17));// -6 indicate 17 is not in the array
        System.out.println(Arrays.binarySearch(numbers, 25));// -7 showing possible place of non-existing element
        System.out.println(Arrays.binarySearch(numbers, -1));// -1
    }
}
