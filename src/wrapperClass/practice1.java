package wrapperClass;

public class practice1 {
    public static void main(String[] args) {
        byte b = 2;
        Byte bt = new Byte(b);
        System.out.println(bt);//2
        boolean bl = new Boolean(true);
        System.out.println(bl);//true
        boolean bl2 = new Boolean(false);
        System.out.println(bl2);//false
        boolean bl3 = new Boolean("true");
        System.out.println(bl3);//true
        boolean bl4 = new Boolean("example");
        System.out.println(bl4);//false
    }
}
