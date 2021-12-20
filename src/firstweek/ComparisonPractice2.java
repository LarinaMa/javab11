package firstweek;

public class ComparisonPractice2 {
            public static void main(String[] args) {
           // there is an event for kids if a child's height is 48" or more they can attend this event
            // print result if kid can attend or no
            double regHeight = 48;
            double kidHeight = 48;
            boolean canAttend = kidHeight >= regHeight;

            System.out.println("Can this child attend the event?  "+ canAttend);
            // if the age of child is 6 or less it will free
            int regAge = 6;
            int kidAge = 7;
            boolean isFree = kidAge <= regAge;
            System.out.println("Is the event free for child? "+ isFree);
            // find out if student can pas a class
            // there are test taken --> 60, 100, 85
            // student attendance 85%
            // Average of those test has to be 70 or more
            // attendance rate of the student has to be 80% or more
            //print out if student can pass the class or not
            int test1 = 60;
            int test2 = 100;
            int test3 = 85;
            int average = (test1+test2+test3)/3;
            int reqAverage = 70;
            int reqAttendance = 80;
            int studentAttendance = 85;
            boolean canPass = average >= reqAverage && studentAttendance >= reqAttendance;
            System.out.println("Can student pass--> "+ canPass);

        }
    }

