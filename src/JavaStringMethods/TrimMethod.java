package JavaStringMethods;

public class TrimMethod {
    public static void main(String[] args) {
        /*
        The trim() method removes whitespace from both ends of a string.
        Note: This method does not change the original string.
        Returns:	A String value, which is a copy of the string, without leading and trailing whitespace
         */
        String myStr = "       Hello World!       ";
        System.out.println(myStr);
        System.out.println(myStr.trim());
    }
}
