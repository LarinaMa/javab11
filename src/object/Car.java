package object;

public class Car {
    /*
    Method Overriding:
*method overriding happens in parent-child class relations
*using parent method in to child class with same syntax but different implementation
//suppose this method is in parent class
public void run(){

    sout(Parent is running);
}
// suppose this run() method is in child class
public void run(){

    sout(child is running);
}
=====Overloding======:
*method overloading happens in the same class
*signature of the method is changing
*can also change implementation
     */
    String brand;
    String dest;

    public Car(String brand){
        System.out.println("car is moving");
    }

    public Car() {
    }

    public boolean move(String dest){
        System.out.println(brand+"Moving to "+dest);
        return true;
    }
}
