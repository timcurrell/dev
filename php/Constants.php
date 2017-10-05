<!DOCTYPE html>
<html>
    <body>

        <h2>Constants</h2>

            <?php 

                // A constant is an identifier for a simple value. The
                // value of a constant cannot be changed during the 
                // execution of the script. Constants are created using 
                // the define() function. 

                define("HOWDY", "Greetings and salutations!");

                // The first parameter is the name of the constant 
                // The second parameter is the value of the constant 
                // There is a third optional parameter which specifies 
                // whether the constant name is case-insensitive. The 
                // default is 'false', meaning that the constant name 
                // IS CASE-SENSITIVE. 

                echo HOWDY . "<br>";

                // All constants are global, and can be accessed from anywhere. 

                function say_howdy() {
                    echo HOWDY . "<br>";
                }

                say_howdy();


            ?>

    </body>
</html>