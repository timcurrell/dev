/**
 * Created by Tim on 8/5/2017.
 */
public class Furniture {

    private String furnitureType;
    private String furnitureFinish;
    private String furnitureSize;

    public Furniture(String furnitureType, String furnitureFinish, String furnitureSize) {
        this.furnitureType = furnitureType;
        this.furnitureFinish = furnitureFinish;
        this.furnitureSize = furnitureSize;
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public String getFurnitureFinish() {
        return furnitureFinish;
    }

    public String getFurnitureSize() {
        return furnitureSize;
    }

}
