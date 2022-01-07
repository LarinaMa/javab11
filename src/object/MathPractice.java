package object;

public class MathPractice {
    public void sum() {// void return no parameters
        int a = 11;
        int b = 22;
        int sum = a + b;
        System.out.println(a + "+" + b + " = " + sum);
    }

    public void total(int num, int num1) {// void return with parameters
        int total = num + num1;
        System.out.println(num + " + " + num1 + " = " + total);
    }

    public int sum2(int number1, int number2) {
        int result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        return result;// return statement
    }

    public String speak() {
        return "This is example String return type";
    }

    public String numberToString(double d) {
        return "" + d;
    }

    public String FirstLastName(String First, String Last) {
        return First.concat(Last);
    }
}

