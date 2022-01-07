package Array.ForEachLoop;

public class CombineNumbers {
    public static void main(String[] args) {
        int[] num={2,67,85,4};
        int res = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                num[i] = num[i] * -1;
            }
            if (num[i] > 9 && num[i] < 100) {
                res *= 10;
            }
           if (num[i] > 99 && num[i] < 1000) {
                res *= 10;
            }


            res = res * 10 + num[i];
        }
        System.out.println(res);
    }
}
