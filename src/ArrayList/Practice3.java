package ArrayList;

import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {
        ArrayList <String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Monkey");
        animals.add("Giraffe");
        // set() ---> replace
        System.out.println(animals);//[Lion, Cat, Dog, Monkey, Giraffe]
        animals.set(1, "Fox");
        System.out.println(animals);//[Lion, Fox, Dog, Monkey, Giraffe]

    }
}
