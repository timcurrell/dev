/**
 * Created by Tim on 8/5/2017.
 */
public class Electronics {

    private String elecType;
    private String make;
    private boolean isOn = false;

    public Electronics(String elecType, String make) {
        this.elecType = elecType;
        this.make = make;
    }


    public void turnOn() {

        System.out.println("Powering up...");
    }

    public void turnOff() {

        System.out.println("Powering down...");
    }

    public String getElecType() {
        return elecType;
    }

    public String getMake() {
        return make;
    }

    public boolean isOn() {
        return isOn;
    }
}
