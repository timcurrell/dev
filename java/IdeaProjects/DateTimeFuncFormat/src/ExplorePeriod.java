import java.time.LocalDate;
import java.time.Period;

// The Period class differs from the Duration class in that it deals
// exclusively with periods lasting 0 to many days. Time calculations
// can be performed in the Duration class; not in the Period class.

public class ExplorePeriod {

    public static void main(String[] args) {

        ExplorePeriod java8duration = new ExplorePeriod();
        java8duration.periodStuff();
    }


    public void periodStuff() {

        // Create a period instance and assign a value to it

        Period thisPeriod = Period.between(LocalDate.now(),
                LocalDate.of(2018, 10, 30));

        System.out.println("The period until my birthday is " + thisPeriod);

        // You can obtain individual components of the duration by using
        // get- methods.

        int thisPeriodYears = thisPeriod.getYears();
        int thisPeriodMonths = thisPeriod.getMonths();
        int thisPeriodDays = thisPeriod.getDays();

        System.out.println("The number of years in this period is " + thisPeriodYears);
        System.out.println("The number of months in this period is " + thisPeriodMonths);
        System.out.println("The number of days in this period is " + thisPeriodDays);

        // Arithmetic operations can be performed on a period using
        // plus- and minus- methods. And as you see, periods can
        // be negative.

        Period perPlusYears = thisPeriod.plusYears(3);
        Period perMinusMonths = thisPeriod.minusMonths(6);
        Period perplusDays = thisPeriod.plusDays(90);

        System.out.println("This period plus 3 years is " + perPlusYears);
        System.out.println("This period minus 6 months is " + perMinusMonths);
        System.out.println("This period plus 90 days is " + perplusDays);

    }
}
