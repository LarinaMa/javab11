package object;

public class StaticPetPractice {
    String name;
    int age;
    String color;
    static double food = 20;
    public static void eat(){
        //color = "red"; you can not call non static variable into static method
        food-=1;
        System.out.println("food amount is now: "+food);
        /*
        to call non-static method into static method
        you need to create object
         */
        StaticPetPractice pet9 = new StaticPetPractice();
       // pet9.eat();
    }
    public void play(){
        System.out.println("pet is playing");
        eat();
        StaticPetPractice.eat();
        food = 100;
        color = "Blue";
    }

    public static void main(String[] args) {
        StaticPetPractice pet1 = new StaticPetPractice();
        pet1.eat();//19
        pet1.eat();//18
        StaticPetPractice pet2 = new StaticPetPractice();
        pet2.eat();//17
        pet2.eat();//16 --> because of static keyword
        eat();//15 --> it became available because we made static method
        StaticPetPractice.eat();//14
       // play();
       // StaticPetPractice.play --> unable to call without object because the method is not stat
        StaticPetPractice pet3 = new StaticPetPractice();
        pet3.play();
    }
}
