package Array.ForEachLoop;

public class forEachloop2 {
    public static void main(String[] args) {
        char[] chs = {'A','4','&','z','3','u','*'};
        // by using for each loop, print out letters only

        for(char symbol:chs){
            if (symbol >='A'&& symbol<='Z'||symbol>='a'&& symbol<='z'){
                System.out.println(symbol);
            }
        }
        System.out.println("============================");
        // ============================
        for (char letter:chs){
            if(Character.isAlphabetic(letter)){
                System.out.println("This is a letter "+letter);
            } else if (Character.isDigit(letter)){
                System.out.println("This is a digit "+letter);
            }else{
                System.out.println("This is a symbol "+letter);
            }
        }
        /*
This is a letter A
This is a digit 4
This is a symbol &
This is a letter z
This is a digit 3
This is a letter u
This is a symbol *         */

    }
}
