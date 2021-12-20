package JavaStringMethods;

public class CharValue {
    public static void main(String[] args) {
        /*
     .charAt() method --> 	Returns the character at the specified index (position)
     Returns:	A char value at the specified index of this string.
                The first char value is at index 0
     Throws:	IndexOutOfBoundsException - if index is negative
                or not less than the length of the specified string
         */
        String name="javatpoint";
                   //0123456789
        char ch = name.charAt(4);//returns the char value at the 4th index
        System.out.println(ch);// t
       // char ch1=name.charAt(10); --> returns the char value at the 10th index
       // System.out.println(ch1); --> Exception in thread "main" java.lang.StringIndexOutOfBoundsException:
        //                         --> String index out of range: 10
        String str = "Welcome to Javatpoint portal";
        int strLength = str.length();
        // Fetching first character
        System.out.println("Character at 0 index is: "+ str.charAt(0));
        // The last Character is present at the string length-1 index
        System.out.println("Character at last index is: "+ str.charAt(strLength-1));

    }
}
