/**
 * Created by Tim on 8/5/2017.
 */
public class Room {

    private int walls;
    private int windows;
    private String floorCovering;
    private String windowTreatments;

    private Chair blueChair;
    private Chair redChair;
    private Couch bigCouch;
    private HomeTheater sonyHomeTheater;

    public Room(int walls, int windows, String floorCovering, String windowTreatments, Chair blueChair, Chair redChair, Couch bigCouch, HomeTheater sonyHomeTheater) {
        this.walls = walls;
        this.windows = windows;
        this.floorCovering = floorCovering;
        this.windowTreatments = windowTreatments;
        this.blueChair = blueChair;
        this.redChair = redChair;
        this.bigCouch = bigCouch;
        this.sonyHomeTheater = sonyHomeTheater;
    }

    public void turnLightsOn() {

        System.out.println("Lights are on.");
    }

    public void turnLightsOff() {

        System.out.println("Turning lights off.");
    }

    public void dimLights() {

        System.out.println("Dimming lights...");
    }

    public int getWalls() {
        return walls;
    }

    public int getWindows() {
        return windows;
    }

    public String getFloorCovering() {
        return floorCovering;
    }

    public String getWindowTreatments() {
        return windowTreatments;
    }

    public Chair getBlueChair() {
        return blueChair;
    }

    public Chair getRedChair() {
        return redChair;
    }

    public Couch getBigCouch() {
        return bigCouch;
    }

    public HomeTheater getSonyHomeTheater() {
        return sonyHomeTheater;
    }
}
