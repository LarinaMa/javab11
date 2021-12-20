package JavaStringMethods;

public class idexOfMethod {
    public static void main(String[] args){
    //The indexOf() method returns the position of the first occurrence of specified character(s) in a string.
    // Tip: Use the lastIndexOf method to return the position of the last occurrence of specified character(s)
    // in a string.
    //Returns:	An int value, representing the index of the first occurrence of the character in the string,
    //          or -1 if it never occurs
        String myStr = "Hello planet earth, you are a great planet.";
        //              012345678910
        System.out.println(myStr.indexOf("planet"));//6
        String myStr1 = "Hello planet earth, you are a great planet.";
        // Find the first occurrence of the letter "e" in a string, starting the search at position 5:
        System.out.println(myStr.indexOf("e", 5));//10
        String myStr2 = "Hello planet earth, you are a great planet.";
        System.out.println(myStr2.lastIndexOf("planet"));//36
        /*
    int indexOf(int ch)	It returns the index position for the given char value
	int indexOf(int ch, int fromIndex)	It returns the index position for the given char value and from index
    int indexOf(String substring)	It returns the index position for the given substring
    int indexOf(String substring, int fromIndex) It returns the index position for the given substring and from index
         */


    }
}
