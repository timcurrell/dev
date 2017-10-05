/**
 * Created by Tim on 8/5/2017.
 */
public class SurroundSound {

    private String brand;
    private int speakers;
    private boolean hasSubWoofer;
    private String dolbyVersion;

    public SurroundSound(String brand, int speakers, boolean hasSubWoofer, String dolbyVersion) {
        this.brand = brand;
        this.speakers = speakers;
        this.hasSubWoofer = hasSubWoofer;
        this.dolbyVersion = dolbyVersion;
    }

    public void turnOn() {

        System.out.println("Surround Sound -- Powering up...");
    }

    public void turnOff() {

        System.out.println("Surround Sound -- Powering down...");
    }

}
