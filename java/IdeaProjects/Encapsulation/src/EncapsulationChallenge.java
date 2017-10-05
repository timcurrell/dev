/**
 * Created by Tim on 8/6/2017.
 */
public class EncapsulationChallenge {

    // Create a class called Printer in which you demonstrate proper encapsulation
    // techniques. It will simulate a real computer printer.
    // It should have fields for toner level, paper level, page count, and indicate
    // whether it is a duplex printer.
    // Add methods to fill up the toner (up to a maximum of 100%), another method
    // to simulate printing a page (which increases the page count).
    // Decide on the scope, whether to use constructors, and anything else you
    // think is needed.

    public static void main(String[] args) {

        Printer HPOfficeJet = new Printer("HP_OJ_01", 400, false);

        HPOfficeJet.receivePrintJob("Dave", 30);

        HPOfficeJet.receivePrintJob("Denise", 40);

        HPOfficeJet.receivePrintJob("Mike", 20);

        HPOfficeJet.printerStatus();

        HPOfficeJet.receivePrintJob("Teju", 80);

        HPOfficeJet.receivePrintJob("Tim", 5);

        HPOfficeJet.receivePrintJob("Kateri", 3);

        HPOfficeJet.printerStatus();

        HPOfficeJet.receivePrintJob("Rebecca", 40);

        HPOfficeJet.receivePrintJob("Deepa", 25);

        HPOfficeJet.receivePrintJob("Tara", 70);

        HPOfficeJet.printerStatus();

        HPOfficeJet.addPaper(200);

        HPOfficeJet.addToner(6);

        HPOfficeJet.printerStatus();


    }
}
