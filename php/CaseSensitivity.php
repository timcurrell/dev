<!DOCTYPE html>
<html>
    <body>

        <h2>Case Sensitivity</h2>

            <?php 

                // In PHP, all keywords (e.g. if, else, while, echo, etc.), 
                // classes, functions, and user-defined functions are NOT 
                // case-sensitive. In the example below, all three echo 
                // statements below are legal (and equal): 

                ECHO "Hello World!<br>";
                echo "Hello World!<br>";
                EcHo "Hello World!<br>";

                // However; all variable names are case-sensitive. In the 
                // example below, only the first statement will display the 
                // value of the $color variable (this is because $color, 
                // $COLOR, and $coLOR are treated as three different variables):

                $color = "red";

                echo "My car is " . $color . "<br>";
                echo "My house is " . $COLOR . "<br>";
                echo "My boat is " . $coLOR . "<br>";

            ?>

    </body>
</html>