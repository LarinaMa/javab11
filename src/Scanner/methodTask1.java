package Scanner;

public class methodTask1 {
    //String str = " Zero to Ten  ";
    //- change 'Ten' with/to 'HERO'
    //- make all of the string uppercase
    //- remove all spaces
    //- get only first three letter
    //- print the length of those three letters as ==> "The length of final verison is: +  <length>"
    public static void main(String[] args) {
        String str = " Zero to Ten  ";
        System.out.println(str);
        str = str.replace("Ten" ,"HERO");
        System.out.println(str);
        str = str.toUpperCase();
        str = str.trim();
        System.out.println(str);
    str = str.replace(" " ,"");
        System.out.println(str);
        str = str.substring(0 ,3);
        System.out.println(str);
    int x = str.length();
        System.out.println("The length of final version is: "+x);
    }
}
