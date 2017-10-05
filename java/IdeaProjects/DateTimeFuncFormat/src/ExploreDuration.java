import java.time.Duration;

// The Duration class differs from the Period class in that it deals
// exclusively with periods lasting 0 to many hours. HHMMSS calculations
// can be performed in the Duration class; not in the Period class.

public class ExploreDuration {

    public static void main(String[] args) {

        ExploreDuration java8duration = new ExploreDuration();
        java8duration.durationStuff();
    }


    public void durationStuff() {

        // Create a Duration and assign it a value

        Duration thisDuration = Duration.ofDays(4);

        System.out.println("The duration value is " + thisDuration);

        // You can convert the duration to other units using to- and
        // get- methods. They are unit-specific; a unit has either a
        // to- or a get- method.

        long durationInMinutes = thisDuration.toMinutes();
        long durationInSeconds = thisDuration.getSeconds();

        System.out.println("The same duration in minutes is equal to " + durationInMinutes);
        System.out.println("The same duration in seconds is equal to " + durationInSeconds);

        // Arithmetic operations can be performed on a duration using
        // plus- and minus- methods. And as you see, durations can
        // be negative.

        Duration durMinus30Hours =  thisDuration.minusHours(30);
        Duration durPlus101Minutes = thisDuration.plusMinutes(101);
        Duration durMinus5Days = thisDuration.minusDays(5);

        System.out.println("Duration minus 30 hours is " + durMinus30Hours);
        System.out.println("Duration plus 101 minutes is " + durPlus101Minutes);
        System.out.println("Duration minus 5 days is " + durMinus5Days);

    }
}
