package Array.ForEachLoop;

import java.util.Arrays;

public class ReverseOrderString {
    public static void main(String[] args) {
        String[] colors = {"white", "black", "red", "pink", "orange"};
        String[] reversed = new String [colors.length];

        for (int a= 0; a<colors.length; a++){
           String str="";
            for (int i=colors[a].length()-1;i>=0; i--){
               str += colors[a].charAt(i);
            }
            reversed[a] = str;
        }
        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(reversed));
    }
}
/*
[white, black, red, pink, orange]
[etihw, kcalb, der, knip, egnaro]
 */