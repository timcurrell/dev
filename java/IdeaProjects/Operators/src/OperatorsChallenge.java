/**
 * Created by Tim on 7/13/2017.
 */

// Java summary of operators: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
// Java operator precedence table: http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

public class OperatorsChallenge {

    public static void main(String[] args){

        // Challenge for Operators Unit
        //
        // 1. Create a double variable with the value of 20
        // 2. Create a second double variable with the value of 80
        // 3. Add both numbers together and multiply by 25
        // 4. Use the remainder operator to determine the remainder when #3 is divided by 40
        // 5. Write an "if" statement that displays the message "Total was over the limit"
        //       if the remainder (from #4) is equal to 20 or less

        double firstNum = 20d;
        double secondNum = 80d;
        double thirdNum = 0;

        thirdNum = (firstNum + secondNum) * 25;

        thirdNum %= 40;

        if(thirdNum <= 20)
            System.out.println("Total was over the limit.");
    }
}
