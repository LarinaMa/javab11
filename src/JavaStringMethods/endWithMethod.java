package JavaStringMethods;

public class endWithMethod {
    public static void main(String[] args) {
        // The endsWith() method checks whether a string ends with the specified character(s).
        // true - if the string ends with the specified character(s)
        // false - if the string does not end with the specified character(s)

        String myStr = "Hello";
        System.out.println(myStr.endsWith("Hel"));   // false
        System.out.println(myStr.endsWith("llo"));   // true
        System.out.println(myStr.endsWith("o"));     // true
    }
}
