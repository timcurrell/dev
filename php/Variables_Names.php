<!DOCTYPE html>
<html>
    <body>

        <h2>Variables - Names</h2>

            <?php 

                // Variable names start with the dollar sign ('$')

                $text = "This is a variable name.";
                $x = 8;
                $_pi = 3.14159;

                // Variable names (following the $) must start with
                // either a letter or an underscore, and the name can 
                // contain any alphanumeric character plus underscores. 

                $Schmeezle67 = "";
                $LOUDNOISES = "Brick Tamland";
                $_12Monkeys = "Brad Pitt";

                // Displaying variables can be done either inside or 
                // outside of quotes. The following two statements produce
                // the same result: 

                echo "My favorite movie character is $LOUDNOISES.";
                echo "My favorite movie character is " + $LOUDNOISES + ".";

            ?>

    </body>
</html>