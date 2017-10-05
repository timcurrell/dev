/**
 * Created by Tim on 7/23/2017.
 */
public class Methods2 {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        // It is possible (and common practice) to assign call a method and assign the value
        // returned from the method to a variable in one statement. This way you have a place
        // to store the returned value in order to use it later.

        int highscore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highscore);

        score = 1200;
        levelCompleted = 8;
        bonus = 250;

        highscore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highscore);

    }


    public static int calculateScore(boolean pGameOver, int pScore, int pLevelCompleted, int pBonus){

        if(pGameOver) {

            int finalScore = pScore + (pLevelCompleted * pBonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }

    }
}
