/**
 * Created by Tim on 7/28/2017.
 */
public class MethodOverloadingChallenge {

    // Create a method called calcFeetAndInchesToCentimeters
    // It needs to have two parameters: feet, and inches.
    //
    // You should validate that the first parameter (feet) is >= 0
    // You should validate that the second parameter (inches) is >= 0 and <= 12
    // Return -1 from the method if either of the above is not true.
    //
    // If the parameters are valid, then calculate how many centimeters comprise
    // the feet and inches passed to this method and return that value.
    //
    // Create a second method with the same name, but with only one parameter:
    // inches. Validate that the value is > 0, and return -1 if it is not.
    //
    // If the parameter is valid, then convert the number of inches into
    // FEET AND INCHES, and call the first method from the second method
    // passing the correct feet and inches value.
    //
    // HINT: Use 'double' data types, this allows for proper calculation.
    //
    // 1 inch = 2.54cm, and of course 1 foot = 12 inches.
    // Validate your calculations on the web.


    public static void main(String[] args) {

        double feetAndInches = calcFeetAndInchesToCentimers(6, 0);
        if (feetAndInches == -1)
            System.out.println("Incorrect input, please try again.");
        else
            System.out.println("The converted value is " + feetAndInches + " centimeters.");


        double justInches = calcFeetAndInchesToCentimers(12);
        if (justInches == -1)
            System.out.println("Incorrect input, please try again.");
        else
            System.out.println("The converted value is " + justInches + " centimeters.");
    }


    public static double calcFeetAndInchesToCentimers(double pFeet, double pInches) {

        if(pFeet < 0)
            return -1;
        if(pInches < 0)
            return -1;
        if(pInches >= 12)
            return -1;

        double totalInches = (pFeet * 12) + pInches;
        return totalInches * 2.54;
    }


    public static double calcFeetAndInchesToCentimers(double pInches) {

        if(pInches < 0)
            return -1;

        if(pInches < 12)
            return calcFeetAndInchesToCentimers(0,pInches);
        else {
            int locFeet = (int)pInches / 12;
            double locInches = pInches % 12;
            return calcFeetAndInchesToCentimers((double)locFeet, locInches);
        }

    }
}
