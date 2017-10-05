/**
 * Created by Tim on 8/5/2017.
 */
public class InheritanceChallenge {

    public static void main(String[] args) {

        F488GTB Ariel = new F488GTB("red");
        GTC4Lusso Christie = new GTC4Lusso("blue");
        CaliforniaT Ashley = new CaliforniaT("black");

        Ariel.startEngine();
        Ariel.squealTires();
        Ariel.driveForwards(99);
        Ariel.turnLeft();
        Ariel.turnRight();
        Ariel.stop();

        Christie.startEngine();
        Christie.driveBackwards(3);
        Christie.stop();
        Christie.driveForwards(30);
        Christie.turnLeft();
        Christie.turnRight();
        Christie.stop();

        Ashley.startEngine();
        Ashley.putTopDown();
        Ashley.squealTires();
        Ashley.driveForwards(55);
        Ashley.turnLeft();
        Ashley.turnRight();
        Ashley.stop();
    }

}
