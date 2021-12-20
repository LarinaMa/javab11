package Primitives;

public class CharPractice {
    public static void main(String[] args) {
/*
char = Character
 */
        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println("A");
        System.out.println('A');
        ch1 = '5'; //re-assignment--> from ASCII table '5' is decimal of 53
        System.out.println(ch1);
        System.out.println(ch1 * 2); // it takes the value from table and multiply by 2 53*2=106
        char ch2 = ch1;
        System.out.println(ch2);
        char ch3 = '&';
        System.out.println(ch3);
        char ch4 = 80; // 80 = letter P in ASCII table
        System.out.println(ch4); // will print O
        // char ch5 = 'ye' will not work because you can not assign more than one character in single quotation mark
        int numberChar = 'T';  // will not work int numberChar = "T";
        System.out.println(numberChar); // will print 84, 84 = T in ASCII table
        char randomChar = 2345; // will print symbol ऩ  from ASCII table
        System.out.println(randomChar);
    }
}

