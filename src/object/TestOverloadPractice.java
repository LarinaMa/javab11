package object;

public class TestOverloadPractice {
    public static void main(String[] args) {
        OverloadPractice obj = new OverloadPractice();
        obj.sum(4,5);
       obj.sum("String example ", 3, 5);
       obj.sum(new int[]{1,2,3,4});
       Cat cat = new Cat();
       cat.run();
       methodPractice obj2 = new methodPractice();
       obj2.ageCalculator(1900, "Newton");
    }
}
