/**
 * Created by Tim on 7/29/2017.
 */
public class ForStatement {

    public static void main(String[] args) {

        // The 'for' statement (or 'for' loop) contains 3 "phrases" in the declaration.
        // First you declare and initialize a variable; then you give conditions under
        // which the loop is to exit; then you designate the means by which the variable
        // will change on each iteration of the loop.
        // Note also the String.format() command with the floating point decimal for
        // monetary expressions.

        for (int x = 2; x <= 8; x++) {

            System.out.println("$10,000 at " + x + "% interest = $" +
                    String.format( "%.2f", calculateInterest(10000.00, x)));
        }


        // Incrementation does not have to be ++, it can be any change that can
        // be properly controlled. Subtraction, multiplcation, or stepping by
        // more than one can be done.

        for (int x = 8; x >= 2; x--) {

            System.out.println("$10,000 at " + x + "% interest = $" +
                    String.format( "%.2f", calculateInterest(10000.00, x)));
        }


        for (int x = 2; x <= 99; x *= 3) {

            System.out.println("$10,000 at " + x + "% interest = $" +
                    String.format( "%.2f", calculateInterest(10000.00, x)));
        }


        for (int x = 5; x <= 50; x += 5) {

            System.out.println("$10,000 at " + x + "% interest = $" +
                    String.format( "%.2f", calculateInterest(10000.00, x)));
        }

    }

        // One thing to note: the 'interestRate' parameter in the calculateInterest
        // method signature is a double; however the value being passed in is an integer.
        // Java is automatically converting the whole number integer into a double
        // for use in the method. The same does not work in reverse, however.

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }
}
