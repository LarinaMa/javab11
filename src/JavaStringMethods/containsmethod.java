package JavaStringMethods;

public class containsmethod {
    public static void main(String[] args) {
        //The contains() method checks whether a string contains a sequence of characters.
        //Returns true if the characters exist and false if not.
        String myStr = "Hello";
        System.out.println(myStr.contains("Hel"));   // true
        System.out.println(myStr.contains("e"));     // true
        System.out.println(myStr.contains("Hi"));    // false
        //The contentEquals() method searches a string to find out
        // if it contains the exact same sequence of characters in the specified string or StringBuffer.
        //Returns true if the characters exist and false if not.
        String myStr1 = "Hello";
        System.out.println(myStr1.contentEquals("Hello"));  // true
        System.out.println(myStr1.contentEquals("e"));      // false
        System.out.println(myStr1.contentEquals("Hi"));     // false
    }
}
