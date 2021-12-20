package Scanner;

public class trimMethod {
    public static void main(String[] args) {
        String name = "    Techtorial        Academy is located at des plains    ";
        System.out.println(name);
        //.trim(); --> it will remove spaces before and after string, it is not touching spaces between words
       String newName = name.trim();
        System.out.println(newName);
    }
}
