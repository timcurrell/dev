import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Tim on 8/5/2017.
 */
public class Vehicle {

    private String mode;    // Land, sea, air, space
    private int drivers;
    private int passengers;

    public Vehicle(String mode, int drivers, int passengers) {
        this.mode = mode;
        this.drivers = drivers;
        this.passengers = passengers;
    }

    public void move() {

        System.out.println("Kick it!");
    }


    public void stop() {

        System.out.println("Easy now... aaaand we're stopped.");
    }

    public String getMode() {
        return mode;
    }

    public int getDrivers() {
        return drivers;
    }

    public int getPassengers() {
        return passengers;
    }

}
