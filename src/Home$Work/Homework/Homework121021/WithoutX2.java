package Home$Work.Homework.Homework121021;

import java.util.Scanner;

public class WithoutX2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("type a string");
        String str = input.nextLine();
        if (str.charAt(0) == 'x' && str.charAt(1)=='x'){
            System.out.println(str.substring(2));
        } else if (str.charAt(1)=='x'){
            System.out.println(str.substring(0,1)+str.substring(2));
        } else if (str.charAt(0)=='x'){
            System.out.println(str.substring(1));
        } else {
            System.out.println(str);
        }
    }
}
