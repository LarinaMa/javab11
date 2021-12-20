package Home$Work.Homework.Homework2;

import java.util.Scanner;
/*
Please ask user to input three string value
1- Print the first char of those three-string together.
2- Print the last char of each string together
3- Print true if each of the string lengths is equaled to each other.

EXAMPLE:
Input -1: We
Input -2: Love
Input -3: Java
OUTPUT:
WLJ
eea
false (since each string length is not equals to each other)
 */

public class ThreeWords1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input three string value");
        String word1 = input.nextLine();
        String word2 = input.nextLine();
        String word3 = input.nextLine();


        int indexOflastLetter1 = word1.length()-1;
        System.out.println(indexOflastLetter1);
        int indexOflastLetter2 =word2.length()-1;
        System.out.println(indexOflastLetter2);
        int indexOflastLetter3 =word3.length()-1;
        System.out.println(indexOflastLetter3);
        char wordOne1letter = word1.charAt(0);
        char wordOne2letter = word2.charAt(0);
        char wordOne3letter = word3.charAt(0);
        System.out.print(wordOne1letter);
        System.out.print(wordOne2letter);
        System.out.println(wordOne3letter);
        int word1Length = word1.length();
        System.out.println(word1Length);
        int word2Length = word2.length();
        System.out.println(word2Length);
        int word3Length = word3.length();
        System.out.println(word3Length);
        System.out.print(word1.charAt(indexOflastLetter1));
        System.out.print(word2.charAt(indexOflastLetter2));
        System.out.println(word3.charAt(indexOflastLetter3));


        System.out.print(word1Length==word2Length &&word2Length==word3Length);


    }
}
