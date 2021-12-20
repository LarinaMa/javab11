package loops.ForLoop.Nested;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Beginning of execution");
        for (int i=0; i<3; i++){ //     1st loop
            System.out.println("i am a 1st for loop");

            for (int j=0 ; j<2 ; j++){ //    2nd loop
                System.out.println("    I am nested for loop");

            }
        }
        System.out.println("End of execution");
    }
}
/*
Beginning of execution
i am a 1st for loop
    I am nested for loop
    I am nested for loop
i am a 1st for loop
    I am nested for loop
    I am nested for loop
i am a 1st for loop
    I am nested for loop
    I am nested for loop
End of execution
 */