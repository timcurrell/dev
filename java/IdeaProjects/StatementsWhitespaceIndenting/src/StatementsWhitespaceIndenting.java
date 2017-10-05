/**
 * Created by Tim on 7/16/2017.
 */
public class StatementsWhitespaceIndenting {

    public static void main(String[] args) {

        // The entire line below -- reserved word and following expression -- is a statement:

        int myVariable = 50;


        // Basically, any complete "phrase" in Java -- ending with a semicolon -- is a statement.

        myVariable++;

        System.out.println("This is a statement too.");

        if(myVariable < 100)
            System.out.println("This entire two-line grouping is another statement.");


        // Multiple statements can be written on the same line, though it is not considered good form:

        int thisVar = 5; String thatVar = "Nasty hobbitses..."; System.out.println(thatVar);


        // Whitespace is (generally) ignored in Java. Whether you have 1 space or 5000 spaces,
        // Java doesn't care. What it does care about is separating things like keywords and
        // labels -- for the most part, there must be at least one space between alphanumeric
        // entities.

        int theOtherVar=99;                     // Legal
        int       anotherVar   =   100;         // Legal
        intyetAnotherVar=101;                   // Not legal, space needed between 'int' & variable name


        // Again, generally speaking, spaces are optional between operands and operators.

        int firstNum=(234+567);               // Legal
        int secondNum  = (  890   +   123  ); // Legal


        // Indentation is something that you use to make your code more readable, and assist others
        // in deciphering the flow of the program. Review your company's style guide or coding
        // standards and ensure that you are following procedures.

        // Most IDE's do the indentation for you, and there are "reformat" options in the IDE's
        // themselves to set things straight if you mess up.

    }
}
