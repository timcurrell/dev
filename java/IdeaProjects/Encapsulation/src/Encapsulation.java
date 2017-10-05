/**
 * Created by Tim on 8/6/2017.
 */
public class Encapsulation {

    public static void main(String[] args) {

        // This is calling a class that is not encapsulated. You pretty much have
        // access to all fields and methods.

        Player player = new Player();       // Using default constructor

        player.name = "Tim";
        player.health = 20;
        player.weapon = "Mace";

        int damage = 5;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 25;
        player.loseHealth(damage);
        System.out.println("Player " + player.name + " has remaining health = " + player.healthRemaining());

        // However, there are three main drawbacks to this approach.
        // First, wide access to all of the methods and fields mean any class
        // can utilize the methods and manipulate the fields at any time. This
        // may result in unexpected or even detrimental results.
        // Second, if any field names in the class change, then the classes
        // that call them are all screwed. Programmers have to go into the code,
        // find out what the new name is, and locate every... single... instance
        // where the old name is used. This is cumbersome and unnecessary.
        // And finally, if there is no explicit constructor, it is possible to
        // have a class instance created with one or more fields not initialized.
        // This means you run into trouble when you try to use the class instance.

        Player newPlayer = new Player();

        newPlayer.weapon = "Sword";

        damage = -1000;                     // Ummm, cheating!
        newPlayer.loseHealth(damage);
        System.out.println("Player " + newPlayer.name + " has remaining health = " + newPlayer.healthRemaining());


        // Now we will create our players out of the EnhancedPlayer class. This will provide
        // no direct access to the fields, will ensure proper instantiation with initialization
        // of the component fields, and will provide validation against cheating with health
        // point assignment.

        EnhancedPlayer dave = new EnhancedPlayer("Dave", 80, "Spear");
        EnhancedPlayer cheater = new EnhancedPlayer("Khan", 1000, "Machine Gun");

        damage = 5;
        dave.loseHealth(damage);
        System.out.println("Player " + dave.getName() + " has remaining health = " + dave.getHealth());

        damage = -1000;                     // Ummm, cheating!
        cheater.loseHealth(damage);
        System.out.println("Player " + cheater.getName() + " has remaining health = " + cheater.getHealth());
    }

}
