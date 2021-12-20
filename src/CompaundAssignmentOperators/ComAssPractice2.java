package CompaundAssignmentOperators;

public class ComAssPractice2 {
    public static void main(String[] arg){
        // +=   -=   *=   /=   %=
        int num1= 7;
        int num2 = num1 + 7;//14
        num1 += num2;//21
        System.out.println(num1);
        num2 -= 8;// num2 = num2 -8
        System.out.println(num2);//6
        int num3 = num1 + num2;//21+6=27
        num2 += num3;//6+27=33
        num1+=num3;//21+27=28
        System.out.println(num3);
        System.out.println(num1);
        System.out.println(num2);
        num1 = 4;
        num1 *=5; //num1 = 20
        System.out.println(num1);
        // %+
        num1 %=2;
        System.out.println(num1);
        boolean bl1 = true;
        //bl1+=false;
        char ch1 = 'a';
        char ch2 = 'm';
        char ch3 = '3';
        ch3 += '7';
        System.out.println("This is ch3 --> "+ch3);
        ch2 *='3';
        System.out.println(ch2);
        ch1 -= 9;
        System.out.println(ch1);
        int reminder = ch1 %= 3;
        System.out.println(ch1);



    }
}




