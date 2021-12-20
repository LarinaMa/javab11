package firstweek;

public class Farm {
    public static void main(String[] args){
        /*
        in a farm there are 12 cows and 23 chickens
        1- find total legs of the animals in the farm and print out
        2- if each cow cost $2345 and each chicken cost $23.99 find total worth of these animals and print out
         */
        int cow = 12;
        int chicken = 23;
        int cowleg = 4;
        int chickenleg = 2;
        int totalleg = cow*cowleg + chicken*chickenleg;

        double cow$ = 2345;
        double chicken$ = 23.99;
        double total$ = cow$*cow + chicken$*chicken;

        System.out.println("The total legs of animals = "+ totalleg);
        System.out.println("The total worth of animals = "+ total$);
    }
}
