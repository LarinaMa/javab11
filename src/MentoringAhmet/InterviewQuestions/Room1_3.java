package MentoringAhmet.InterviewQuestions;

public class Room1_3 {
    public static void main(String[] args) {
        int day =7;
        switch (day){
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
        }
    }
}
/*
a) MondaytuesdayWednesdyThursdayfriday
b) No Output ---> no case7, no default
c) Compilation Error
d) Friday
 */