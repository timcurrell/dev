/**
 * Created by Tim on 8/5/2017.
 */
public class Case {

    private String manufacturer;
    private String model;
    private String powerSupply;
    private String formFactor;
    private Dimensions dimensions;

    public Case(String manufacturer, String model, String powerSupply, String formFactor, Dimensions dimensions) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.powerSupply = powerSupply;
        this.formFactor = formFactor;
        this.dimensions = dimensions;
    }

    public void pressPowerButton() {

        System.out.println("Power button pressed.");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

}
