package object;

public class MathPractice1 {
    public static void main(String[] args) {
        MathPractice object = new MathPractice();
     object.sum();
     //int a = object.sum(); can not use it; it is void return type
     object.total(4, 5);
        //System.out.println(object.total(4, 5););
        // you can not use  method which has void return type in SOUT
        int a = object.sum2(2,3);// return int result
        int x= a*a;
        System.out.println(a);// 5
        System.out.println(x);//25
        object.sum2(x,a);
      String str = object.speak();
        System.out.println(object.speak());
        System.out.println(str);
        System.out.println(object.FirstLastName("Madina"," Larina"));
        System.out.println(object.numberToString(3.33).concat(str));

    }


}
