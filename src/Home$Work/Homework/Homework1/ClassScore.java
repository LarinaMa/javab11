package Home$Work.Homework.Homework1;

import java.util.Scanner;

public class ClassScore {
    public static void main(String[] args) {
        /*
        Write the application to check the student pass the class or not.
        To be able to pass the class student need to have 65 score from the exams
        and student need to attend the 80 percent of all the classes.
        To calculate the average score we need to take 20 percent of first exam
        score and 30 percent of second exam score and 50 percent of third exam score.
        We need to create three variable for exam scores and one variable for attendance for the classes.
        If all conditions are met, print true at the end.

Example 1: Please enter first exam score (1 - 100): 60 Please enter second exam score (1 - 100):
 65 Please enter third exam score (1 - 100): 70 Please enter your attendance percentage: 80 true

Example 2: Please enter first exam score (1 - 100): 60 Please enter second exam score (1 - 100):
 65 Please enter third exam score (1 - 100): 70 Please enter your attendance percentage: 70 false

Example 3: Please enter first exam score (1 - 100): 50 Please enter second exam score (1 - 100):
 40 Please enter third exam score (1 - 100): 30 Please enter your attendance percentage: 90 false
         */

            Scanner scanner= new Scanner(System.in);
            System.out.println("Please enter first exam score (1 - 100):");
            // create variable for first exam score
            int score1 = scanner.nextInt();
            System.out.println("Please enter second exam score (1 - 100):");
            // create variable for second exam score
            int score2 = scanner.nextInt();
            System.out.println("Please enter third exam score (1 - 100):");
            // create variable for third exam score
            int score3 = scanner.nextInt();
            System.out.println("Please enter your attendance percentage:");
            // create variable for attendance percentage
            int attendance = scanner.nextInt();
            // create boolean variable for result
            double averScore = score1*0.2+score2*0.3+score3*0.5;
            boolean isScore = averScore >= 65;
            boolean isAttendance = attendance >= 80;
            boolean isPass = isScore && isAttendance;
            // print result (true/false) only
            System.out.print(isPass);
        }
}
