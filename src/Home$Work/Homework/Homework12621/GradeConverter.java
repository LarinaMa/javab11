package Home$Work.Homework.Homework12621;

import java.util.Scanner;

public class GradeConverter {
    //Using scanner ask user to enter grade letter
    //print the number value matching with this grade
    // A  = 4.0    C+ = 2.3     F =  0.0
    // A- = 3.7    C  = 2.0
    // B+ = 3.3    C- = 1.7
    // B  = 3.0    D+ = 1.3
    // B- = 2.7    D  = 1.0
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your grade letter");
        String grade = input.nextLine();
// !!!!! when I was using .contains() method I had problem with A-; B-; C-
// Because you should use equals method instead contains
/// Because imagine, B- also contains B --> Sonyour code will never execute B-
// using equals method it will solve the problem
        if (grade.equals("A")) {
            System.out.println("4.0");// 4
        } else if (grade.equals("A-")) {
            System.out.println("3.7"); // 3.7
        } else if (grade.equals("B+")) {
            System.out.println("3.3"); //3.3
        } else if (grade.equals("B")) {
            System.out.println("3.0");//3.0
        } else if (grade.equals("B-")) {
            System.out.println("2.7");//2.7
        } else if (grade.equals("C+")) {
            System.out.println("2.3");//2.3
        } else if (grade.equals("C")) {
            System.out.println("2.0");//2
    }else if (grade.equals("C-")) {
        System.out.println("1.7");// 1.7
    } else if (grade.equals("D+")){
        System.out.println("1.3");//1.3
    } else if (grade.equals("D")){
        System.out.println("1.0");//1
    } else if (grade.equals("F")){
        System.out.println("0.0");//0

    } else {
        System.out.println();
    }
}
    }
