package loops.ForLoop.Nested;

public class task2 {
    public static void main(String[] args) {

    // print hours and minutes for 12 hours of a day
    // ex: 0:0   0:1  0:59 1:2    11:59
    for (int hour = 0; hour<12; hour++) {
        for (int min = 0; min <= 59 ; min++) {
            for (int sec = 0; sec<=59; sec++)
            System.out.println(hour + " : "+min + " : "+ sec);
        }
    }
}
}





