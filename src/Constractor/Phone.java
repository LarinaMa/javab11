package Constractor;

public class Phone {
    String brand ;
    double price = 1000;
    String color;
    // CONSTRACTOR
    public Phone(){
        this("Navy Blue","Google");
        System.out.println("This is no argument constructor");
    }
    public Phone(String newColor){
        this.color = newColor;
        System.out.println("This is ONE argument constructor");
    }
    public Phone(String newColor,String newBrand){
        this.color = newColor;
        this.brand = newBrand;
    }
    public Phone(String newColor, String newBrand, double newPrice){
        this.color = newColor;
        this.brand = newBrand;
        this.price = newPrice;
    }
;
    //METHOD
    public void call(int number){
        System.out.println(number+" is being called");
    }
    public void setColor(String color1){
        color = color1;
    }



}
// this  ---> it refers to the current class variables and methods that you are in
// this() --> it refers to the current class's constructor