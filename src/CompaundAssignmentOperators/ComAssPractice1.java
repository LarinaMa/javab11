package CompaundAssignmentOperators;

public class ComAssPractice1 {
    public static void main(String[] args) {
        float fl = 4.4f;
        int i = 4;
        System.out.println("4.4 = 4 --> " +(fl==i));// = --> equals to
        boolean comp1 = fl==i;
        System.out.println(comp1);
        System.out.println(18==18);
        System.out.println('a'=='A');
        System.out.println("test" =="tesT");
        //!= ---> if two values are not the same
        // 5 != 6 --> if the values are not the same it will return TRUE
        // 6 != 6 --> if the values are the same it will return FALSE
        int num1 = 55;
        int num2 = 66;
        boolean comp2 = num1 != num2; // != --> not equals to
        System.out.println(comp2); //true
        System.out.println(18 != 18); //false
        // <--- less than --> if the first value smaller than the second value it will return TRUE
        // 30 < 29 --> false
        // 32 < 54 --> true
        System.out.println(num1 < num2); //true
        System.out.println(55< num1); // false 55<55? NO
        System.out.println('c'< 'd'); // true
    }
}


