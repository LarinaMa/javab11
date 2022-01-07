package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int[] num = new int[5];// array example
        num[2] = 9;
        System.out.println(Arrays.toString(num));//[0, 0, 9, 0, 0]
     //============================================================================
        ArrayList list1 = new ArrayList();// not specified, you can store different data types
        ArrayList list2 = new ArrayList(10);
        ArrayList <String> list3 = new ArrayList();
        list1.add("Rose");
        list1.add(21);
        list1.add('t');
        list1.add(2.5);
        System.out.println(list1);//[Rose, 21, t, 2.5]
        list1.add(1,"tulip");
        list1.add(5,"Violet");
        System.out.println(list1);//[Rose, tulip, 21, t, 2.5]
        System.out.println(list1.get(3));//t
        for(int i = 0; i< list3.size();i++){
            System.out.println(list1.get(i));
        }
// use for each loop to print out all elements from list1
        System.out.println(list1.get(3));//t
        for(Object o:list1){
            System.out.println(o);
        }
    }
}
// String to Primitive    ------> parseInt();
// String to Wrapper      ------> valueOf();
// int num1 = newInteger(7); ---> Unboxing
// Integer num2 = 9;       -----> Autoboxing