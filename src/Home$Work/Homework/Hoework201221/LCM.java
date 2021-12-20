package Home$Work.Homework.Hoework201221;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number 1");
    int num1 = input.nextInt();
    System.out.println("Enter the number 2");
    int num2 = input.nextInt();
    int LCM, HCF=1 ;
    for(int i=1; i<= num1 && i<= num2;i++){
        if (num1 % i == 0 && num2 % i==0){
            HCF = i;
        }
    }
        System.out.println(HCF);
        System.out.println(num1*num2/HCF);

    }
}
// LCM = num1*num2/HCF
// LCM ---> Least Common Multiple
//HCF ---> Highest Common Factor
// HCF*LCM = num1*num2