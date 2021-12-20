package JavaStringMethods;

public class SubstringMethod {
    public static void main(String[] args) {
        //substring(int startIndex):
//Returns a new string which start from a specified string and extends to the end of this string.
//It will throw IndexOutOfBoundsException – if startIndex is negative or larger than the length of this String object.

            String str = "Hello w3spoint";
            //            0123456      13
             System.out.println(str.substring(6));// w3spoint
        //substring(int startIndex, int endIndex)
       // Returns a new string which start from a specified string and extends to the endIndex – 1 of this string.
        System.out.println(str.substring(4,12));
                  }
}
