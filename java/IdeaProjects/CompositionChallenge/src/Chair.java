/**
 * Created by Tim on 8/5/2017.
 */
public class Chair extends Furniture {

    private String color;
    private boolean isComfy;
    private boolean isUpholstered;
    private boolean doesRecline;

    public Chair(String furnitureFinish, String furnitureSize, String color, boolean isComfy, boolean isUpholstered, boolean doesRecline) {
        super("Seating", furnitureFinish, furnitureSize);
        this.color = color;
        this.isComfy = isComfy;
        this.isUpholstered = isUpholstered;
        this.doesRecline = doesRecline;
    }

    public String getColor() {
        return color;
    }

    public boolean isComfy() {
        return isComfy;
    }

    public boolean isUpholstered() {
        return isUpholstered;
    }

    public boolean isDoesRecline() {
        return doesRecline;
    }

}
