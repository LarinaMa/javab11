package Array;

import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        int[] arr = {4,24,10,100,5,78,11,25,55};
        //print out numbers that are greater than 10
int[] largeNum = new int[arr.length];
        for(int i=0;i< arr.length;i++ ){
            if (arr[i]>10){
                largeNum[i] = arr[i];
                System.out.println(arr[i]);
            }
        }
        System.out.println(Arrays.toString(largeNum));
        Arrays.sort(largeNum);
        System.out.println(Arrays.toString(largeNum));
    }
}
