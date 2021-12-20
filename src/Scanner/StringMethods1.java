package Scanner;

public class StringMethods1 {
    public static void main(String[] args) {
        // .toUppercase() --> makes you string as uppercase
        // .toLowerCase() --> makes you string as lowercase
        String sentence = "I loVe LilIes";
        //                 0123456789
        System.out.println(sentence);//I loVe LilIes
        System.out.println(sentence.toUpperCase()); //I LOVE LILIES
        System.out.println(sentence.toLowerCase()); //i love lilies
        // making single letter uppercase from string
        String str = "Just do it";
        // .indexOf() --> returning number
        //.charAt() --> returning char
         char letter = str.charAt(str.indexOf("d"));
         String str2 = ""; // creating empty string
         str2 += letter; // putting letter into empty string
        System.out.println(str2.toUpperCase());
    }
}
