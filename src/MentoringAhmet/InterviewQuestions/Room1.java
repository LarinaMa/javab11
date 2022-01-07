package MentoringAhmet.InterviewQuestions;

public class Room1 {
    public static void main(String[] args) {
        int day = 2;
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }
    }
}
/*
a) Monday
b) Tuesday --->break terminate the switch statement and return flow control to the enclosing statement
c) Wednesday
d) Thursday
 */