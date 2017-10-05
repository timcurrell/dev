<!DOCTYPE html>
<html>
    <body>

        <h2>Arrays -- Sorting</h2>

            <?php 

                // There are six functions for sorting the main array types
                // in PHP. There are ascending and descending for indexed 
                // arrays, and ascending and descending for associative 
                // arrays -- one each for sorting by keys and by values.
                // 
                // NOTE: this re-arranges the order of the elements in the 
                // existing array. It does not make a copy. The change is 
                // permanent and irretrievable. 

                $bands = ["Ratt", "Poison", "Rush", "Metallica", "Anthrax", "Cinderella"];

                $cars = ["Ferrari" => "Enzo",
                         "Porsche" => "911",
                         "Jaguar" => "XF",
                         "Acura" => "NSX",
                         "Nissan" => "GT-R",
                         "Mercedes" => "SLC"];

                $arrlength = count($bands);

                for($x = 0; $x < $arrlength; $x++) {
                    echo $bands[$x];
                    echo "<br>";
                }

                echo "================================== <br>";

                sort($bands);

                for($x = 0; $x < $arrlength; $x++) {
                    echo $bands[$x];
                    echo "<br>";
                }

                echo "================================== <br>";

                rsort($bands);

                for($x = 0; $x < $arrlength; $x++) {
                    echo $bands[$x];
                    echo "<br>";
                }

                echo "================================== <br>";

                foreach($cars as $x => $x_value) {
                    echo "Key=" . $x . ", Value=" . $x_value;
                    echo "<br>";
                }

                echo "================================== <br>";

                asort($cars);

                foreach($cars as $x => $x_value) {
                    echo "Key=" . $x . ", Value=" . $x_value;
                    echo "<br>";
                }

                echo "================================== <br>";

                ksort($cars);

                foreach($cars as $x => $x_value) {
                    echo "Key=" . $x . ", Value=" . $x_value;
                    echo "<br>";
                }

                echo "================================== <br>";

                arsort($cars);

                foreach($cars as $x => $x_value) {
                    echo "Key=" . $x . ", Value=" . $x_value;
                    echo "<br>";
                }

                echo "================================== <br>";

                krsort($cars);

                foreach($cars as $x => $x_value) {
                    echo "Key=" . $x . ", Value=" . $x_value;
                    echo "<br>";
                }

            ?>

    </body>
</html>