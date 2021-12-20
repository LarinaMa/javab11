package loops.ForLoop;

public class CurlyBracesExamples {
    public static void main(String[] args) {
        for (int a=0; a<10; a++)
            System.out.println("Winter");// will print 10x Winter
        System.out.println("summer"); // will print 1x summer

        int a = 0;
        for (; a < 10; a++)
            a++;
        System.out.println(a); //10 because it is has no curly braces java perform just 1st line
        // till condition true, after this it just performs what is next
        System.out.println("Summer");//summer

    }
}
