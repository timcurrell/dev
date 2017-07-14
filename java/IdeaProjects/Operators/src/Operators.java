/**
 * Created by Tim on 6/28/2017.
 */
public class Operators {

    public static void main(String[] args){

        // Assignment operator -- right side of operator is assigned to left side.
        int firstResult = 1 + 2;
        System.out.println("1 + 2 = " + firstResult);

        // Addition operator -- two values are added (numeric) or appended (Strings) together.
        int secondResult = 34 + 56;
        System.out.println("34 + 56 = " + secondResult);
        String thirdResult = "There are some " + "who call me Tim.";
        System.out.println(thirdResult);

        // Subtraction operator -- second value is subtracted from first value.
        int fourthResult = 987 - 543;
        System.out.println("987 - 543 = " + fourthResult);

        // Multiplication operator -- two values are multiplied by one another.
        int fifthResult = 63 * 19;
        System.out.println("63 * 19 = " + fifthResult);

        // Division operator -- first value is divided by the second value.
        double sixthResult = 1064 / 8;
        System.out.println("1064 / 8 = " + sixthResult);

        // Modulus (remainder) operator -- remaining whole value following division of two values.
        int seventhResult = 97 % 7;
        System.out.println("Modulus of 97 divided by 7 is " + seventhResult);

        // Increment operator (unary) -- increments the value by 1.
        int counter = 0;
        System.out.println("Counter is equal to " + counter);
        System.out.println("Incrementing counter: " + counter++);
        System.out.println("Incrementing counter: " + counter++);
        System.out.println("Incrementing counter: " + counter++);
        System.out.println("Notice that the value is used, THEN it is incremented.");
        System.out.println("Incrementing counter: " + ++counter);
        System.out.println("Incrementing counter: " + ++counter);
        System.out.println("Incrementing counter: " + ++counter);
        System.out.println("Using the ++ *before* the variable increments it, then uses it.");

        // Decrement operator (unary) -- decrements the value by 1.
        int newCounter = 10;
        System.out.println("newCounter is equal to " + newCounter);
        System.out.println("Decrementing counter: " + newCounter--);
        System.out.println("Decrementing counter: " + newCounter--);
        System.out.println("Decrementing counter: " + newCounter--);
        System.out.println("Same append/prepend rules apply.");

    }
}
