package TernaryOperator;

public class task2 {
    public static void main(String[] args) {
        int a = 3, b = 5, k = 7;
       int r1= a >= k ? a+k++ : ++b+k;// (5+1)+7 = 13
        System.out.println(r1);
    }
}
