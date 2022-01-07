package wrapperClass;

public class StringToPrimitive {
    public static void main(String[] args) {
        String str ="12";
        System.out.println(str+10);//1210
        int num =  Integer.parseInt(str);// Unboxing
        System.out.println(num+10);//22
        Integer num1 = Integer.parseInt(str);
        System.out.println(num1.equals("12"));//false because one is String and another is wrapper class
        System.out.println(num==12);//true
        System.out.println(num1==12);//true
       //byte by = Byte.parseByte("abc121");
        //System.out.println(by);//Exception in thread "main" java.lang.NumberFormatException: For input string: "abc128"
        byte bc = Byte.parseByte("121");
        System.out.println(bc);//121
        //int num2 = Integer.parseInt("128GB");//Exception in thread "main" java.lang.NumberFormatException: For input string: "128GB"
        boolean bl = Boolean.parseBoolean("TRUE");
        System.out.println(bl);//true
        boolean bl1 = Boolean.parseBoolean("TruE");
        System.out.println(bl1);//true
        boolean bl2 = Boolean.parseBoolean(" true");
        System.out.println(bl2);//false because of space before the word
        boolean bl3 = Boolean.parseBoolean("true");
        System.out.println(bl3);//true
        boolean bl4 = Boolean.parseBoolean("example");// anything, except true gives false
        System.out.println(bl4);//false
        float fl = Float.parseFloat("1.2");
        System.out.println(fl);//1.2
        float fl1 = Float.parseFloat("1.2f");// f working on float only, not working with long
        System.out.println(fl1);//1.2
        long lg =Long.parseLong("3458679423581");// 3458679423581l or 3458679423581L is not working
        System.out.println(lg);//3458679423581
        double db = Double.parseDouble("45d");
        System.out.println(db);//45



    }
}
