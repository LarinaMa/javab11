package Home$Work.Homework.Homework1;

public class FindAandB {
    public static void main(String[] args) {
        int a;// assign value to a
        a = 5;
        int b;// assign value to b
        b = 9;

        int total=a++ + ++a + --b + ++b + b + ++a + ++b - --b + a;
        System.out.println(a); // After finding the total a = 8
        System.out.println(b); // After finding the total b = 9
        System.out.println(total); // total will be 55
        // in this task, you should only find the value of a and b in the beginning.
        // There is no test for this task.
    }
}

