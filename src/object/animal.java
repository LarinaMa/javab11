package object;

public class animal {
    // instance variable
    String name; // ----> instance variable
    int age;
    String color;
    String bread = "Scottish";
    int energy = 100;
public void sleep(){
    System.out.println(name+ " is sleeping");
}
public void eating(){
    System.out.println(name+ " is eating");
}
public void run(){
   energy = energy-10;

}
public void getSleep(){
    energy = energy+10;
}
public void info(){
    System.out.println("Name is "+name+" Age is "+age +" Color is "+color+ " Energy is "+ energy);
}
}
