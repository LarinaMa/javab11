package Scanner;

public class StringMethods3 {
    public static void main(String[] args) {
        String text = "Selenium";
        // .contains(); it will returns true/false if the string has given value or not
        boolean result1 = text.contains("le");// true
        System.out.println(result1);
        System.out.println(text.contains("t"));// false
        System.out.println(text.contains("selenium"));//false
        System.out.println(text.contains("1"));//false
        System.out.println(text.contains("ium"));//true
        System.out.println(text.contains("lev"));//false
        System.out.println(text.contains("nium"));//true; .equals() will return false
        // .equals(); it will check if the given string has exactly same order of char, will return true/false
        System.out.println(text.equals("Selenium"));// true
        System.out.println(text.equals("selenium"));// false
        System.out.println(text.equals("nium"));// false; .contains() will return true
        // .equalIgnoreCase()
        System.out.println(text.equalsIgnoreCase("SELeniUm")); //true
        String text2 = "Java";
        System.out.println(text.equalsIgnoreCase(text2));//false
        String text3 = "SELENIUM";
        boolean result2 = text3.equalsIgnoreCase(text);
        System.out.println(result2); //true
text3.concat(text);// it is not changing anything, because it is not assigned to anything
text3.toLowerCase();//it is not changing anything
text = text3;// text3 = "SELENIUM" was assigned to text
        System.out.println(text3.equals(text));//true, "SELENIUM" ="SELENIUM"

          }
}
