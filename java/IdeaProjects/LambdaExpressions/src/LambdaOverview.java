
public class LambdaOverview {

    // Lambda expressions are new to Java 8. They are characterized by the
    // following syntax:
    //
    //     parameter -> expression body
    //
    // The characteristics of the lambda expression are as follows:
    //   > No need to declare parameter type, this is inferred
    //   > No need to declare a single parameter in parentheses
    //   > No need for curly braces if body contains single statement
    //   > No need for return keyword in single-value body
    //
    // Primarily, it is a way to reduce syntax for simple (usually
    // single-expression) methods. It eliminates the need for using
    // anonymous classes.

    interface MathOperation{
        int operation(int a, int b);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }

    public static void main(String[] args) {

        LambdaOverview tester = new LambdaOverview();

    // The following is an implementation of the MathOperations method
    // 'multiplication'. It follows permitted syntax under Java 7.

        MathOperation multiplication = (int a, int b) -> { return a * b; };

    // The following is the same type of implementation using lambda
    // expression syntax in Java 8. This time for division. No parameter
    // type declarations, no curly braces, and no return keyword.

        MathOperation division = (a, b) -> a / b;

    // NOTE: The return parameter must be assigned a value once, and only
    // once. The compiler will throw an error if it is assigned an error
    // more than once.

        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));


    }


}
