package Scanner;

public class StringMethods4 {
    public static void main(String[] args) {
        String word = "Sunday";
        //.replace();
       String updatedWord =  word.replace('a' ,'$');//using ' ' because char
        System.out.println(updatedWord);//Sund$y
        String updatedWord1 = word.replace("Sun" ,"Satur");// using " " because string
        System.out.println(updatedWord1);//Saturday
        System.out.println(word.replace("day" ,"minutes")); //Sunminutes
        System.out.println(word.replace("day" ,"@"));// Sun@
        String code = "java";
        System.out.println(code.replace('a' ,'%'));// j%v% -->replacing all 'a'
           }
}
