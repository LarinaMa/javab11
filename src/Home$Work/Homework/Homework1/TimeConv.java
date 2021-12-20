package Home$Work.Homework.Homework1;

public class TimeConv {
    public static void main(String[] args){

        int min = 3456789;
        int reminder = (min % 525600)/1440;
        int year =min/525600;
        System.out.println(min+" min = " +year+" years and "+reminder+" days");

        //reminder = days
    }
}


