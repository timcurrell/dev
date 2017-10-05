<!DOCTYPE html>
<html>
    <body>

        <h2>Loops</h2>

            <?php 

                // There are four kinds of loops in PHP: while, do-while, 
                // for, and foreach. Syntax for each is similar to the same 
                // loop in java or python. 

                // The while loop executes a block of code as long as the 
                // condition is true. 

                $x = 1; 
                
                echo "This is the while loop. <br>";
                while($x <= 9) {
                    echo "The number is: $x <br>";
                    $x++;
                }

                // The do-while loop always executes the first iteration of 
                // the loop, then otherwise operates the same as the while loop. 

                echo "This is the do-while loop. <br>";
                do {
                    echo "The number is: $x <br>";
                    $x--;
                } while ($x >= 0);

                // The for loop has exactly the same syntax as in java. 

                echo "This is the for loop. <br>";
                for($i = 0; $i <= 10; $i++) {
                    echo "The number is: $i <br>";
                }

                // The foreach loop is used to iterate through the elements 
                // in an array. 

                $colors = array("red", "green", "blue", "yellow"); 

                foreach($colors as $value) {
                    echo "$value <br>";
                }

                // The $value is a placeholder that is assigned each value in 
                // the array one by one. You can then use that placeholder to 
                // display or manipulate the value. 

            ?>

    </body>
</html>