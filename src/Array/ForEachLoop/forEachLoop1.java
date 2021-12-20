package Array.ForEachLoop;

public class forEachLoop1 {
    public static void main(String[] args) {
        double[] checks = {2543,10000,65.50,1.99,100089};
        // by using for each loop, find and print out the total amount of checks
        double sum = 0;
        for(double check:checks){
            sum +=  check;
            System.out.println(sum);
        }
        System.out.println("=======");
        System.out.println(sum);
    }
}
