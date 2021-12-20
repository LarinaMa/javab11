package loops.While_DoWhile;

public class DoWhileLoop {
    public static void main(String[] args) {
        /* Do While --> Do 1st, check while
        do {
           // code
           // update condition
        } while (condition);
        this code will work till condition is true, first time it work always
         */
        // show your age from 21 to 26
        int age = 21;
        do {
            System.out.println("your age is: " + age);
            age++;
        } while (age < 27);// if condition is false --> your age is: 21
    }
}
    /* Print out if condition is true
    your age is: 21
    your age is: 22
    your age is: 23
    your age is: 24
    your age is: 25
    your age is: 26
     */
