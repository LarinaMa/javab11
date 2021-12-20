package loops.While_DoWhile;
// This loop runs indefinitely until the condition is false

/*  while(condition){
          code
          updating condition
          }
 */

public class WhileLoop1 {
    public static void main(String[] args) {
        int x=0;//
        while (5>x){ //condition for the loop
            System.out.println("$$$$$");
            x++;// updating condition
        }
    }
}
// will print 5 times
/*
$$$$$       0       x           0
$$$$$       1       x++         0+1
$$$$$       2       x++         1+1
$$$$$       3       x++         2+1
$$$$$       4       x++         3+1
            5   ----> while (5>x) condition for the loop became false ---> stop loop
 */