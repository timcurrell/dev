<!DOCTYPE html>
<html>
    <body>

        <h2>If Then Else Statements</h2>

            <?php 

                // The if-then-else syntax for PHP is like most other 
                // programming languages. They do allow for the 'elseif'
                // keyword. Notice that they include the 'e' (not 'elsif').

                $time = date("H");

                if ($time < "20") {
                    echo "Have a good day!<br>";
                }

                if ($time < "20") {
                    echo "Have a good day!<br>";
                } else {
                    echo "Have a good night!<br>";
                }

                if ($time < "10") {
                    echo "Have a good morning!";
                } elseif ($time < "20") {
                    echo "Have a good afternoon!";
                } else {
                    echo "Have a good night!";
                }
            ?>

    </body>
</html>