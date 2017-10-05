/**
 * Created by Tim on 7/22/2017.
 */
public class Methods1 {

    // One note before we get started ---
    // There is no rule against using the same variable/parameter names either
    // inside or outside of the method. However, it becomes TERRIBLY difficult
    // to keep track of which value is where, which variable is local vs.
    // global, and what value it contains -- especially when you are changing
    // value of variables inside the method. To keep things straight, don't
    // use the same names.

    // Main method

    public static void main(String[] args){

        boolean gameOver = false;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 150;
        int lives = 3;

        while(!gameOver){           // Shorthand for 'gameOver == false'
            lives -=1;
            System.out.println("Game is still going!");
            gameOver = isFinished(lives);
        }

        System.out.println("Sorry, game over...");

        calculateScore(gameOver, score,levelCompleted, bonus);

        // You can also pass raw values, you don't have to pass variables

        calculateScore(true, 9000, 8, 200);

    }


    // calculateScore method
    // Receives four parameters, returns none

    public static void calculateScore(boolean gO, int sc, int lc, int bo){

        // You can either transfer the passed-in parameter values into local
        // variables, or use the named parameters directly.

        boolean gameOver = gO;
        int score = sc;

        if(gameOver) {
            int finalScore = score + (lc * bo);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }


    // isFinished method
    // Receives one parameter (int), returns one parameter (boolean)
    // Notice no local variables are declared, the return value does
    // not need to have a formal named variable.

    public static boolean isFinished(int livesRemaining){

        if(livesRemaining == 0)
            return true;            // return keyword is now you pass back a value
        else
            return false;           // return keyword is now you pass back a value
    }
}
