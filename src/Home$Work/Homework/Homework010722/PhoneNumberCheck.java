package Home$Work.Homework.Homework010722;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
        Write public method named isValidPhone in Main.java that takes  a string parameter
as phone number that is separated by hyphens,
check if the phone number is valid or not?
 If it is valid return true, if it is not return false.
Note : return type of method is boolean.

Mobile Number validation criteria:
The first digit should contain number between 7 to 9(Including 7 and 9).
The rest 9 digit can contain any number between 0 to 9.

Example:
773-773-2374 -> return true
224-224-2224 -> return false  -> because first character is not between 7 to 9
773-7777-711 -> return false  -> because one of hyphens are not in the right place

         */
public class PhoneNumberCheck {// method
    public static boolean isValidPhone(String str){
        String [] word = str.split("-");
        List<String> list = Arrays.asList(word);
        boolean equals3=false;
        int count = 0;
        for(int i = 0; i<2;i++){
            if(list.get(i).length()==3){
                count++;
            }
        }
        int a = list.get(2).length();
        if(count==2 && a==4 && (list.get(0).startsWith("7")||list.get(0).startsWith("8")||list.get(0).startsWith("9"))){
            equals3=true;
        } else {
        equals3=false;}
        return equals3;
    }
    public static void main(String[] args) {
        String str1 = "773-773-2374";
        String str2 = "224-224-2224";
        String str3 = "773-7777-711";
        String [] word1 = str1.split("-");
        String [] word2 = str2.split("-");
        String [] word3 = str3.split("-");
        System.out.println(Arrays.toString(word1));//[773, 773, 2374]
        System.out.println(Arrays.toString(word2));//[224, 224, 2224]
        System.out.println(Arrays.toString(word3));//[773, 7777, 711]


        List<String> list1 = Arrays.asList(word1);//converting from array to a list
        System.out.println(list1.size());//3
        List<String>list2 = Arrays.asList(word2);
        List <String> list3 = Arrays.asList(word3);
        for(String str11:list1) {// "for each loop" to print every element of array
            System.out.println(str11);
        }
        System.out.println("========================");
        boolean equals3 = false;
        int count = 0;
       for(int i = 0; i<2;i++){
           if(list3.get(i).length()==3){
               count++;
           }
           int a = list3.get(2).length();
           if(count==2 && a==4 && (list3.get(0).startsWith("7")||list3.get(0).startsWith("8")||list3.get(0).startsWith("9"))){
               equals3=true;
           } else {
               equals3=false;}
       }
        System.out.println(str1+" phone number to check");
        System.out.println(list1);
        System.out.println(list1.get(0)+" ---> The first digit should contain number between 7 to 9 inclusive");
        System.out.println(list1.get(2).length()+" --> length of last digits(xxxx), has to be 4");
        System.out.println(count+"--> count = 2 if first two digits have right format(xxx-xxx)");
        System.out.println(equals3+" -->true if meets all criteria");
        System.out.println("==========================================");
        System.out.println(str2+" phone number to check");
        System.out.println(list2);
        System.out.println(list2.get(0)+" ---> The first digit should contain number between 7 to 9 inclusive");
        System.out.println(list2.get(2).length()+" --> length of last digits(xxxx), has to be 4");
        System.out.println(count+"--> count = 2 if first two digits have right format(xxx-xxx)");
        System.out.println(equals3+" -->true if meets all criteria");
        System.out.println("==========================================");
        System.out.println(str3+" phone number to check");
        System.out.println(list3);
        System.out.println(list3.get(0)+" ---> The first digit should contain number between 7 to 9 inclusive");
        System.out.println(list3.get(2).length()+" --> length of last digits(xxxx), has to be 4");
        System.out.println(count+"--> count = 2 if first two digits have right format(xxx-xxx)");
        System.out.println(equals3+" -->true if meets all criteria");


        System.out.println("===================");
        System.out.println(PhoneNumberCheck.isValidPhone(str1));
        System.out.println(PhoneNumberCheck.isValidPhone(str2));
        System.out.println(PhoneNumberCheck.isValidPhone(str3));
            }
        }


