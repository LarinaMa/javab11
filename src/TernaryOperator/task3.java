package TernaryOperator;

public class task3 {
    public static void main(String[] args) {
        int a=3, b=5, k=7;
        int r1 = a>=k ? a + k++ : ++b + k;// (5+1)+7
        //          7   3   7      5+1    7
        //                will be 8 when will be used later if condition true
        System.out.println(r1);//13
        System.out.println(b);//6
        System.out.println(k);//7
        int r2 = k < ++b ?  2 * ++k -2 : --k * 2-1;
        //            7
        System.out.println(r2);//11
        System.out.println(k);//6
        System.out.println(b);//7
        System.out.println(k >= b ? "I got this": false);// false
        System.out.println("test".equals("test") ? "TEST".toLowerCase() : 99);

    }
}
