/**
 * Created by Tim on 8/5/2017.
 */
public class Ferrari extends Car {

    private String color;
    private boolean convertible;
    private int cylinders;

    public Ferrari(int passengers, int seats, String engineType, String bodyStyle, String color, boolean convertible, int cylinders) {
        super(passengers, 4, seats, engineType, bodyStyle);
        this.color = color;
        this.convertible = convertible;
        this.cylinders = cylinders;
    }

    public void startEngine() {

        System.out.println("VROOM!!! Growl, growl, hiss, growl...");
    }

    public void squealTires() {

        System.out.println("SSSCCCCCRRRRRRRREEEEEEEEEEEEEEE");
    }

    public String getColor() {
        return color;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public int getCylinders() {
        return cylinders;
    }

}
