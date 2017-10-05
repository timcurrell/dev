<!DOCTYPE html>
<html>
    <body>

        <h2>Switch/Case Statement</h2>

            <?php 

                // PHP does allow for a switch/case statement. The syntax 
                // does require the 'break' keyword after each case is complete, 
                // and it does allow for a default case. 

//                $favcolor = "red";
//                $favcolor = "blue";
//                $favcolor = "green";
                $favcolor = "yellow";

                switch ($favcolor) {
                    case "red":
                        echo "Your favorite color is red!";
                        break;
                    case "blue":
                        echo "Your favorite color is blue!";
                        break;
                    case "green":
                        echo "Your favorite color is green!";
                        break;
                    default:
                        echo "Your favorite color is neither red, blue, nor green!";
                }

            ?>

    </body>
</html>