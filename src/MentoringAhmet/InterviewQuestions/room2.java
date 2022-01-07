package MentoringAhmet.InterviewQuestions;

public class room2 {
    public static void main(String[] args) {
        int x = 1;
        int y = 6;
       // while (y--){ compile time error ---> has to be boolean
        while(y>=0){
            x++;
            y--;
        }
        System.out.println("x = "+ x +" y= "+y);
    }
}
