/**
 * Created by Tim on 8/5/2017.
 */
public class Couch extends Furniture {

    private String color;
    private int seats;
    private boolean isComfy;

    public Couch(String color, int seats, boolean isComfy) {
        super("Seating", "Cloth", "Large");
        this.color = color;
        this.seats = seats;
        this.isComfy = isComfy;
    }

    public String getColor() {
        return color;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isComfy() {
        return isComfy;
    }

}
