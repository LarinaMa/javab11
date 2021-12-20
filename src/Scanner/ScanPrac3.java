package Scanner;

import java.util.Scanner;

public class ScanPrac3 {
    public static void main(String[] args) {
        //BMI calculation BMI = weight(kg)/(height*height(meter))
        //18-24
        //"your BMI is <BMI>"
        Scanner scanner =new Scanner(System.in);
        System.out.println(" Please enter your weight in kg");
        double weight = scanner.nextDouble();

        System.out.println("Please enter your weight in meters");
        double height = scanner.nextDouble();
        double BMI = weight / (height * height);
        System.out.println("your BMI is  " + BMI);
    }
}