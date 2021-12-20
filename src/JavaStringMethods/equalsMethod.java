package JavaStringMethods;

public class equalsMethod {
    public static void main(String[] args) {
        //The equals() method compares two strings, and returns true if the strings are equal, and false if not.
        //Tip: Use the compareTo() method to compare two strings lexicographically.
        //true - if the strings are equal
        //false - if the strings are not equal
        String myStr1 = "Hello";
        String myStr2 = "Hello";
        String myStr3 = "Another String";
        System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
        System.out.println(myStr1.equals(myStr3)); // false
        //
    }
}
