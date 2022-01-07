package Home$Work.Homework.Homework010722;

import java.util.Arrays;

public class Duplicates {
    /*
    Create a public method named duplicates that takes
two int arrays as parameters and returns common elements of both arrays as an int array.
IF there is no common element of arrays return null.
NOTE: USE SORT METHOD ON ARRAY BEFORE YOU RETURN IT.
For example:
 array 1 -> [1,2,3,45,6,6,7,9,8] and array 2 [2,3,9,10,11,12]

 return int array is [2,3,9] -> !!array is sorted

 example 2: array 1 -> [1,1,1,1,1,1,1,1] array 2 -> [1,1,2]

 return int array is [1]

 example 3 : array 1 -> [0,1,1,1,0]  array 2 -> [2,9,90]

 return null   -> because there is no common element for arrays.

 NOTE: This question might be harder than it seem, and it can take time .
 Please make sure you covered all posibilities and your return type name etc. all correct.
 I tested this task with my solution and it passed so if you implement correct solution method on main.java,
 test shall pass.


     */

        public static int [] commonElements(int []a, int [] b){
            int count=0;
            for(int i=0;i<a.length;i++) {
                for(int j=0;j<b.length;j++) {
                    if(a[i] == b[j]) {
                        count++;
                    }
                }
            }
            int []array= new int[count];

            for(int i=0;i<a.length;i++) {
                for(int j=0;j<b.length;j++) {
                    if(a[i] == b[j]) {
                        for (int k=0; k<count; k++){

                            array[k]=a[i];
                        }
                    }
                }
            }
            return array;
        }


        /*
        int[] den = new int[nums.length - count];
        for (int i = 0, k = 0; i < nums.length; i++) {
            if (nums[i] == 000) {
            } else {
                den[k] = nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(den));
    }
    }
         */
    public static void main(String[] args) {
        int[] a = {1,2,3,45,6,6,7,9,8};
        int[] b ={2,3,9,10,11,12};
        System.out.println(commonElements(a, b));

        System.out.println(Arrays.toString(commonElements(a, b)));

    }

}




