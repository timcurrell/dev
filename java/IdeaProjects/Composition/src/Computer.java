/**
 * Created by Tim on 8/5/2017.
 */
public class Computer {

    private Case theCase;               // Computer has a Case
    private Monitor monitor;            // Computer has a Monitor
    private MotherBoard motherBoard;    // Computer has a MotherBoard

    public Computer(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    // Now, the fields and methods that are available to the component classes are also
    // available to the owning class.

    public void powerUp() {             // Calls 3 methods: one internal, one in
                                        // theCase class, one in motherBoard class
        theCase.pressPowerButton();
        drawLogo();
        motherBoard.loadProgram("Windows 7 Enterprise");
    }

    private void drawLogo() {           // Calls a method in the monitor class

        // insert fancy graphics here
        monitor.drawPixelAt(400, 400, "Green");
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
}
