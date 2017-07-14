/**
 * Created by Tim on 6/28/2017.
 */
public class Main {

    public static void main(String[] args) {

        String firstString = "This is a string";
        System.out.println( "firstString is equal to " + firstString);
        firstString = firstString + ", and it gets even longer!";
        System.out.println( "firstString is equal to " + firstString);
        firstString = firstString + " \u00A9 2017";
        System.out.println( "firstString is equal to " + firstString);

        String numberString = "250.55";
        numberString = numberString + "49.45";
        System.out.println("The result is " + numberString);
        System.out.println("It looks like that because Java does not recognize the numerals as having quantitative value.");

        double firstValue = 250.55;
        double nextValue = 49.45;
        double totalValue = firstValue + nextValue;
        System.out.println("The result is " + totalValue);

        String lastString = "10";
        int firstInt = 50;
        lastString = lastString + firstInt;
        System.out.println("The result is " + lastString);
        System.out.println("Java converts the integer to a string to perform the append to the existing string.");
        System.out.println("It will do the same thing for other numeric data types.");
    }
}
