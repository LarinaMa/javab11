package Scanner;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class StringMethods {
    /*
    .concat(); --> adding strings together , takes string parameter("text")
    .charAt(); --> returning single character, takes int parameter (1)
    .length(): --> returns length of the string
    .indexOf();--> returns index number of given char
     */
    public static void main(String[] args) {
        String device = "microphone";
      device.concat(" is an input device");
        System.out.println(device); // microphone
        char ch = device.charAt(1);
        System.out.println(ch); // i
        int letterCount = device.length();
        System.out.println(letterCount);
        device += " is expensive";
        System.out.println(device.length());
        device.concat(" device");
        System.out.println(device.length());
        device = device.concat(" device");
        System.out.println(device.length());
        // take last char from this last version of the string
        System.out.println(device.charAt(29)); // e

        String example ="The left-hand side of the compound operator can only be applied to a variable that is \n" +
                "already defined and cannot be used to declare a new variable. In the previous example, if x\n" +
                "was not already defined, then the expression x *= z would not compile.";
       char lastChar =  example.charAt(example.length()-1);
        System.out.println(lastChar);
        String example2 = "Thanksgiving is over. The price of the turkey will go down, So you can find more inexpensive purchases";
        int count = example2.length();
        char lastLetter = example2.charAt(count-1);
        System.out.println(lastLetter);
        //find the middle char from string
        String school = "Techtorial";
        System.out.println(school.charAt(school.length()/2)); // o
        System.out.println(school.charAt((school.length()-1)/2)); // t
        String flower = "Rose";
        //               0123
       int indexOfR =  flower.indexOf("R");
       int indexOfR1 =  flower.indexOf('R');
        System.out.println("first implementation  " +indexOfR );
        System.out.println("first implementation 'R' " +indexOfR );
        System.out.println(flower.indexOf("o"));//1
        System.out.println(flower.indexOf("os"));//1
        System.out.println(flower.indexOf("o,s"));// if it does not find matching char/char sequence it wii return -1
        System.out.println(flower.indexOf("rose")); // no match R not equal r, will return -1
        System.out.println(flower.indexOf("Rose")); // 0
        System.out.println(flower.indexOf("Roses")); // no match Rose not equal Roses, will return -1
        String object = "umbrellam";
        //               012345678
        System.out.println(object.indexOf('l'));// 5
        System.out.println(object.indexOf('l' ,6)); // 'l' ,6 output 6
        System.out.println(object.indexOf('m' ,object.indexOf('m')+1));//8
        System.out.println(object.indexOf('r'));
        String sentence = "I love lilies";
        //                 0123456789
        System.out.println(sentence.indexOf('l' ,sentence.indexOf('i')));//9 (finding index of second i)
    }




}
