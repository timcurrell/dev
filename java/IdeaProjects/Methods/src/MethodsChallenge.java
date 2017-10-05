/**
 * Created by Tim on 7/23/2017.
 */
public class MethodsChallenge {

    public static void main(String[] args) {

        String playerName = "";
        int score = 0;
        int levelCompleted = 0;
        int bonus = 100;
        int position = 0;
        int finalScore = 0;

        playerName= "Dave";
        score = 1500;
        levelCompleted = 9;

        finalScore = calculateScore(score, levelCompleted, bonus);
        position = calculateHighScorePosition(finalScore);
        displayHighScorePosition(playerName, position);

        playerName= "Mike";
        score = 900;
        levelCompleted = 2;

        finalScore = calculateScore(score, levelCompleted, bonus);
        position = calculateHighScorePosition(finalScore);
        displayHighScorePosition(playerName, position);

        playerName= "Tim";
        score = 400;
        levelCompleted = 1;

        finalScore = calculateScore(score, levelCompleted, bonus);
        position = calculateHighScorePosition(finalScore);
        displayHighScorePosition(playerName, position);

        playerName= "Phil";
        score = 50;
        levelCompleted = 1;

        finalScore = calculateScore(score, levelCompleted, bonus);
        position = calculateHighScorePosition(finalScore);
        displayHighScorePosition(playerName, position);

    }


    public static int calculateScore(int pScore, int pLevelCompleted, int pBonus){

        int finalScore = pScore + (pLevelCompleted * pBonus);
        finalScore += 50;
        return finalScore;

    }


    public static int calculateHighScorePosition(int pFinalScore) {

        int position = 0;

        // We haven't learned about switch/case statements yet, so we
        // get to do this awkwardly with nested if-then-else statements

        if(pFinalScore > 1000) {
            position = 1;
        } else if(pFinalScore > 500 && pFinalScore <= 1000) {
            position = 2;
        } else if(pFinalScore >= 100 && pFinalScore <= 500) {
            position = 3;
        } else {
            position = 4;
        }

        return position;
    }


    public static void displayHighScorePosition(String pName, int pPosition) {

        System.out.println("Player " + pName + " managed to get into position " + pPosition + "!");
    }

}
