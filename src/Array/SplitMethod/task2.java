package Array.SplitMethod;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        String str = "Stay safe and healthy";
        String str1 = "Stay safe and healthy";
        String str3 = "Stay safe and healthy";
        String [] words = str.split("a");
        System.out.println(str);//                     Stay safe and healthy
        System.out.println(Arrays.toString(words));// [St, y s, fe , nd he, lthy]
        String [] words1 = str1.split("a",2);
        System.out.println(Arrays.toString(words1));// [St, y safe and healthy]
        String [] words2 = str1.split("a",4);
        System.out.println(Arrays.toString(words2));// [St, y s, fe , nd healthy]

    }
}
