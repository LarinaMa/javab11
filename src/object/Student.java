package object;

import java.util.Random;

public class Student {
    String name;
    int age = 23;// first method to initialize variable
    int id;
    public void setId(int number){
        id = number;// second method to initialize variable
    }
    public void study(int hour){
        System.out.println(name+" is studying "+ hour+" hours");
    }
    public void sleep(int hour){
        System.out.println(name+" is sleeping "+ hour+" hours");
    }
    public void reading(){
        System.out.println(name+" is reading "+ createHour()+" hours");
    }
    public static int createHour(){
        Random random = new Random();
        return random.nextInt(12);
    }

    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name = "David";// third method to initialize variable
        std1.study(12);
        std1.reading();
        std1.sleep(8);
        System.out.println(createHour());
    }
}
