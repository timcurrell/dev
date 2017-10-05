/**
 * Created by Tim on 8/5/2017.
 */
public class Car extends Vehicle {

    private int wheels;
    private int seats;
    private String engineType;
    private String bodyStyle;

    public Car(int passengers, int wheels, int seats, String engineType, String bodyStyle) {
        super("land", 1, passengers);
        this.wheels = wheels;
        this.seats = seats;
        this.engineType = engineType;
        this.bodyStyle = bodyStyle;
    }

    public void driveForwards(int speed) {

        super.move();
        System.out.println("Whoa, here we go!");
    }

    public void driveBackwards(int speed) {

        super.move();
        System.out.println("Careful, not too fast...");
    }

    public void turnLeft() {

        System.out.println("Wait for oncoming traffic.");
    }

    public void turnRight() {

        System.out.println("Go on red if you want. It's not New Jersey.");
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

}
