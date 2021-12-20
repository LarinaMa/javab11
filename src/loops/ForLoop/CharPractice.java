package loops.ForLoop;

public class CharPractice {
    public static void main(String[] args) {
        // print out lowercase alphabet from 'a' to 'z'
        for (char ch1 = 'a'; ch1 <= 'z'; ch1++) {
            System.out.print(ch1 + " ");
        }
        System.out.println();
        // print letters from h to t

        for (char ch1 = 'h'; ch1 <= 't'; ch1++) {
            System.out.print(ch1 + " ");
        }
        System.out.println();
        System.out.println("------------------------");
        // print out lowercase alphabet from 'z' to 'a'
        for (char ch1 = 'z'; ch1 >= 'a'; ch1--) {
            System.out.print(ch1 + " ");
        }
    }
}

