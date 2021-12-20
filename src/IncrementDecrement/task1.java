package IncrementDecrement;

public class task1 {
    public static void main(String[] args) {
        int x = 50, y = 100, z = 200;
        int a, b ,c;
        a = ++x;//51
        b = y++;//100
        c = x + y++ + ++z;
        // 51 + 101 + 201
        System.out.println(y);//102
        System.out.println("a = "+a);// 51
        System.out.println("b = "+b);//100
        System.out.println("c = "+c);// 51 + 101 +201 = 353
    }
}
