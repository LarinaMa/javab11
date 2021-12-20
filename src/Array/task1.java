package Array;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int [] studentID = new int [5];// 5 is capacity of array
        studentID[0] = 21; // 0 is index number of array
        studentID[1] = 31;
        studentID[2] = 41;// capacity  is 5 but only 3 is used at this point
        System.out.println(studentID);// print [I@1b6d3586 --> memory location of array
        System.out.println(studentID[2]);// 41
        System.out.println(studentID[3]); // 0 --> default value
        studentID[1] = 99;
        System.out.println(studentID[1]);// 99 it was resigned
        System.out.println("=============");
        for (int i=0; i< studentID.length; i++){
            System.out.println(studentID[i]);//  21
                                             //  99
                                            //   41
                                             //   0
                                              //  0

        }
        System.out.println(Arrays.toString(studentID));// [21, 99, 41, 0, 0]
    }
}
