package TernaryOperator;

public class test4 {
    public static void main(String[] args) {
        int num1=4, num2=5;
       String r1 =  ++num1 >= num2 ? num1< num2 ? "java" : "Selenium" : "Nested";
       //
       //              5        5      5   5
        System.out.println(r1);// Selenium
        String r2 =  num1 < 1 ? num1< num2 ? "java" : "Selenium" : num1<1 ? "Summer" : "Winter";// Winter
        //             false        false                              false
        System.out.println(r2);
        System.out.println(1 == 1 ? "David" : 1>2 ? "Nested 1st side" : 3 == 4 ?"2nd side of 1st" : "2nd side of 2nd" );
        //                    t --> David
        System.out.println(1 == 2 ? "David" : 1 > 2 ? "Nested 1st side" : 3 == 4 ?"2nd side of 1st" : "2nd side of 2nd" );
        //                    f                 f

    }
}
