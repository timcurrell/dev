/**
 * Created by Tim on 8/5/2017.
 */
public class Monitor {

    private String manufacturer;
    private String model;
    private int sizeInInches;
    private Resolution nativeResolution;        // The monitor HAS A resolution

    public Monitor(String manufacturer, String model, int sizeInInches, Resolution nativeResolution) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.sizeInInches = sizeInInches;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {

        System.out.println("Drawing pixel at " + x + "," + y + " in " + color);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getSizeInInches() {
        return sizeInInches;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

}
