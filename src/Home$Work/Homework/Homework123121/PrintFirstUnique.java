package Home$Work.Homework.Homework123121;

import java.util.Arrays;
import java.util.Scanner;

public class PrintFirstUnique {
    public static void main(String[] args) {
        /*
        Create the array size of 7 and store every number by asking user in the loop.
        When asking user please use the text -> "Enter number for array".
        After having all numbers for array print ONLY the first unique value from this array.
        If the array doesn't have any unique element print the text below "Array doesn't have any unique element"
EXAMPLE OUTPUT
Enter number for array 1
Enter number for array 2
Enter number for array 4
Enter number for array 1
Enter number for array 2
Enter number for array 3
Enter number for array 4
3 -> 3 is printed because array have [1,2,4,1,2,3,4] and first unique element from array is 3
         */
        Scanner input = new Scanner(System.in);
        int arr[] = new int[7];
        boolean notUnique = true;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number for array");
            arr[i] = input.nextInt();
        }
      //  System.out.println(Arrays.toString(arr));


        for (int k = 0; k < arr.length; k++) {
           int count = 0;
            for (int j = 0; j<arr.length; j++) {
                if (arr[k] == arr[j]) {
                    count++;
                }
            }
            if(count==1){
                System.out.print(arr[k]);
                notUnique = false;
                break;
            }
        }

            if (notUnique) {
                System.out.println("Array doesn't have any unique element");
            }
        }
    }

