<!DOCTYPE html>
<html>
    <body>

        <h2>Functions</h2>

            <?php 

                // PHP allows the user to define their own functions.
                // A function is a named block of statements that can be 
                // executed on command. The block will not execute when 
                // the page loads. It is defined with th e'function' 
                // keyword 

                function writeMsg() {
                    echo "Conjunction Junction, what's your function? <br>";
                }

                writeMsg();         // Calling the function 

                // Functions can accept parameters similar to how it works 
                // in java. 

                function familyName($fname, $year) {
                    echo "$fname Sutter, born in $year. <br>";
                }

                familyName("Darryl", "1958");
                familyName("Brent", "1962");
                familyName("Brian", "1956");
                familyName("Duane", "1960");
                familyName("Gary", "1964");
                familyName("Ron", "1963");
                familyName("Rich", "1963");

                // PHP has a slick feature that allows you to call a 
                // function without passing a parameter. You can set a 
                // default value to replace the parameter when not passed 
                // when the function is called. 

                function mustBeThisTall($height = 64) {
                    echo "You must be $height inches tall to play hockey today. <br>";
                }

                mustBeThisTall(70);
                mustBeThisTall(66);
                mustBeThisTall();

                // PHP also allows you to return values from a function. 
                // This is done using the 'return' keyword. 

                function sum($x, $y) {
                    $z = $x + $y;
                    return $z;
                }

                echo "5 + 10 = " . sum(5, 10) . "<br>";
                echo "7 + 13 = " . sum(7, 13) . "<br>";
                echo "2 + 4 = " . sum(2, 4) . "<br>";

            ?>

    </body>
</html>