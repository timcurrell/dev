import java.time.LocalTime;

// Make note: all of the fields, methods, and enumerations for
// this class are also present in the LocalDateTime class.

public class ExploreLocalTime {

    public static void main(String args[]){

        ExploreLocalTime java8timestuff = new ExploreLocalTime();
        java8timestuff.localTimeStuff();
    }


    public void localTimeStuff() {

        // Creating and printing a variable with the current time
        LocalTime rightNow = LocalTime.now();

        System.out.println("The current time is " + rightNow);

        // The toString method returns the time value as a string.
        // The String is in the standard format used by java.

        String timeString = rightNow.toString();

        System.out.println("The date as a string appears as " + timeString);

        // Individual components of the time can be fetched with
        // several get- methods. These are returned as integers.

        int rightNowHour = rightNow.getHour();
        int rightNowMinute = rightNow.getMinute();
        int rightNowSecond = rightNow.getSecond();
        int rightNowNano = rightNow.getNano();

        System.out.println("Each numeric value in the time:");
        System.out.println("Hour is " + rightNowHour);
        System.out.println("Minutes are " + rightNowMinute);
        System.out.println("Seconds are " + rightNowSecond);
        System.out.println("Nanoseconds are " + rightNowNano);

        // Computations can be executed against the time with
        // built-in methods.

        LocalTime plusOneHour = rightNow.plusHours(1);
        LocalTime minusTwoMinutes = rightNow.minusMinutes(2);
        LocalTime plusTenSeconds = rightNow.plusSeconds(10);
        LocalTime minus5555Nanos = rightNow.minusNanos(5555);

        System.out.println("Adding one hour results in " + plusOneHour);
        System.out.println("Subtracting two minutes results in " + minusTwoMinutes);
        System.out.println("Adding ten seconds results in " + plusTenSeconds);
        System.out.println("Subtracting 5,555 nanoseconds results in " + minus5555Nanos);

        // You can also perform boolean checks against times in
        // the future or past. Note that, without formatting,
        // the hours must be designated in military (HH24) time.

        LocalTime breakfast = LocalTime.of(7, 30, 45);
        LocalTime lunch = LocalTime.of(12, 30);
        LocalTime dinner = LocalTime.of(18, 00);

        boolean afterBreakfast = rightNow.isAfter(breakfast);
        boolean afterLunch = rightNow.isAfter(lunch);
        boolean afterDinner = rightNow.isAfter(dinner);

        System.out.println("Is it after breakfast? " + afterBreakfast);
        System.out.println("Is it after lunch? " + afterLunch);
        System.out.println("Is it after dinner? " + afterDinner);

    }

}
