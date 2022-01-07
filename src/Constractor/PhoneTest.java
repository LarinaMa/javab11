package Constractor;
public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "I-phone";
        phone.call(5705017);
        Phone phone5 = new Phone("Black", "Google");
        System.out.println(phone5.color);
        System.out.println(phone5.brand);
        Phone phone1 = new Phone();
        System.out.println(phone1.color);
        Phone phone2 = new Phone("Rose Gold");
        System.out.println(phone2.color);
        System.out.println(phone2.brand);
        Phone phone3 = new Phone("White", "Nokia");
        System.out.println(phone3.color);
        System.out.println(phone3.brand);
        System.out.println(phone3.price);
        Phone phone4 = new Phone("Black","Samsung",1500);
        System.out.println(phone4.color);
        System.out.println(phone4.price);
        System.out.println(phone4.brand);
    }
}
