package wrapperClass;

public class StringToWrapper {
    public static void main(String[] args) {
        String color ="red";
       // Integer num = Integer.valueOf(color);
       // System.out.println(num);//Exception in thread "main" java.lang.NumberFormatException: For input string: "red"
        String color1 ="12";
         Integer num = Integer.valueOf(color1);
          System.out.println(num+30);//42
        Boolean bl = Boolean.valueOf("true");
        System.out.println(bl);//true
        Boolean bl1 = Boolean.valueOf("example");
        System.out.println(bl1);//false
        int i = Integer.valueOf("77");
        System.out.println(i);//77
      // Character ch = Character.valueOf("k");//java: incompatible types: java.lang.String cannot be converted to char
        Character ch = Character.valueOf('k');
        System.out.println(ch);//k
    }
}

// int primitive = Integer.parseInt("123"); --> converts a String to an int primitive
// parseInt() --> return a primitive
//Integer wrapper = Integer.valueOf("756"); --> converts a String to an Integer wrapper class
// valueOf returns --> wrapper class