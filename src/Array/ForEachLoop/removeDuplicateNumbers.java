package Array.ForEachLoop;

import java.util.Arrays;

public class removeDuplicateNumbers {
    public static void main(String[] args) {
        int[] nums = {1,5,7,9,5,8,3,1,9,7};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && nums[i] != 000) {
                    count++;
                    nums[j] = 000;
                }
            }
        }
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