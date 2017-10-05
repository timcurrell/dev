<!DOCTYPE html>
<html>
    <body>

        <h2>Data Types</h2>

            <?php 

                // PHP supports different data types, and different data 
                // types can do different things. The following are the 
                // data types PHP recognizes: 
                // 
                // String             Array 
                // Integer            Object 
                // Float              NULL 
                // Boolean            Resource 

                // A string is a series of any number of characters inside 
                // quotes. Single or double makes no difference. 

                $stringA = "Hello, World!";
                $stringB = 'Hello, World!';
                echo $stringA;
                echo "<br>";
                echo $stringB;
                echo "<br>";
                
                // The integer data type must contain at least one digit, 
                // and must not contain a decimal point. It can be either 
                // positive or negative. 

                $intA = 12345;
                $negInt = -9;

                echo "<br>";
                echo $intA;
                echo "<br>";
                var_dump($intA);
                echo "<br>";
                echo $negInt;
                echo "<br>";
                var_dump($negInt);
                echo "<br>";
                echo $intA + $negInt;
                echo "<br>";

                // The float data type must contain at least one digit, 
                // and must be in decimal or exponential notation. It 
                // can be either positive or negative. 

                $floatA = 123.45;
                $negFloat = -1.6e5;

                echo "<br>";
                echo $floatA;
                echo "<br>";
                var_dump($floatA);
                echo "<br>";
                echo $negFloat;
                echo "<br>";
                var_dump($negFloat);
                echo "<br>";
                echo $floatA + $negFloat;
                echo "<br>";

                // The boolean values in PHP are 'true' and 'false'

                $amIanOrk = false;
                $amIanElf = true;

                // The 'NULL' data types functions as it would in other 
                // programming languages or databases. 

                // See separate files for information on Arrays, Objects, 
                // and Resources

            ?>

    </body>
</html>