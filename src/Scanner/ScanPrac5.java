package Scanner;
public class ScanPrac5 {
    public static void main(String[] args) {

            int charValueA = 'a';
            System.out.println(charValueA);
            int charValueZ = 'z';
            System.out.println(charValueZ);
            char ch = '4';//this is not a scanner practice
            // if this is a letter or not
            //if the value of the char between char a and char z
            //it means this char is a letter
            boolean isLetter = ch>='a' && ch <= 'z' || ch>='A' && ch<= 'Z';
            System.out.println(isLetter);
        }

    }




