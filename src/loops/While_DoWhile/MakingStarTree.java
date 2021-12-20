package loops.While_DoWhile;

import java.util.Scanner;

public class MakingStarTree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("type the number");
        int num = input.nextInt();
        String star = "*";
        int x = 0;
        System.out.println(star);
        if (num >= 3 && num <= 10) {
            do {
                star += "*";
                System.out.println(star);
                x++;
            } while (x < num - 1);
        } else{
            System.out.println("check your number");
        }

    }
}



