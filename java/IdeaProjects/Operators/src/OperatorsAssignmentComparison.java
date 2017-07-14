/**
 * Created by Tim on 7/13/2017.
 */
public class OperatorsAssignmentComparison {

    public static void main(String[] args){

        // The equals sign (=) is the assignment operator
        // The double-equals sign (==) is the comparison equals operator
        // An exclamation point and equals sign (!=) is the comparison not equals operator

        boolean isAlien = false;

        if(isAlien == false)
            System.out.println("It is not an alien!");

        int topScore = 100;
        int yourScore = 90;

        if (yourScore != topScore)
            System.out.println("You did not get the top score.");


        // Java also has operation-assignment operators.
        // These perform operation on variable and assign the result to itself.

        int oaAddition = 50;
        int oaSubtraction = 50;
        int oaMultiplication = 50;
        int oaDivision = 50;

        oaAddition += 25;
        oaSubtraction -= 25;
        oaMultiplication *= 25;
        oaDivision /=25;

        System.out.println("50 += 25 is " + oaAddition);
        System.out.println("50 -= 25 is " + oaSubtraction);
        System.out.println("50 *= 25 is " + oaMultiplication);
        System.out.println("50 /= 25 is " + oaDivision);


        // Java has the standard squadron of comparison operators: <, >, <=, and >=
        // Their use is the same as in other languages

        int jeffScore = 79;
        int daveScore = 88;
        int billScore = 91;
        int lisaScore = 98;
        int maryScore = 88;
        int highScore = 98;

        if(daveScore > jeffScore)
            System.out.println("Dave's score is better than Jeff's.");

        if(daveScore < billScore)
            System.out.println("Dave's score is lower than Bill's.");

        if(maryScore <= daveScore)
            System.out.println("Dave did at least as well as Mary.");

        if(lisaScore >= highScore)
            System.out.println("Lisa had the high score!");

    }
}
