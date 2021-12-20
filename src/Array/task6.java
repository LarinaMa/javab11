package Array;

import java.util.Arrays;

public class task6 {
    public static void main(String[] args) {
        int[] arr = {4, 24, 10, 100, 5, 78, 11, 25, 55};
        // find the sum of numbers which are less than 10 from a given array
        int[] largeNum = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 10) {
                sum =sum+arr[i];
                largeNum[i] = arr[i];
                System.out.println(arr[i]);
            }
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(largeNum));
        Arrays.sort(largeNum);
        System.out.println(Arrays.toString(largeNum));
    }
}
/*
4
5
9
[4, 0, 0, 0, 5, 0, 0, 0, 0]
[0, 0, 0, 0, 0, 0, 0, 4, 5]

 */