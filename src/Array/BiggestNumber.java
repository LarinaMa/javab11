package Array;

public class BiggestNumber {
    public static void main(String[] args) {


    int[] nums = {4,24,10,100,5,78,11,25,55};
    //find biggest number
        int biggest = 0;
        int smallest = 0;
    for (int i=1; i < nums.length; i++ ){
       if (nums[i] > biggest){
           biggest = nums[i];
       }
        }
        System.out.println(biggest);
      /*
        for (int k=1; k < nums.length; k++ ){
            if (nums[k] < smallest){
               smallest = nums[k];
            }
        }
        System.out.println(smallest);
        System.out.println("===================");
        Arrays.sort(nums);
        System.out.println(nums[0]);
       */

    }
    }

