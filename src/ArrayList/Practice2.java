package ArrayList;

import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {
        ArrayList <String> cities = new ArrayList<>();// creating new ArrayList
        cities.add("Chicago");// filling ArrayList
        cities.add("Chicago");
        cities.add(1,"Boston");
        System.out.println(cities.get(1));//Boston
        System.out.println(cities);//[Chicago, Boston, Chicago]

        cities.remove("Chicago");// removing 1st match
        System.out.println(cities);//[Boston, Chicago]
        cities.remove("chicago");// list doesn't contain chicago, nothing unchanged
        System.out.println(cities);//[Boston, Chicago]


        ArrayList <String> shoes = new ArrayList<>();
        shoes.add("Nike");
        shoes.add("Adidas");
        shoes.addAll(cities);
        System.out.println(shoes);//[Nike, Adidas, Boston, Chicago]

        shoes.remove("Boston");
        System.out.println(shoes);//[Nike, Adidas, Chicago]
        System.out.println(cities);//[Boston, Chicago]

        shoes.removeAll(cities);
        System.out.println(shoes);//[Nike, Adidas]
        shoes.remove(1);
        System.out.println(shoes);//[Nike]
        shoes.addAll(0,cities);
        System.out.println(shoes);//[Boston, Chicago, Nike]
    }
}
