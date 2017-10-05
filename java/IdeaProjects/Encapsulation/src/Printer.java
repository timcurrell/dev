/**
 * Created by Tim on 8/6/2017.
 */
public class Printer {

    private String name;
    private int paperCapacity = 500;
    private int paperRemaining;
    private double pctTonerRemaining = 100;
    private int pageCount = 0;
    private boolean isDuplex;

    public Printer(String name, int paperRemaining, boolean isDuplex) {

        // We will leave default values for paper capacity, toner, and page count
        this.name = name;
        this.paperRemaining = paperRemaining;
        this.isDuplex = isDuplex;
    }

    public void receivePrintJob(String senderName, int pages) {

        System.out.println("Print job for " + senderName + " accepted. Working...");
        for(int x = pages; x != 0; x--)
            if(paperRemaining < 1){
                System.out.println("Paper tray empty, must refill paper.");
                break;
            } else {
                printPage();
            }
        System.out.println("Print job complete");
    }

    private void printPage() {          // This method is private; a print job must
                                        // be submitted to have a page printed.
        pageCount += 1;
        paperRemaining -= 1;
        pctTonerRemaining -= 0.15;
    }

    public void addPaper(int paperAdded) {

        System.out.println("Printer paused -- paper tray open...");
        paperRemaining += paperAdded;
        if(paperRemaining > paperCapacity) {
            System.out.println("Paper tray over capacity. Removing excess, paper tray is full");
            paperRemaining = 500;
        } else {
            System.out.println("Paper added. Please close tray and press green 'Reset' button.");
        }
    }

    public void addToner(int tonerAdded) {

        System.out.println("Printer paused -- maintenance door ajar...");
        pctTonerRemaining += (tonerAdded * 10);
        if(pctTonerRemaining > 100) {
            System.out.println("Toner capacity warning -- will fill to 100% to ensure proper operation.");
            pctTonerRemaining = 100;
        } else {
            System.out.println(tonerAdded + " ounces of toner added. Toner level at " + pctTonerRemaining + " percent.");
        }
    }

    public void printerStatus() {

        System.out.println("Printer " + name + " is idle.");
        System.out.println("Printer " + name + " has printed " + pageCount + " pages.");
        System.out.println("Printer " + name + " has " + getPaperRemaining() + " sheets of paper in the tray.");
        if(getPaperRemaining() < 50) {
            System.out.println("Paper will need to be refilled soon.");
        }
        System.out.format("Printer " + name + " has %.3f percent toner remaining.", pctTonerRemaining);
        System.out.println("");
        if(getPctTonerRemaining() < 15) {
            System.out.println("Toner will need to be filled soon.");
        }
    }

    public String getName() {
        return name;
    }

    public int getPaperCapacity() {
        return paperCapacity;
    }

    public int getPaperRemaining() {
        return paperRemaining;
    }

    public double getPctTonerRemaining() {
        return pctTonerRemaining;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
