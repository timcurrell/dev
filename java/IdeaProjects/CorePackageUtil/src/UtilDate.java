import java.util.*;

public class UtilDate {

    public static void main(String[] args) {

        // The Date class provides methods for comparing and manipulating date
        // and time objects in a java program.

        Date nowDate = new Date();
        nowDate.getTime();
        Date myDate = new Date(1500000000000L);
        System.out.println(nowDate);
        System.out.println(myDate);


        // The after(Date when) and before(Date when) methods return a boolean
        // value depending on whether the given date is before or after the
        // parameter date.

        boolean isBefore = nowDate.before(myDate);
        boolean isAfter = nowDate.after(myDate);
        System.out.println("Is nowDate before myDate? " + isBefore);
        System.out.println("Is nowDate after myDate? " + isAfter);


        // The compareTo(Date anotherDate) returns an integer value representing
        // the difference between the two dates for comparison purposes. Return
        // values are 1, 0, and -1.

        System.out.println("NowDate compared to MyDate: " + nowDate.compareTo(myDate));
        System.out.println("MyDate compared to NowDate: " + myDate.compareTo(nowDate));


        // The setTime(long time) method sets the Date object to represent
        // a point in time representing the number of milliseconds after Epoch.

        System.out.println("Prior to change: " + myDate);
        myDate.setTime(1500500000000L);
        System.out.println("After change: " + myDate);


        // And finally, the toString() method converts the date object to
        // a String object.

        String dateString = myDate.toString();
        System.out.println(dateString);
        System.out.println(dateString.toLowerCase());

    }

}
