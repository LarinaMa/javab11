package JavaStringMethods;

public class compareToMethod {
    public static void main(String[] args) {
   /*
    The compareTo() method compares two strings lexicographically.

    The comparison is based on the Unicode value of each character in the strings.

    The method returns 0 if the string is equal to the other string.
    A value less than 0 is returned if the string is less than the other string
    (less characters) and a value greater than 0 if the string is greater than the other string (more characters).

    Tip: Use compareToIgnoreCase() to compare two strings lexicographyically,
     ignoring lower case and upper case differences.

    Tip: Use the equals() method to compare two strings without consideration of Unicode values.
    Returns:	An int value: 0 if the string is equal to the other string.
                            < 0 if the string is lexicographically less than the other string
                            > 0 if the string is lexicographically greater than the other string (more characters)
     */
        String myStr1 = "Goodmorning";
        String myStr2 = "Hello";
        System.out.println(myStr1.compareTo(myStr2)); // Returns -1
        String myStr3 = "Hello";
        String myStr4 = "Hello";
        System.out.println(myStr3.compareTo(myStr4)); // Returns 0 because they are equal
        String myStr5 = "Helllo";
        String myStr6 = "Hello";
        System.out.println(myStr5.compareTo(myStr6)); // Returns -3
        String myStr7 = "Helo";
        String myStr8 = "Hello";
        System.out.println(myStr7.compareTo(myStr8)); // Returns 3
    }
}
