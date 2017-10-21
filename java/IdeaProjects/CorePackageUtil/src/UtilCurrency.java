import java.util.*;

public class UtilCurrency {

    public static void main(String[] args) {

        // The Currency class uses Locale and the ISO 4217 currency codes
        // to provide the currency codes and symbols for countries and
        // economic regions around the world.

        Currency myCur = Currency.getInstance(Locale.GERMANY);

        System.out.println("Currency code for Germany: " + myCur.getCurrencyCode());
        System.out.println("Currency symbol for Germany: " + myCur.getSymbol());

    }
}
