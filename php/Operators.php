<!DOCTYPE html>
<html>
    <body>

        <h2>Operators</h2>

            <?php 

                $a = 1;
                $b = 2;
                $c = $a + $b;
                $d = $b + $c;
                $e = $c + $d;
                $f = $d + $e;

                // The arithmetic operators in PHP are 
                // +    Addition            /    Division 
                // -    Subtraction         %    Modulus 
                // *    Multiplication      **   Exponentiation 

                echo $c + $f . "<br>";
                echo $f - $c . "<br>";
                echo $e * $d . "<br>";
                echo $e / $b . "<br>";
                echo $d % $c . "<br>";
                echo $b ** $f . "<br>";

                // The assignment operators in PHP are 
                // =    Assign              +=    Add & assign
                // -=   Subtract & assign   *=    Multiply & assign 
                // /=   Divide & assign     %=    Modulus & assign 

                $g = 21;
                $h = 23;
                $i = 25;
                $j = 27;
                $k = 29;

                $g += $a;
                $h -= $b;
                $i *= $c;
                $j /= $d;
                $k %= $e;

                echo $g . " " . $h . " " . $i . " " . $j . " " . $k . "<br>";

                // The comparison operators in PHP are 
                // ==    Equal             !=    Not equal (<> also allowed)
                // ===   Identical         !==   Not identical 
                // >     Greater than      >=    Greater than or equal to 
                // <     Less than         <=    Less than or equal to 

                if ($g == 22) { 
                    echo "g is equal to 22.<br>"; 
                } else {
                    echo "g is not equal to 22.<br>";
                }

                if ($h === "21") { 
                    echo "h is identical to 21.<br>"; 
                } else {
                    echo "h is not identical to 21.<br>";
                }

                if ($i > $k) { echo "i is greater than k.<br>"; } 

                if ($j < $e) { echo "j is less than e.<br>"; }

                // Increment and decrement operators perform the same as in
                // other programming languages. ++ and -- placed before the 
                // variable will perform their operations before execution of 
                // the statement; placed after, they will perform the operation 
                // after execution of the statement.

                echo $a++ . "<br>";
                echo $a++ . "<br>";
                echo $a++ . "<br>";
                echo ++$a . "<br>";
                echo ++$a . "<br>";
                echo ++$a . "<br>";
                echo $a++ . "<br>";
                echo $a . "<br>";

            ?>

    </body>
</html>