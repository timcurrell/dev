import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Java 8 Date Time API - DateTimeFormatter Example
 * @author www.javabeat.net
 */

public class ExploreFormatting {

    public static void main(String[] args) {

        // First we are going to create several DateTimeFormatter objects
        // declaring the format using the standard identifiers listed below:
        //
        // yyyy = 4-digit years             MM = 2-digit numeric months
        // MMM = 3-byte enumerated month    dd = 2-digit days
        // HH = 2-digit hours (24)          hh = 2-digit clock hours (12)
        // mm = 2-digit minutes             ss = 2-digit seconds
        // a = AM/PM designation            z = time zone name
        //
        // It is assumed that anything else in the formatter string is a literal

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss z");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd/MMM/YYYY");
        DateTimeFormatter formatterWithZone = dateTimeFormatter3.withZone(ZoneId.of("America/Los_Angeles"));

        // There are also over a dozen pre-defined formatters based on ISO
        // standards. These range in length, content and complexity.
        //
        // The parse method takes a String object and converts it to a specified
        // object format based on the format string or pre-defined formatter
        // object argument

        LocalTime time = LocalTime.parse("10:15:30", DateTimeFormatter.ISO_TIME);
        LocalDate date = LocalDate.parse("2015-04-10", DateTimeFormatter.ISO_DATE);

        // There is a fair bit of functionality surrounding time zones.

        ZoneId getZoneMethod = formatterWithZone.getZone();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        String formatter1 = dateTimeFormatter1.format(zonedDateTime);
        String formatter2 = dateTimeFormatter2.format(zonedDateTime);
        String formatter3 = dateTimeFormatter3.format(zonedDateTime);
        String formatterWithZoneStr = formatterWithZone.format(zonedDateTime);

        // Now we take our dates/times and spit them out in the various
        // formats that we created in the opening lines of the method.

        System.out.println("DateTimeFormatter Example Demo");
        System.out.println("------------------------------");
        System.out.println("DateTimeFormatter 1 : " + formatter1);
        System.out.println("DateTimeFormatter 2 : " + formatter2);
        System.out.println("DateTimeFormatter 3 : " + formatter3);

        System.out.println("DateTimeFormatter with Zone3 : " + formatterWithZoneStr);
        System.out.println("DateTimeFormatter().getZone() : " + getZoneMethod.getId());
        System.out.println("LocalTime.parser - DateTimeFormatter.ISO_TIME : " + time);
        System.out.println("LocalDate.parser - DateTimeFormatter.ISO_TIME : " + date);

    }
}
