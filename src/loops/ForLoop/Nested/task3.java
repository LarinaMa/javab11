package loops.ForLoop.Nested;

public class task3 {
    public static void main(String[] args) {
        // print out month for the years between 2020 to 2023

        for (int year = 2020; year<=2023; year++ ){
            System.out.println(year);
            for (int month = 1; month<=12; month++){
                System.out.print(month+" ");
            }
            System.out.println();
        }
    }
}
/*
2020
1 2 3 4 5 6 7 8 9 10 11 12
2021
1 2 3 4 5 6 7 8 9 10 11 12
2022
1 2 3 4 5 6 7 8 9 10 11 12
2023
1 2 3 4 5 6 7 8 9 10 11 12
 */