package Home$Work.Homework.Homework123121;

import java.util.Arrays;

public class FahrenheitToCelciusArray {
    public static void main(String[] args) {
        /*
        You have an array of weather conditions with Fahrenheit numbers.
        Print the Celcius value of each array element.
    NOTE: Be careful after every number there has to be comma(,) and space then the next number.
    Please look carefully for example.
Example: Example array -> {22,45,62,50,-40,32,80}
Expected Output -> -5.555555555555555, 7.222222222222222, 16.666666666666668, 10.0, -40.0, 0.0, 26.666666666666668
C = (F-32)/1.8
         */
        double[] fahrenheits = new double[]{32,21,0,-3,-40,32,80};
        double[] celcius = new double[7];
        for(int i = 0; i< fahrenheits.length; i++){
            celcius[i]=(fahrenheits[i]-32)/1.8;

        }
        System.out.println(Arrays.toString(celcius));
    }
}
