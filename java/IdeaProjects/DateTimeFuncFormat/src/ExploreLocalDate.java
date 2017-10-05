import java.time.LocalDate;

// Make note: all of the fields, methods, and enumerations for
// this class are also present in the LocalDateTime class.

public class ExploreLocalDate {

    public static void main(String args[]){

        ExploreLocalDate java8datestuff = new ExploreLocalDate();
        java8datestuff.localDateStuff();
    }


    public void localDateStuff() {

        // Creating and printing a variable with the current date
        LocalDate rightNow = LocalDate.now();

        System.out.println("Today's Date is " + rightNow);

        // The toString method returns the date value as a string.
        // The String is in the standard format used by java.

        String dateString = rightNow.toString();

        System.out.println("The date as a string appears as " + dateString);

        // Individual components of the date can be fetched with
        // several get- methods. These are returned as integers.
        // There are also get- methods to return enumerated (named)
        // types for month and day of the week.

        int rightNowDate = rightNow.getDayOfMonth();
        int rightNowMonth = rightNow.getMonthValue();
        int rightNowYear = rightNow.getYear();

        System.out.println("Each numeric value in the date:");
        System.out.println("Date is " + rightNowDate);
        System.out.println("Month is " + rightNowMonth);
        System.out.println("Year is " + rightNowYear);

        // Computations can be executed against the date with
        // built-in methods. Note that it can calculate weeks!

        LocalDate plusOneDay = rightNow.plusDays(1);
        LocalDate minusTwoMonths = rightNow.minusMonths(2);
        LocalDate plusTenYears = rightNow.plusYears(10);
        LocalDate minusSixWeeks = rightNow.minusWeeks(6);

        System.out.println("Adding one day results in " + plusOneDay);
        System.out.println("Subtracting two months results in " + minusTwoMonths);
        System.out.println("Adding ten years results in " + plusTenYears);
        System.out.println("Subtracting six weeks results in " + minusSixWeeks);

        // You can also perform boolean checks against dates in
        // the future or past.

        LocalDate christmas = LocalDate.of(2017, 12, 25);
        LocalDate easter = LocalDate.of(2017, 4, 10);
        LocalDate halloween = LocalDate.of(2017, 10, 31);

        boolean beforeChristmas = rightNow.isBefore(christmas);
        boolean afterEaster = rightNow.isAfter(easter);
        boolean afterHalloween = rightNow.isAfter(halloween);

        System.out.println("Is today before Christmas? " + beforeChristmas);
        System.out.println("Is today after Easter? " + afterEaster);
        System.out.println("Is today after Halloween? " + afterHalloween);

    }
}
