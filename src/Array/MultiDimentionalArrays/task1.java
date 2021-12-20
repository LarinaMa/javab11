package Array.MultiDimentionalArrays;

import java.util.Arrays;

public class task1 {
    public static void main(ArrPractice[] args) {
        /*
        int[] zipCodes = new int[5]; --> one-dimensional integer array with capacity of 5
        int[] zipCodes1 = {1,2,3,4,5};
        =====================================
        int [][] numbers = new int[4][3]; ---> two-dimensional integer array; 3 is a capacity of the inner array
        1   Winter: December,January, February
              0        0       1      2     ---------> index number
        2   Spring: March, April, May
              1       0       1     2
        3   Summer: June, July, August
              2       0     1      2
        4   Fall: September, October, November
              3        0        1        2
        large array [4]------> season
        inner array [3]------> month
        four seasons
        every season has 3 month
         */
        int [][] numbers = new int [2][3];
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers)); //[[I@4554617c, [I@74a14482]
        System.out.println(numbers[0][0]); //0
        System.out.println(numbers[0][1]);//0
        numbers[0][0] = 22;
        numbers[0][1] = 33;
        numbers[0][2] = 44;
        numbers[1][0] = 55;
        numbers[1][1] = 66;
        numbers[1][2] = 77;
        System.out.println(Arrays.deepToString(numbers));//[[22, 33, 44], [55, 66, 77]]
        System.out.println(numbers[1][1]);//66
        System.out.println("==========");
       // numbers[0][3] = 88; Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
       // System.out.println(numbers[0][3]); 88 is not in the array,the biggest index in the array is 2
        for (int i=0; i<numbers.length; i++){
            //System.out.println(Arrays.toString(numbers[i])); //[22, 33, 44]
               for(int k=0; k< numbers[i].length; k++){
                System.out.print(numbers[i][k]+ " "); // 22 33 44 55 66 77
            }
        }
        System.out.println();
        System.out.println("===============");
//[[22, 33, 44], [55, 66, 77]]
        for (int[] nums:numbers){
            for (int num:nums){
                System.out.println(num);
            }
        }
    }
}
