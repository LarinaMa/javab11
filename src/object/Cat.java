package object;

public class Cat {
    String name;
    int age;
    String color;
    int foodAmount;
    //create a method named as run(); it will take a parameter as destination
    // it will reduce food amount by 1 for every execution
    //it will print out as "Cat " is running ...<west>"
    public void run(String destination){
        foodAmount -=1;
        System.out.println(name+" is running to "+destination);
    }
    //====================================================================================
    // overload the run method
    public void run (){
        System.out.println("Overloaded run from cat class");
    }

//============================================================================================
//create a method named as setColor, it will take parameter and initialize the color of the cat
    public void setColor(String newColor){
        color = newColor;
    }
// create a method that will return color of cat, name it as a getColor()
    public String getColor(){
        return color;
    }
//=========================================================================================
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Ginger";
        cat1.color = "Orange";
        cat1.age = 3;
        cat1.foodAmount = 10;
        cat1.run("up");//Ginger is running to up
        System.out.println(cat1.foodAmount);//9
        cat1.run("west");//Ginger is running to west
        System.out.println(cat1.foodAmount);//8

        cat1.setColor("White");
        System.out.println(cat1.color);//white
        cat1.getColor();//White
        System.out.println("this is coming from get color method ----> "+cat1.getColor());
    }
}
