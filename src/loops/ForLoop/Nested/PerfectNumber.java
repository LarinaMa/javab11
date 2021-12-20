package loops.ForLoop.Nested;

public class PerfectNumber {
    public static void main(String[] args) {
        // 28 is perfect number 1,2,4,7,14
        // sum of dividers (except number itself) equals to number
        int num = 28;
        int sum = 0;
        for (int divisor = 1; divisor<= num/2;divisor++){
            if (num % divisor ==0){
                sum+=divisor;
            }
        }
        if (num == sum){

            System.out.println(num+ " is perfect number");
        } else {
            System.out.println(num +" is NOT a perfect number");
        }
    }
}
