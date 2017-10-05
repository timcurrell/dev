/**
 * Created by Tim on 8/6/2017.
 */
public class Player {

    // This is an example of a class that does *not* use encapsulation.

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {

        this.health -= damage;
        if(this.health <= 0) {
            System.out.println("Player is DEED...");
            // Reduce remaining lives by one
        }
    }

    public int healthRemaining() {

        return this.health;
    }

}
