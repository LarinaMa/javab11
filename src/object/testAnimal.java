package object;

import java.util.Scanner;

public class testAnimal {
    public static void main(String[] args) {

        animal cat = new animal();
        System.out.println(cat.name);// null
        cat.name = "Leo";
        System.out.println(cat.name);// Leo
        cat.age = 9;
        cat.color = "orange";
        System.out.println(cat.age);//9
        System.out.println(cat.color);//orange
        animal dog = new animal();
        dog.name = "Max";
        dog.age = 18;
        dog.color = "black";
        System.out.println(dog.name);
        System.out.println(dog.age);
        System.out.println(dog.color);
        System.out.println(dog.bread);//Scottish
        System.out.println(cat.bread);//Scottish
        cat.bread = "Russian blue";
        System.out.println(cat.bread);// Russian blue
        cat.sleep();//Leo is sleeping
        dog.sleep();//Max is sleeping
        cat.eating();//Leo is eating
        cat.run();
        System.out.println(cat.energy);//90 ---> cat run 1 time
        System.out.println(dog.energy);//100 ---> dog was not run yet
        cat.getSleep();
        System.out.println(cat.energy);// 100
    }
}
