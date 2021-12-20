package Scanner;

import java.util.Locale;

public class methodChaining {
    public static void main(String[] args) {
        // method chaining --> you can use method after method
        //String str = " Zero to Ten  ";
        //- change 'Ten' with/to 'HERO'
        //- make all of the string uppercase
        //- remove all spaces
        //- get only first three letter
        //- print the length of those three letters as ==> "The length of final verison is: +  <length>"
        String str = "  Zero to Ten  ";
int a = str.replace("Ten" ,"HERO").toUpperCase().trim().replace(" " ,"").substring(0 ,3).length();
// there is no methods on integer, because .length() output is integer you can not apply any others methods after .length()
        //you can use method as may as you wants but they suppose to be String value
        System.out.println(a);
        System.out.println(str.replace("Ten" ,"HERO").toUpperCase().trim().replace(" " ,"").substring(0 ,3).length());
        String name = "               David   ";
        int d = name.substring(5).substring(2).toUpperCase().replace('D' ,'d').trim().charAt(0);
        System.out.println(name.substring(5).substring(2).toUpperCase().replace('D' ,'d').trim());//dAvid
        System.out.println(d);//100
    }
}

