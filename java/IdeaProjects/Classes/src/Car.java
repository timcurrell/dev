/**
 * Created by Tim on 7/30/2017.
 */
public class Car {              // Statement creating the class "Car"
                                // 'public' means unrestricted access to the class

    private int doors;          // Class variables are referred to as 'fields'
    private int wheels;         // Access is kept to 'private' to only allow access
    private String model;       // to the fields from the methods inside the class
    private String engine;      //
    private String colour;      // These fields are the framework for the car's state


    // This method is an access method, which performs a specific action --
    // in this case, setting the model type based on the String input
    // In java-speak, this is a "setter" -- it sets a value of a given field.

    public void setModel(String pModel) {

        // This is a good place to do validation -- check to see if the value
        // being passed in conforms to the requirements needed for that field.

        this.model = pModel;
    }


    // This method is a "getter" -- it retrieves the value from a given field.
    // Both getters and setters are part of Java's premise of encapsulation:
    // only allowing field state changes to be made based on specific and
    // limited commands prescribed within the class.

    public String getModel() {

        return this.model;
    }

}
