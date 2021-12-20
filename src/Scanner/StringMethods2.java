package Scanner;

public class StringMethods2 {
    public static void main(String[] args) {
        /*
        .startWith(); --> name.startsWith("Z"); --> returns true
                      --> name.startsWith("Zac"); --> returns true
                      --> name.startsWith("ack"); --> returns false
        .endsWith(); --> name.endsWith("Z"); --> returns false
                      --> name.endsWith("Zac"); --> returns false
                      --> name.endsWith("ack"); --> returns true
                      --> name.endsWith("k"); --> returns true
                      --> name.endsWith("K"); --> returns false
         */
        String brand = "Nike";
        boolean b1 = brand.startsWith("N"); //true
        System.out.println(b1);
        boolean b2 = brand.startsWith("n"); //false
        System.out.println(b2);
        System.out.println(brand.startsWith("Nike"));// true
        System.out.println(brand.startsWith("nike")); // false
        System.out.println(brand.endsWith("e"));// true
        System.out.println(brand.endsWith("Nike")); // true
        System.out.println(brand.endsWith("u"));// false
        System.out.println(brand.endsWith("nike")); // false
    }
}
