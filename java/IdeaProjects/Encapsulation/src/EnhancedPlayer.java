/**
 * Created by Tim on 8/6/2017.
 */
public class EnhancedPlayer {

    // Keeping field scope private, and including methods for changing the
    // field values provides security against manipulation and assigning
    // values outside of a desired range.

    private String name;
    private int health = 100;
    private String playerWeapon;

    // With an explicit constructor we are ensuring that the EnhancedPlayer
    // has all values supplied when instantiated, and that the health field
    // is inside the established range for the class.

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health > 0 && health <= 100) {
            this.health = health;
        } else {
            System.out.println("Health value out of range: assigning default of 100.");
        }
        this.playerWeapon = weapon;
    }

    // Here we have inserted validation to make sure a call is not attempting
    // to manipulate the method into cheating. We ensure that a negative number
    // is not passed as a parameter in order to boost health. There can be a
    // 'restoreHealth' method to properly win back health points if desired.

    public void loseHealth(int damage) {
        if(damage > 0) {
            this.health -= damage;
        } else {
            System.out.println("Damage value must not be negative. 0 health points lost.");
        }

        if(this.health <= 0) {
            System.out.println("Player is DEED...");
            // Reduce remaining lives by one
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    // We can also change the name of fields in the class being called, and keep the
    // name change invisible to the classes making calls to this class. Here we
    // changed the internal name of the field to 'playerWeapon', but to the outside
    // classes there has been no noticeable change. Even the signature for the
    // custom constructor hasn't changed.

    public String getWeapon() {
        return playerWeapon;
    }
}
