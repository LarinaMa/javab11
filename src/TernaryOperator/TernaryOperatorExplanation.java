package TernaryOperator;

public class TernaryOperatorExplanation {
    public static void main(String[] args) {
        /*
  ternary operator is a type of Java conditional operator
  the meaning of ternary is composed of three parts. The ternary operator (? :) consists of three operands.
  It is used to evaluate Boolean expressions. The operator decides which value will be assigned to the variable.
  It is the only conditional operator that accepts three operands. It can be used instead of the if-else statement.
  It makes the code much more easy, readable, and shorter.
                 variable = (condition) ? expression1 : expression2
Note: Every code using an if-else statement cannot be replaced with a ternary operator.
      ______________________
     |                     |
   true                    |
     |                     |
<condition>     ?     < expression 1 >     :     < expression 2 >
     |                                                |
     |__________ false _______________________________|
         */
        int x, y;
        x = 20;
        y = (x == 1) ? 61: 90;
        System.out.println("Value of y is: " +  y);// 90
        y = (x == 20) ? 61: 90;
        System.out.println("Value of y is: " + y);// 61
        /*
    In the above program, we have taken three variables x, y, and z having the values 69, 89, and 79, respectively.
    The expression (x > y) ? (x > z ? x : z) : (y > z ? y : z) evaluates the largest number among three numbers
    and store the final result in the variable largestNumber. Let's understand the execution order of the expression.
    First, it checks the expression (x > y). If it returns true the expression (x > z ? x : z) gets executed,
    else the expression (y > z ? y : z) gets executed.
  When the expression (x > z ? x : z) gets executed, it further checks the condition x > z.
  If the condition returns true the value of x is returned, else the value of z is returned.
  When the expression (y > z ? y : z) gets executed it further checks the condition y > z.
  If the condition returns true the value of y is returned, else the value of z is returned.
  Therefore, we get the largest of three numbers using the ternary operator.
         */
        int x1=69;
        int y1=89;
        int z1=79;
        int largestNumber= (x1 > y1) ? (x1 > z1 ? x : z1) : (y1 > z1 ? y1 : z1);
        //  The expression (x > y) ? (x > z ? x : z) : (y > z ? y : z)
        //  evaluates the largest number among three numbers and store the final result in the variable largestNumber
        System.out.println("The largest numbers is:  "+largestNumber);//The largest numbers is:  89
    }
}
