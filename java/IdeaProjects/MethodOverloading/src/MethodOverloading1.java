/**
 * Created by Tim on 7/28/2017.
 */
public class MethodOverloading1 {

    public static void main(String[] args) {

        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);

        int anotherScore = calculateScore("Dave");
        System.out.println("Another score is " + anotherScore);

        int extraScore = calculateScore(600);
        System.out.println("Extra score is " + extraScore);

        calculateScore();
    }


    // The first method has a specified name, an int return value, and two
    // parameters.

    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }


    // The second method has the same name, an int return value, and one
    // parameter. This sufficiently differentiates it from the first method.

    public static int calculateScore(int score) {

        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }


    // The third method has the same name, an int return value, and one
    // parameter. The parameter type is different from the second method,
    // and that sufficiently differentiates it from the second method.

    public static int calculateScore(String playerName) {

        System.out.println("Player " + playerName + " scored 100 points.");
        return 100000;
    }


    // The fourth method has the same name, no return value, and no parameters.
    // The lack of a return value DOES NOT differentiate it enough to make it
    // unique in the eyes of the compiler. The number or type of parameters must
    // change.

    public static void calculateScore() {

        System.out.println("No player name, no player score.");
    }
}
