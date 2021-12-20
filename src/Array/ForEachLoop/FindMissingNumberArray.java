package Array.ForEachLoop;

public class FindMissingNumberArray {
    public static void main(String[] args) {
        /*
        find the missing number from the sequence in the Array {1,2,3,4,5,6,8,9}
        {3,4,6,7}   ---> sum = 20
        {3,4,5,6,7,} --> sum = 25
        25-20 = 5 ---> 5 is the missing number
         */
        int numbers [] = {4,5,7,8,9};
        int sum1 = 0;
        int sum2 = 0;
        for (int a: numbers){
          sum1+= a;
        }
        for (int i = 4; i<= 9; i++){
        sum2+=i;
        }
        System.out.println("Missing number in the array is "+(sum2-sum1));
    }
}
