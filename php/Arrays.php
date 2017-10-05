<!DOCTYPE html>
<html>
    <body>

        <h2>Arrays</h2>

            <?php 

                // Arrays are handled in a more clunky and explicit way 
                // in PHP. You declare them using the array() function. 
                // There are three types of arrays: indexed, associative, 
                // and multi-dimensional. 

                // An indexed array is much like an array in java, where 
                // the elements are referenced by position in the array 
                // using the index inside square brackets. 


                $cars = array("Volvo", "BMW", "Toyota");
                echo "I like " . $cars[0] . ", " . $cars[1] . " and " . $cars[2] . ". <br>";

                $arrlength = count($cars);        // obtains length of array 

                for($x = 0; $x < $arrlength; $x++) {
                    echo $cars[$x];
                    echo "<br>";
                }

                // An associative array is a fancy way of saying key-value 
                // pairs. Assignment of key to value is done using '=>'. 
    
                $age = array("Peter"=>"35", "Ben"=>"37", "Joe"=>"43");

                // The elements are then accessed using their keys inside of 
                // square brackets. 

                echo "Peter is " . $age['Peter'] . " years old. <br>";

                // An associative array doesn't necessarily have to use the 
                // array function to be declared. It can be done manually. 

                $coach['Blackhawks'] = "Quenneville";
                $coach['Canadiens'] = "Julien";
                $coach['Maple Leafs'] = "Babcock";

                // Looping through an associative array is then somewhat 
                // complicated. Note the specific syntax with '=>'.

                foreach($coach as $x => $x_value) {
                    echo "Key=" . $x . ", Value=" . $x_value;
                    echo "<br>";
                }

                // A multi-dimensional array is declared as arrays as the 
                // elements of a parent array. More information can be 
                // obtained here: 
                // https://www.w3schools.com/php/php_arrays_multi.asp

            ?>

    </body>
</html>