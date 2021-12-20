package IncrementDecrement;

public class Meaning {
    public static void main(String[] args) {
        /*
        Increment ++   --> same as x = x+1
        ++x; --> prefix form
        x++; --> postfix form
        Decrement --   --> same as x = x-1
        --x; --> prefix form
        x--; --> postfix form
        When an increment or decrement operator precedes its operand,
        Java will perform the corresponding operation prior to obtaining the operand's value
        for use by the rest of the expression.
        if the operator follows its operand, java will obtain the operand's value before incrementing/decrementing
         */
        int x = 10;
        int m = ++x * x++;
        //       11 * 11 = 121

        System.out.println("x = "+x);// was 11 became 12
        System.out.println("m = " +m); //121
    }
}
