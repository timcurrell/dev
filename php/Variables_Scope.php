<!DOCTYPE html>
<html>
    <body>

        <h2>Variables - Scope</h2>

            <?php 

                // Scope rules for PHP are generally the same as for 
                // Java or Python. However there is an exception. 

                $x = 5;    // global scope
                $y = 10;   // global scope

                function firstTest() {
                    // using x inside this function will generate an error
                    echo "<p>Variable x inside function is: $x</p>";
                } 

                firstTest();

                echo "<p>Variable x outside function is: $x</p>";

                function secondTest() {
                    $z = 5; // local scope
                    echo "<p>Variable z inside function is: $z</p>";
                } 

                secondTest();

                // using z outside the function will generate an error
                echo "<p>Variable z outside function is: $z</p>";

                // You can "bring in" global variables inside of a function 
                // by "re-declaring" them with the 'global' keyword.

                function thirdTest() {   
                    global $x, $y;
                    $y = $x + $y;
                }

                thirdTest();

                echo $y;
    
            ?>

    </body>
</html>