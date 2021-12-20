package Array.SplitMethod;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        String data = "12/17/2021";
        String data1 = "12_17_2021";
        String data2 = "12.17.2021";
        String data3 = "12-17-2021";
        String[] splitDate = data2.split("/");// [12, 17, 2021]
        System.out.println(Arrays.toString(splitDate));
        System.out.println(splitDate.length);
        String[] splitDate1 = data1.split("_");// [12, 17, 2021]
        System.out.println(Arrays.toString(splitDate1));
        System.out.println(splitDate1.length);
        String[] splitDate2 = data2.split("\\.");// [12, 17, 2021]
        System.out.println(Arrays.toString(splitDate2));
        System.out.println(splitDate2.length);
        String[] splitDate3 = data2.split("-");// [12, 17, 2021]
        System.out.println(Arrays.toString(splitDate3));
        System.out.println(splitDate3.length);
        System.out.println("============================");
        String date = "12_17_2021";
        String[] splitDate4 = date.split("_");
        System.out.println(Arrays.toString(splitDate4));
        // 12.17.2021
        date = "12.17.2021";
        String[] splitDate5 = date.split("\\.");
        System.out.println("This is for dot example " + Arrays.toString(splitDate5));
        System.out.println("\"something\"");
        // [12, 17, 2021]
        for (String element : splitDate2) {
            System.out.println("\"" + element + "\"");
        }
    }
}
