package loops.While_DoWhile;

import java.util.Random;

public class RandonPractice {
    public static void main(String[] args) {
        Random random = new Random(); // random object from random class
        int num1 = random.nextInt();
        System.out.println(num1); // any number can be negative
        int num = random.nextInt(100); // gives positive number < 100
        System.out.println(num);
        int num2 = random.nextInt(5); // gives positive number < 5
        System.out.println(num2);
    }
}
