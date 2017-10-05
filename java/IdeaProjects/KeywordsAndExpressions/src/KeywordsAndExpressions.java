/**
 * Created by Tim on 7/16/2017.
 */
public class KeywordsAndExpressions {

    public static void main(String[] args){

        // Java has a total of 53 reserved words (keywords)
        // The IDE will highlight any of these that you type, so you know
        // when you have used one -- on purpose or otherwise.
        // Notice the words 'public', 'class', 'static', and 'void'
        // shown above.

        int static = 8;     // illegal, 'static' is a reserved word.


        // Expressions are the building blocks of all programs in Java.

        // The portion to the right of the equals sign is an example of an expression:
        double kilometers = (100 * 1.609344);

        // The variable declaration and assignment, the inspection in the 'if' statement,
        // and the string being printed are all expressions:
        int highscore = 50;
        if(highscore == 50)
            System.out.println("You earned the high score!");

    }
}
