package loops.ForLoop;

public class MultiVariablesPractice {
    public static void main(String[] args) {

        for (int a = 3, b = 10; a < 8 && b > 0; a++, b--) {
            System.out.println("a is = " + a + " b is -->" + b);
        }
        System.out.println("======================");
        int x = 1;
        int y = 5;
        for (; x < y; x++, y--) {
            System.out.println("Hello");
        }
        System.out.println("======================");

        for (x = 1, y = 5; x < 10 || y > 0; x++, y--) {
            System.out.println("Bye");
        }
        System.out.println("======================");
        int k;
        for (x = 1, y = 5, k = 9; x < 10 || y > 0; x++, y--, k++) {
            System.out.println("Bye");
            System.out.println("k --> " + k);
            System.out.println(x*k);
            String str = k >= y ? "Saturday" : "Sunday";// print 9 times because it inside the loop
            System.out.println(str);
        }
    }
}