import java.util.*;

public class UtilLocale {

    public static void main(String[] args) {

        // The Locale class allows java to identify specific geological, political,
        // or cultural regions. It provides a limited set of fields and a set of
        // methods to provide that information.

        Locale myLocale = new Locale("ENGLISH","US");
        Locale otherLocale = new Locale("SIMPLIFIED CHINESE","CHINA");


        // There are a number of methods to identify the various parameters associated
        // with a given locale. Among them are getCountry(), getDisplayName(),
        // getDisplayCountry(), getISO3Country(), getLanguage(), and getISO3Language().

        System.out.println(myLocale.getDisplayName());
        System.out.println(myLocale.getDisplayCountry());
        System.out.println(myLocale.getISO3Country());
        System.out.println(myLocale.getLanguage());
    }

}
