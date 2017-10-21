import java.util.*;

public class UtilCalendar {

    public static void main(String[] args) {

        // The Calendar class contains dozens of fields and methods for the
        // declaration, management, and manipulation of day/time operations
        // in the java language. The lists are too long to cover everthing
        // in this class.

        // The most common actions a java program will be taking with Calendars
        // is getting and setting. There are numerous methods to accomplish
        // these tasks.

        // The getInstance() method generates a Calendar object with the current
        // Locale and TimeZone.

        Calendar cal = Calendar.getInstance();

        // The get(int field) method returns the integer value of the field
        // specified.

        System.out.println("Calendar's Year: " + cal.get(Calendar.YEAR));
        System.out.println("Calendar's Month: " + cal.get(Calendar.MONTH));
        System.out.println("Calendar's Day: " + cal.get(Calendar.DATE));


        // The getTime() method returns a date object calculating the current
        // time in milliseconds from Epoch.

        System.out.println("Current Time: " + cal.getTime());


        // The setTime(Date date) method allows you to set the date and time
        // of the Calendar.

        Date date = new Date(89, 9, 30);
        cal.setTime(date);
        System.out.println("After setting Time:  " + cal.getTime());
    }

}
