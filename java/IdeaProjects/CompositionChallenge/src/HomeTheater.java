/**
 * Created by Tim on 8/5/2017.
 */
public class HomeTheater {

    private HDTV myHDTV;
    private SurroundSound mySurroundSound;
    private BluRay myBluRay;

    public HomeTheater(HDTV myHDTV, SurroundSound mySurroundSound, BluRay myBluRay) {
        this.myHDTV = myHDTV;
        this.mySurroundSound = mySurroundSound;
        this.myBluRay = myBluRay;
    }

    public void turnOn() {
        myHDTV.turnOn();
        mySurroundSound.turnOn();
        myBluRay.turnOn();
    }

    public void turnOff() {
        myHDTV.turnOff();
        mySurroundSound.turnOff();
        myBluRay.turnOff();
    }


}
