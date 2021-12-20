package Scanner;

public class substringMethod {
    public static void main(String[] args) {
        // .substring(); --> cut your string in part

        String name = "Techtorial Academy is located at des plains";
        //             0123456789
        System.out.println(name.substring(4)); //torial Academy is located at des plains
        System.out.println(name.substring(4, 6));// to
        System.out.println(name.substring(4, 12));//torial A
        System.out.println(name.substring(4, 11));// torial
        System.out.println(name.substring(1, 25));//echtorial Academy is loc
    }
    }
