/**
 * Created by Tim on 8/5/2017.
 */
public class CompositionChallenge {

    // Create a single room of a house using composition.
    // These can be physical parts of the room, but they can
    // also be furniture or other items.
    // Add at least one method to access an object via a getter
    // and then that object's public method.
    // Then add at least one method to hide the object but allow
    // access to the object through the main class.

    public static void main(String[] args) {

        // The "Room" class is made up of certain field characteristics, but it is
        // also made up of additional classes -- two Chairs, a Couch, and a HomeTheater.
        // These classes must be instantiated, and then those instances passed to the
        // Room class as parameters.

        Chair blueChair = new Chair("Cloth","Large", "Blue", true, true,true);

        Chair redChair = new Chair("Cloth", "Large", "Red", true, true, false);

        Couch bigCouch = new Couch("Brown", 3, true);

        // Notice also that the HomeTheater class is made up of an HDTV, a BluRay, and
        // a SurroundSound. All of THOSE classes must be instantiated to comprise the
        // HomeTheater class prior to that class being passed.

        Resolution hdtvResolution = new Resolution(2540, 1920);
        HDTV myHDTV = new HDTV("Sony", hdtvResolution,false);

        SurroundSound mySurroundSound = new SurroundSound("Harmon Kardon", 9, true, "8.1");

        BluRay myBluRay = new BluRay("Sony", 4, 6);

        HomeTheater myHomeTheater = new HomeTheater(myHDTV, mySurroundSound, myBluRay);

        // Finally, we can create our new Room.

        Room myRoom = new Room(4, 0, "Carpet", "None",
                blueChair, redChair, bigCouch, myHomeTheater);

        // Now the fields and methods from all of the classes can be referenced from
        // the main method.

        myHomeTheater.turnOn();         // Referencing the locally-created instance

        myRoom.dimLights();

        myBluRay.showMovie("Finding Nemo");

        myRoom.turnLightsOn();

        myRoom.getSonyHomeTheater().turnOff();      // Referencing the component instance (same thing)

        myRoom.turnLightsOff();

    }

}
