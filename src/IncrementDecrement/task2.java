package IncrementDecrement;

public class task2 {
    public static void main(String[] args) {
        int x = 5, y = 2, exp = 10;
       int  a =x+(x>6 ? ++y : --y);
       //      5+(5>6 --> false --> --y = 1) = 6
       exp = exp % a;
      // 10/6 = 1 reminder 4
        System.out.println("exp = " +exp); // 4
    }
}
