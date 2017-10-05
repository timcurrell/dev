/**
 * Created by Tim on 8/5/2017.
 */
public class HDTV {

    private String brand;
    private Resolution hdtvResolution;
    private boolean hasCurvedScreen;

    public HDTV(String brand, Resolution hdtvResolution, boolean hasCurvedScreen) {
        this.brand = brand;
        this.hdtvResolution = hdtvResolution;
        this.hasCurvedScreen = hasCurvedScreen;
    }

    public void turnOn() {

        System.out.println("HDTV -- Powering up...");
    }

    public void turnOff() {

        System.out.println("HDTV -- Powering down...");
    }

}
