package Array;

import java.util.Arrays;

public class taskArray {
    public static void main(String[] args) {
        char [] chs = {'A','4','&','z','3','u','*',55};
        char []  chs1 = new char[chs.length];
        char []  chs2 = new char[chs.length];
        int count = 0;
        System.out.println(chs[7]);// 7 is 55 in ASCII table
        for (int a=0; a<chs.length; a++){
            if (chs[a] >= '0' && chs[a] <= '9'){
                System.out.println(chs[a]);
                chs1[a] = chs[a];
                count++;
            } else {
               chs2[a] = chs[a];
            }
        }
        System.out.println(Arrays.toString(chs1));//[ , 4,  ,  , 3,  ,  , 7]
        System.out.println(Arrays.toString(chs2));//[A,  , &, z,  , u, *,  ]
    }
}
