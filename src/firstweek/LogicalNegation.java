package firstweek;

public class LogicalNegation {
    public static void main(String[] args) {
        boolean isLightOn = false;
        System.out.println(isLightOn);
        System.out.println(!isLightOn);// ! changed false to true
        System.out.println(5==5);
        System.out.println(!(5==5));// ! changed true to false
        System.out.println(1+1 == 3);
        System.out.println(!(1+1 == 3)); // ! changed false to true
        boolean haveMoney = false;
        haveMoney = !haveMoney;
        System.out.println(haveMoney);
        System.out.println(!haveMoney);


    }
}


