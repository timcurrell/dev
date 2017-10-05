/**
 * Created by Tim on 8/5/2017.
 */
public class BluRay {

    private String brand;
    private int lasers;
    private int discsInTray;

    public BluRay(String brand, int lasers, int discsInTray) {
        this.brand= brand;
        this.lasers = lasers;
        this.discsInTray = discsInTray;
    }

    public void turnOn() {

        System.out.println("BluRay -- Powering up...");
    }

    public void turnOff() {

        System.out.println("BluRay -- Powering down...");
    }

    public void showMovie(String title) {

        System.out.println("Starting movie '" + title + "'...");
    }

}
