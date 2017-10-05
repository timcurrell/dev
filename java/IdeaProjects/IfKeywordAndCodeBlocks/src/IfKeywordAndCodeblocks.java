/**
 * Created by Tim on 7/18/2017.
 */
public class IfKeywordAndCodeblocks {

    public static void main(String[] args){

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        // Curly brackets are optional for single-line code blocks
        // Plus, because Java treats multiple whitespace characters
        // the same as just one, you can place an entire if statement
        // with a single line code block on one line.

        if(score == 5000){
            System.out.println("Your score was 5000.");
        }

        if(levelCompleted == 5)
            System.out.println("You have reached level 5!");

        if(gameOver == true) System.out.println("I'm sorry, the game is over");


        // Curly brackets are not required even when using 'else' as part
        // of the if statement, so long as the statements are single-line
        // code blocks.

        if(score < 1000)
            System.out.println("Your score was less than 1000.");
        else if(score >= 1000 && score < 5000)
            System.out.println("Your score was between 1000 and 5000.");
        else if(score >= 5000)
            System.out.println("Your score was more than 5000!");


        // Multiple line code blocks are denoted by curly brackets.

        if(gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }


        // Remember that variables created inside a code block are not
        // visible to the code outside of the code block.

        int savedFinalScore = finalScore;       // Illegal; finalScore is local
                                                // variable inside previous code block

    }
}
