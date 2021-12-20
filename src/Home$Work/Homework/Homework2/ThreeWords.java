package Home$Work.Homework.Homework2;


import java.util.Scanner;

public class ThreeWords {
    public static void main(String[] args) {
        /*
       ask user to input three string value
        1) Print the first char of those three-string together.
        2) Print the last char of each string together
        3) Print true if each of the string lengths is equaled to each other.

EXAMPLE:  INPUT  --> We  Love Java
          OUTPUT --> WLJ
                 --> eea
                 --> false (since each string length is not equals to each other)
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three string value");
        //space between words separate them
        // We Love Java
        // 12345678   12 --> length of the string
        // 012345678  11 --> index number
        String inputFromUser = input.nextLine();// assign user input to <inputFromUser>
        int lengthOfString = inputFromUser.length(); //The length() method returns the length of <inputFromUser> (12)
              char firstLetterFirstWord = inputFromUser.charAt(0);//first letter of the first word --> W
        // .charAt() method --> 	Returns the character at the specified index (position)//
              char lastLetterOfThirdWord = inputFromUser.charAt(lengthOfString-1);// first letter of the first word --> a
        int indexSpace1 = inputFromUser.indexOf(" ");// index number of space between 1st and 2nd word --> 3
        //The indexOf() method returns the position of the first occurrence of specified character(s) in a string.
        char firstLetterOfSecondWord = inputFromUser.charAt(indexSpace1+1);// first letter of the 2nd word --> L
        String Word1 = inputFromUser.substring(0,indexSpace1);//cut first word Java from beginning to index 3 (3 is not included)
        //               WE --> first word
        //               012 --> after we cut first word (space included)
        //               01 --> index of last letter in the first word
               int indexOfLLFW = inputFromUser.indexOf(" ")-1;// index of last letter of first word --> 1
        char lastLetterOfFirstWord = inputFromUser.charAt(indexOfLLFW);// last letter of the first word --> e
        int indexSpace2 = inputFromUser.indexOf(" ", indexSpace1+1);
        // index number of space between 2nd and 3rd word --> 7
        char firstLetterOfThirdWord = inputFromUser.charAt(indexSpace2+1);// first letter of the 3rd word --> J
        char lastLetterOfSecondWord = inputFromUser.charAt(indexSpace2-1);// last letter of the 2nd word --> e
        System.out.print(firstLetterFirstWord);
        System.out.print(firstLetterOfSecondWord);
        System.out.println(firstLetterOfThirdWord);
        System.out.print(lastLetterOfFirstWord);
        System.out.print(lastLetterOfSecondWord);
        System.out.println(lastLetterOfThirdWord);
        int length1word = Word1.length();
        System.out.println(length1word);
        int length2word = indexSpace2-1-length1word;
        System.out.println(length2word );
        int length3word = (lengthOfString-2)-(length1word+length2word);
        System.out.println(length3word );
System.out.println(length1word == length2word && length2word==length3word );
  }
}
