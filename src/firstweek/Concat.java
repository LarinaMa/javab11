package firstweek;

public class Concat {
    /*
    The concat() method appends (concatenate) a string to the end of another string.
     */
    public static void main(String[] args) {
        String number = "1";
        number += 2;
        number += 2;
        System.out.println(number); // will print 122
        String test = "Chicago";

        test =  test.concat(" is the best");
        test = test.concat(" in the summer");
        System.out.println(test); // Chicago is the best in the summer

        test += test.concat( " Ever"); //Chicago is the best in the summerChicago is the best in the summer Ever
        System.out.println(test);
        String firstName = "John ";
        String lastName = "Smith";
        System.out.println(firstName.concat(lastName));//John Smith


    }
}

