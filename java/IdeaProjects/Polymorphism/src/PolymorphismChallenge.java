/**
 * Created by Tim on 8/6/2017.
 */
public class PolymorphismChallenge {

    // Create a base class called Car. This should have a few fields that would
    // be appropriate for a generic car -- engine, cylinders, wheels,
    // The constructor should initialize the name and number of cylinders;
    // set wheels to 4 and engine to true.
    //
    // Create appropriate getters for the various fields.
    //
    // Create some methods like startEngine, speedUp, slowDown, etc.
    // Show a message in each method of the base class.
    //
    // Now create 3 subclasses for your favorite vehicles.
    // Override the appropriate methods to show polymorphism in use.


    static class Car{

        private String name;
        private int cylinders;
        private int wheels = 4;
        private boolean engine = true;
        private boolean inTheShop = false;

        public Car(String name, int cylinders, boolean inTheShop) {
            this.name = name;
            this.cylinders = cylinders;
            this.inTheShop = inTheShop;
        }

        public String getName() {
            return name;
        }

        public int getCylinders() {
            return cylinders;
        }

        public int getWheels() {
            return wheels;
        }

        public boolean isEngine() {
            return engine;
        }

        public boolean isInTheShop() {
            return inTheShop;
        }

        public String startTheCar() {
            if(inTheShop) {
                return "Sorry, car is in the shop.";
            } else {
                return "VVVRRROOOMMMMM!!!";
            }
        }

        public String accelerate() {
            return "MMMMMMMMMMEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAHHHHHHHHHHH!!!";
        }

    }

    static class Ferrari extends Car{

        public Ferrari(){
            super("Ferrari", 12, false);
        }

        public String accelerate() {
            return "WWWWWWWWWWWUUUUUUUUUUUUOOOOOOOOOOOOOOHHHHHHHHHHHHHHHH!!!";
        }

    }

    static class Porsche extends Car{

        public Porsche(){
            super("Porsche", 6, false);
        }

        public String accelerate() {
            return "RRRRRRRRRRRRRROOOOOOOOOOOOOWWWWWWWWWWWWWWLLLLLLL!!!";
        }

    }
    static class RangeRover extends Car{

        public RangeRover(){
            super("RangeRover", 8, true);
        }

    }


    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i + ":  " + car.getName());
            System.out.println("Cylinders:  " + car.getCylinders());
            System.out.println("Starting car:  " + car.startTheCar());
            if(car.inTheShop == false) {
                System.out.println("Now punch it!  " + car.accelerate() + "\n");
            } else {
                System.out.println("");
            }
        }

    }


    public static Car randomCar() {

        int randomNumber = (int) (Math.random() * 3) + 1;

        switch (randomNumber) {
            case 1:
                return new Ferrari();
            case 2:
                return new Porsche();
            case 3:
                return new RangeRover();
        }

        return null;
    }


}
