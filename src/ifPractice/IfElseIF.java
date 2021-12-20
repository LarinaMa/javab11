package ifPractice;

public class IfElseIF {
    public static void main(String[] args) {
        /*
        if (condition1){
        code
        } else if (condition2) {
        code
        } else if (condition3) {
        code
        }else if (conditionN) {
        code
        }
         */
           // pick a number from 0-25
        //for each range of 0-5, 6-10, ...-->your number is in the range of ....
       int a = 7;
       if (a >= 0 && a <= 5){
           System.out.println("your number is in range of 0-5");
       } else if (a > 5 && a <= 10){
           System.out.println("your number is in range of 5-10");
       }else if (a > 10 && a <= 15){
           System.out.println("your number is in range of 10-15");
       }else if (a > 15 && a <= 20){
           System.out.println("your number is in range of 15-20");
       } else{
           System.out.println("your number is out of range");
       }

    }
}
