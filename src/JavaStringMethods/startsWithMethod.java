package JavaStringMethods;

public class startsWithMethod {
    public static void main(String[] args) {
        //The startsWith() method checks whether a string starts with the specified character(s).
        // true - if the string starts with the specified character(s)
       // false - if the string does not start with the specified character(s)
        String myStr = "Hello";
        System.out.println(myStr.startsWith("Hel"));   // true
        System.out.println(myStr.startsWith("llo"));   // false
        System.out.println(myStr.startsWith("o"));     // false
    }
}
