public class IfThenShorthand {

    private static boolean isBonusMember() {
        return true;
    }

    public static void main(String[] args) {

        // Java has a shorthand for simple if/then/else statements wrapped up
        // in what they call a 'ternary operator'. The syntax is as follows:
        //
        //     variable = condition ? result-true : result-false;
        //
        // One or the other result- values is assigned to variable -- the
        // first one if the condition is true, the second if it is false.

        int price = isBonusMember() ? 80 : 99;


        // Condition, result-true, and result-false can all be expressions
        // instead of just values.

        int a = 50;
        int b = 90;
        int c = 130;

        int myResult = (a > b) ? (b / a) : (a / b);

        // One thing to note: all three components must be present for the
        // ternary phrase to compile. You may not use it as a simple if-then.
        // In such cases a simple if-then single-line statement is better.


        // Additionally, you can actually nest a ternary phrase within
        // another ternary phrase. This more or less replicates if-then-elseif
        // functionality, but the implementation is difficult to decipher.

        int amount = 10;

        String result = amount <= 2 ? "couple" :
                amount > 2 && amount < 5 ? "few" :
                        amount <= 5 ? "several" : "many";
    }

}
