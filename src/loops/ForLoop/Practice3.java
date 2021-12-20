package loops.ForLoop;

public class Practice3 {
    public static void main(String[] args) {
        //
        //
        String str = "Today is Snowy";
        System.out.println(str);
        int strLength = str.length();
        for (int index = 0; index < strLength; index++) {
            System.out.print(index + "*" + str.charAt(index) + " ");
            // -->print index number of the letter and * with the letter --> 0*T 1*0
            // System.out.println(str.charAt(index)); --> print out every letter from this string
            System.out.println();
        }// print out only letter y
        for (int i = 0; i < strLength; i++) {
            if (str.charAt(i) == 'y'){
                System.out.println(i+" "+str.charAt(i));
            }}
// count the number of letters "n" in the giving string
            int count = 0;
            for (int n = 0 ; n< strLength; n++){
                if (str.charAt(n) == 'n'){
                    count++;}
            } System.out.println("There are "+ count + "'n' in the given String");
        }
    }


