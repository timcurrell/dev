/**
 * Created by Tim on 7/13/2017.
 */
public class OperatorsLogicalTernary {

    public static void main(String[] args){

        // The logical AND in Java is '&&'
        // Its use is the same as in other languages

        boolean isCanadian = true;
        boolean isHockeyPlayer = true;
        boolean isWhiner = false;

        if(isCanadian && isHockeyPlayer)
            System.out.println("The individual in question may be Jonathan Toews.");

        if(isHockeyPlayer && isWhiner)
            System.out.println("The individual in question is not Sidney Crosby.");

        if(isCanadian && isWhiner)
            System.out.println("The individual in question is not Patrick Kane.");


        // The logical OR in Java is '||'
        // Its use is the same as in other languages

        boolean isTall = true;
        boolean isHeavy = false;
        boolean isSmart = true;

        boolean billNye = (isTall || isSmart);
        boolean meatLoaf = (isTall || isHeavy);
        boolean deanKamen = (isHeavy || isSmart);

        System.out.println(billNye + " " + meatLoaf + " " + deanKamen);


        // You can use a single operator when checking a boolean value condition

        boolean isWet = true;
        if(isWet)
            System.out.println("Dry him off!");


        // The ternary shorthand operator can be used as a simple one-statement if-then-else block
        // The syntax is 'condition ? do this if true : do this if false'

        boolean isSexy = true;

        boolean myWife = isSexy ? true : false;
        System.out.println("Is my wife sexy? Absolutely " + myWife + "!");

    }
}
