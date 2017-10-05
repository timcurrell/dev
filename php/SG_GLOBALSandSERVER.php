<!DOCTYPE html>
<html>
    <body>

        <h2>Superglobals -- $GLOBALS and $_SERVER</h2>

            <?php 

                // Several predefined variables in PHP are "superglobals", 
                // which means that they are always accessible, regardless 
                // of scope - and you can access them from any function, 
                // class or file without having to do anything special.

                // The PHP superglobal variables are:
                // $GLOBALS                $_FILES 
                // $_SERVER                $_ENV 
                // $_REQUEST               $_COOKIE
                // $_POST                  $_SESSION
                // $_GET

                // $GLOBALS is a PHP super global variable which is used
                // to access variables from anywhere in a PHP script. 
                // For reference, PHP stores all global variables in an 
                // array called $GLOBALS[index], with the index holding 
                // the name of the variable. 

                $x = 75; 
                $y = 25;
 
                function addition() { 
                    $GLOBALS['z'] = $GLOBALS['x'] + $GLOBALS['y']; 
                }
 
                addition(); 
                echo $z . "<br>";

                // $_SERVER is a PHP super global variable which holds 
                // information about headers, paths, and script locations. 

                echo $_SERVER['PHP_SELF'];
                echo "<br>";
                echo $_SERVER['SERVER_NAME'];
                echo "<br>";
                echo $_SERVER['HTTP_HOST'];
                echo "<br>";
                echo $_SERVER['HTTP_REFERER'];
                echo "<br>";
                echo $_SERVER['HTTP_USER_AGENT'];
                echo "<br>";
                echo $_SERVER['SCRIPT_NAME'];

                // A complete list of indices for the $_SERVER 
                // superglobal variable can be found here: 
                // http://php.net/manual/en/reserved.variables.server.php

            ?>

    </body>
</html>