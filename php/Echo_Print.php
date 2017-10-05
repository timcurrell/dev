<!DOCTYPE html>
<html>
    <body>

        <h2>Echo and Print</h2>

            <?php 

                // The 'echo' and 'print' keywords can be used interchangeably 
                // with one exception. The 'print' command has a return code of 
                // a numeric '1', which is handy for expressions. 'echo' has 
                // no return code.

                $txt1 = "Learn PHP";
                $txt2 = "W3Schools.com";
                $x = 5;
                $y = 4;

                echo "<h3>PHP is Fun!</h3>";
                echo "Hello world!<br>";
                echo "I'm about to learn PHP!<br>";
                echo "This ", "string ", "was ", "made ", "with multiple parameters.";

                // In PHP the '.' acts as a string concatenation operator. 
                // It functions the same as '+' in java or python. 

                echo "<h3>" . $txt1 . "</h3>";
                echo "Study PHP at " . $txt2 . "<br>";
                echo $x + $y;

                // All of these statements can be replicated using the 
                // 'print' keyword. Notice, however, that the 'print' 
                // keyword throws a fit if you try to concatenate with 
                // commas, which 'echo' has no problem with.

                print "<h3>PHP is Fun!</h3>";
                print "Hello world!<br>";
                print "I'm about to learn PHP!<br>";
                print "This " . "string " . "was " . "made " . "with multiple parameters.";

                print "<h3>" . $txt1 . "</h3>";
                print "Study PHP at " . $txt2 . "<br>";
                print $x + $y;

            ?>

    </body>
</html>