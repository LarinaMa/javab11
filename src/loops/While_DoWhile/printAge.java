package loops.While_DoWhile;
public class printAge {
    public static void main(String[] args) {
        // print my age starting form 21 till 26
        int age = 21;
        while (age <= 26) {
            System.out.println("My age is: " + age);
            age++; // means same as age += 1 or age = age + 1
        }

        System.out.println();
/*
My age is: 21
My age is: 22
My age is: 23
My age is: 24
My age is: 25
My age is: 26
 */
// print out numbers between 10 and 20 inclusive in same line
        int num = 10;
        while (num <= 20) {
            System.out.print(num+" ");
            num++;
        }
    }
}
//10 11 12 13 14 15 16 17 18 19 20