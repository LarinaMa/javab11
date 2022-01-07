package ArrayList;

public class Computer {
    String brand, color;
    double price, screenSize;
    int storage;


// constructor
    public Computer(String brand, String color, double price, double screenSize, int storage) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.screenSize = screenSize;
        this.storage = storage;
    }

    @Override //Generate-->toString()-->choose fields
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", screenSize=" + screenSize +
                ", storage=" + storage +
                '}';
    }

}
