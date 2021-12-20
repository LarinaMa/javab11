package Array;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        int[] numbers = {4,3,6,7,14,225,6987,36}; // used to assign if you know your array
        System.out.println(numbers[3]); // 7
        System.out.println(numbers[2]); // 6
        numbers [1]=88;
        System.out.println(numbers.length);// 8
        System.out.println(Arrays.toString(numbers));
        for (int m=0; m<numbers.length; m++){
            System.out.println(numbers[m]);
        }
    }
}
/*
7
6
8
[4, 88, 6, 7, 14, 225, 6987, 36]
4
88
6
7
14
225
6987
36

 */