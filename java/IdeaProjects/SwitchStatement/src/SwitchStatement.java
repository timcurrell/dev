/**
 * Created by Tim on 7/29/2017.
 */
public class SwitchStatement {

    public static void main(String[] args){

        // The important thing to remember about 'switch' statements in java is the
        // 'break' keyword. The break *must* be in place for each case, else the
        // control will fall through and execute any and all statements until it
        // *finds* a break statement to release it from the switch construct.

        int switchValue = 3;

        switch(switchValue) {
            case 1:
                System.out.println("Switch value was 1.");
                break;
            case 2:
                System.out.println("Switch value was 2.");
                break;
            case 3:
                System.out.println("Switch value was 3.");
                break;
            case 4:case 5:case 6:
                System.out.println("Switch value was greater than 3.");
                break;
            default:
                System.out.println("Unable to classify switch value.");
                break;  // technically, this is optional
        }


        // A new feature in Java 7 (and 8, which is current) is the use of a
        // 'switch' statement with Strings. Prior to this only primitive types
        // were permitted.
        // Note also that we are using the toUpperCase() String method in order
        // to ensure that the content, and not the capitalization, is inspected.

        String month = "october";

        switch(month.toUpperCase()) {
            case "JANUARY":case "FEBRUARY":case "MARCH":
                System.out.println("Winter");
                break;
            case "APRIL":case "MAY":case "JUNE":
                System.out.println("Spring");
                break;
            case "JULY":case"AUGUST":case "SEPTEMBER":
                System.out.println("Summer");
                break;
            case "OCTOBER":case "NOVEMBER":case "DECEMBER":
                System.out.println("Fall");
                break;
            default:
                System.out.println("You didn't type a month in correctly.");
                break;
        }
    }
}
