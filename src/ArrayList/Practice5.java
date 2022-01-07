package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Practice5 {
    public static void main(String[] args) {
        List<Integer> ids = new ArrayList<>();
        ids.add(11);// autoboxing and adding to the list of ids
        ids.add(22);
        ids.add(33);
        ids.add(44);


        // isEmpty();
        System.out.println("========== isEmpty(); method ======================");
        System.out.println(ids.isEmpty());//false
        //contains();
        System.out.println("========== contains(); method ======================");
        System.out.println(ids.contains(22));//true
        System.out.println(ids.contains(55));//false
        //clear(); ----> it will remove all elements
        System.out.println("====================");
        System.out.println(ids);//[11, 22, 33, 44]
        System.out.println(ids.size());//4
        System.out.println(ids.isEmpty());//false
        System.out.println("================ after clear(); method ============");
        ids.clear();
        System.out.println(ids);//{}
        System.out.println(ids.size());//0
        System.out.println(ids.isEmpty());//true

    }
}