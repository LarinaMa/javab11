package Primitives;

public class Boolean {
    /*
Very often, in programming, you will need data type that can only have one of the two values, like
YES/NO
ON/OFF
TRUE/FALSE
for this,Java has a boolean data type, which can take the values true or false
 */
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println("isJavaFun --> " + isJavaFun); // outputs true
        System.out.println("isFishTasty --> " +isFishTasty); // outputs false
        // A Boolean Expression is a Java expression that returns a Boolean value: true or false
        int x = 10;
        int y = 9;
        System.out.println("10 > 9 --> "+(x>y)); // returns true, because 10 is higher than 9
        System.out.println("10 < 9 --> "+(x < y)); // returns false, because 10 is less than 9
        int z = 15; // (==) --> equal to
        System.out.println("15 = 15 --> "+(z == 15)); // returns true, because the value of z = 15
        System.out.println("15 = 20 --> "+(z == 20)); // returns false, because the value of z is not equal 20
        boolean isHungry = false;
        System.out.println("First version for isHungry --> " +isHungry); // will print false

        boolean isLightOn = true;
        System.out.println("isLightOn --> " + isLightOn); // true
        System.out.println("false = true --> " +(isHungry==isLightOn));
        isHungry = isLightOn;
        System.out.println("Last version for isHungry --> " +isHungry);

    }
}


