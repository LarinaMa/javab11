package MentoringAhmet.InterviewQuestions;

public class Room1_2 {
    public static void main(String[] args) {
        int day = 4;
        switch(day){
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            default:
                System.out.println("Weekend");
                break;
        }// because the break statement is missing
        // after case 4 flow will continue to the next proceeding case
        //till break or default case (if no break at all) automatically
    }
}
/*
a) ThursdayFridayWeekend
b) Thursday
c) Compilaion Error
d) MondayTuesdayWednesdayThursday
 */