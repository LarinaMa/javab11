package Home$Work.Homework.Homework1;

import java.util.Scanner;
/*
Kushal wants to lose 10 kg in one month. There are multiple conditions to lose 10 kg in a month.
Kushal needs to walk 10000 steps daily OR needs to run at least 4 miles a day
and ADDITION to those Kushal needs to eat less than 1500 calories daily.
Create the application that calculates the given parameter
and will print the true if Kushal is able to lose 10 kg in one month.

Example 1: Daily Steps: 9000 Daily Miles: 3.6 Daily calories: 2000 false

Example 2: Daily Steps: 10000 Daily Miles: 1.9 Daily calories: 1500 false

Example 2: Daily Steps: 9000 Daily Miles: 4.5 Daily calories: 1450 true
 */

public class WeightLoss {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Daily Steps:");
        int steps = scanner.nextInt();
        // create a variable to store steps
        System.out.println("Daily Miles:");
        // create a variable to store miles. It can be the example number of 3 or 3.5
        double miles = scanner.nextDouble();
        System.out.println("Daily calories:");
        // create a variable to store calory
        int calories = scanner.nextInt();
        // create a variable for result
        // print out the result (true/false)
        boolean isSteps = steps >= 10000;
        boolean isMiles = miles>=4.0;
        boolean isCalories = calories<=1500;
        boolean isLose = isSteps||isMiles&&isCalories;
        System.out.print(isLose);
    }
}

