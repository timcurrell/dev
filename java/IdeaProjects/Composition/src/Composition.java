/**
 * Created by Tim on 8/5/2017.
 */
public class Composition {

    public static void main(String[] args) {

        // The relationship that inheritance represents can be described as "___ is a ___."
        // For instance, a car is a vehicle. A Mac is a computer.
        // The relationship that composition represents can be described as "___ has a ___."
        // A car has an engine. A computer has a motherboard.
        // This is accomplished by having classes as fields inside of the class declaration.
        // Whereas inheritance allows you inherit fields and methods from the parent class,
        // composition allows you to inherit fields from multiple classes.


        // When passing a class as a parameter for another class, you have two options. The first is
        // to define a new instance of the class to be passed, and pass that instance.

        Dimensions dimensions = new Dimensions(12, 16, 4);
        Case theCase = new Case("Dell", "Inspiron", "240MHz", "desktop", dimensions);


        // The second option is to declare that new instance on the fly right in the parameter list.
        // This is only done when you have no need to refer to that instance anywhere else, because
        // as you'll notice, that instance does not have a name.

        Monitor theMonitor = new Monitor("Dell", "XHD24", 24, new Resolution(2540, 1440));

        MotherBoard theMotherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");


        // So now, we will declare our Computer. The computer will have a Case, a Monitor, and a
        // Motherboard. But the Monitor will also have a Resolution, and the Case will have
        // Dimensions.

        Computer myComputer = new Computer(theCase, theMonitor, theMotherBoard);


        // Now, the fields and methods that are available to the component classes are also
        // available to the owning class.

        myComputer.powerUp();       // Calls a method in the Computer class
    }

}
