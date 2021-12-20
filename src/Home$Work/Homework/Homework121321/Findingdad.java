package Home$Work.Homework.Homework121321;

import java.util.Scanner;
/*
Using scanner ask user to provide the string value.
Print "dad" if the given string contains the "dad",
but where the middle 'a' char can be any char otherwise please do not print anything.
Please look carefully examples below.
 Example: Input the year: testdadtest Output :dad
          Input the year: testd7dtest Output :dad
          Input the year: testdodtest Output :dad
          Input the year: testDudtest Output :dad

 */
public class Findingdad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string value");
        String str = input.nextLine().toLowerCase();

        int n = 0;
        do {
            if (str.charAt(n) == 'd' && (str.charAt(n + 2) == 'd')) {
                    System.out.println("dad");
                }
            n++;
        } while (n < str.length()-1);
    }
}

/*
inti = 0;
while ()
 */











