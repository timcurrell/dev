/**
 * Created by Tim on 9/3/2017.
 */
public class Hamburger {

    private String bun;
    private String meat;
    private double price;

    public Hamburger(String bun, String meat, double price) {
        this.bun = bun;
        this.meat = meat;
        this.price = price;
    }

    public String getBun() {
        return bun;
    }

    public void setBun(String bun) {
        this.bun = bun;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
