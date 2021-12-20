package Array;

import java.util.Arrays;

public class SortingPractice {
    public static void main(String[] args) {
        int[] zipcodes = {61212,91213,11214,71215}; //[61212, 91213, 11214, 71215]
        System.out.println(Arrays.toString(zipcodes));
        Arrays.sort(zipcodes);// it will arrange the data in ascending order (from smaller to large)
        System.out.println(Arrays.toString(zipcodes));//[11214, 61212, 71215, 91213]
        String[] colors = {"violet", "pink", "red","white","black"};
        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));//[black, pink, red, violet, white]
        String[] colors1 = {"violet", "Pink", "Red","red","White","black"};
        Arrays.sort(colors1);//uppercase go 1st, if 1st letter same, it will compare 2ng letter
        System.out.println(Arrays.toString(colors1));//[Pink, Red, White, black, red, violet]
    }
}
