/**
 * Created by Tim on 8/5/2017.
 */
public class MotherBoard {

    private String manufacturer;
    private String model;
    private int ramSlots;
    private int cardSlots;
    private String biosName;

    public MotherBoard(String manufacturer, String model, int ramSlots, int cardSlots, String biosName) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.biosName = biosName;
    }

    public void loadProgram(String programName) {

        System.out.println("Program " + programName + " loading...");
        System.out.println("Program load complete.");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBiosName() {
        return biosName;
    }
}
