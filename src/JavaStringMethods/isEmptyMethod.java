package JavaStringMethods;

public class isEmptyMethod {
    public static void main(String[] args) {
        //The isEmpty() method checks whether a string is empty or not.
        //This method returns true if the string is empty (length() is 0), and false if not.
        String myStr1 = "Hello";
        String myStr2 = "";
        System.out.println(myStr1.isEmpty());// false
        System.out.println(myStr2.isEmpty());// true
    }
}
