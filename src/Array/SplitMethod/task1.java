package Array.SplitMethod;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        // split(); --> it will separate given string from desired char/index
        // return type of the split() method is string array
        String str = "Stay safe and healthy";
        String [] words = str.split(" ");

        System.out.println(str); //Stay safe and healthy
        System.out.println(Arrays.toString(words));// [Stay, safe, and, healthy]
        // print out every single word as ; ...***
        for(String word:words){
            System.out.print(word+"***   ");
            System.out.println(word.concat("...***"));
        }
    }
}
/*
Stay safe and healthy
[Stay, safe, and, healthy]
Stay***   Stay...***
safe***   safe...***
and***   and...***
healthy***   healthy...***
 */