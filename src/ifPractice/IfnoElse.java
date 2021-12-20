package ifPractice;

public class IfnoElse {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 5;
        if (x == 1 || x > y || x > z) {
            System.out.println("one");
        }
        if (x == y || y == 2 || z == 5) {
            System.out.println("two");
        }
        if (x == y || y == z || z == x) {
            System.out.println("three");
        }
    }
}
// will print <two> and <one>, there is no else condition, it will check every condition
// if(){} else if(){} will check conditions in oder
// and will quit as soon as one condition is true and print only <one>
