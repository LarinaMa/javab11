package loops.ForLoop;

public class Practice2 {
    public static void main(String[] args) {
        // print out numbers between 0 to 5 decreasing by using for loop
        // 5 4 3 2 1 0

        for (int num = 5; num >= 0; --num) {
            System.out.println(" " + num);
        }
        // find the total of numbers fron 1 to 5 <1+2+3+4=10
        int sum = 0;
        for (int num1 = 1; num1 < 5; num1++) {
            sum+=num1;
        }
        System.out.println(sum);
    }
}
