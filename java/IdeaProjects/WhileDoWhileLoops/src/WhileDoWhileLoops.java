/**
 * Created by Tim on 7/29/2017.
 */
public class WhileDoWhileLoops {

    public static void main(String[] args) {


        // The 'while' loop is similar to the 'for' loop, except it requires that
        // the programmer take responsibility for achieving the exit condition
        // within the loop statements.

        int count = 1;
        while(count != 6){
            System.out.println("Count value is " + count++);
        }


        // There are a few situations when the construct below is handy, and in fact
        // necessary. But as a rule, don't use it. The risk of an infinite loop is
        // very high.

        count = 1;
        while(true){
            if(count == 6) break;
            System.out.println("Count value is " + count++);
        }


        // The 'do-while' loop puts the condition at the end of the loop structure,
        // ensuring that the loop statements are executed at least once. Otherwise
        // there are no differences.

        count = 1;
        do{
            System.out.println("Count value is " + count++);
        } while(count < 6);
    }
}
