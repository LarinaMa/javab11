package Scanner;

public class StringPractice1 {
    public static void main(String[] args) {
        String word = "tech";
        System.out.println(word);
        String word2 = new String("tech");
        System.out.println(word2);
        String word3 = "Tech" + "Torial";
        System.out.println(word3);
        System.out.println(word + "JAVA");
        System.out.println(word);
        System.out.println(word + "" + "77");// will print tech77
        System.out.println(word + 7 + 8);// will print tech78
        // System.out.println(word + 7-8); not compile, you can not subtract
        System.out.println(word + (7 - 8)); // will print tech-1
        System.out.println(7 + 8 + word + 7 + 8);//will print 15tech78
        System.out.println(word + 7 * 8);// will print tech56
        word += "Torial";
        System.out.println(word); // will print techTorial
        word += 33;
        System.out.println(word); // techTorial33
        //word -= "Torial"; will not work, you can not subtract from string
        word += 33 - 11;
        System.out.println(word); // techTorial3322
    }
    }
