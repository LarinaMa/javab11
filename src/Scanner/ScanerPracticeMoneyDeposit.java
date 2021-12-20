package Scanner;
import java.util.Scanner;
public class ScanerPracticeMoneyDeposit {
/*
  create a new class: MoneyTransaction
	David wants to deposit his paychecks into his account and already has $200
	He has 3 paychecks (610, 385, 975)
	he can only deposit one check at a time
	*Ask: "How much is Deposit amount?" every time he is making deposit
	after all of paycheks deposited in to account
	he bought a phone for $599 and headphone for $299
	*Ask: How much is phone?
	*Ask: How much is headPhone?
	Calculate his final money and print --> "Your final balance is <finalAmount>"
     */

    public static void main(String[] args) {
        double balance = 200; //his initial amount in account
        Scanner input = new Scanner(System.in);
        System.out.println("How much is Deposit amount? please enter the amount");
        double firstCheck = input.nextDouble();
        balance += firstCheck;
        System.out.println("How much is Deposit amount? please enter the amount");
        double secondCheck = input.nextDouble();
        balance += secondCheck;
        System.out.println("How much is Deposit amount? please enter the amount");
        double thirdCheck = input.nextDouble();
        balance += thirdCheck;
        System.out.println("How much is phone? please enter amount");
         double phone$ = input.nextDouble();
         balance -= phone$;
        System.out.println("How much is headphone? please enter amount");
        double headPhone$ = input.nextDouble();
        balance -= headPhone$;
        System.out.println("Your final balance is " +balance);



    }
}
