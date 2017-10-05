<!DOCTYPE html>
<html>
    <body>

        <h2>String Functions</h2>

            <?php 

                // A string is a sequence of characters inside of quotes. 

                $my_string = "The quick brown fox jumped over the lazy dog.";
                $string_spaces = "        This     string   has   lots   of      spaces     ";

                // Just like java and other languages, a string is treated 
                // as an object and has associated functions that can be 
                // performed on it. 

                echo strlen($my_string) . "<br>";    // Outputs numeric length of string 

                echo str_word_count($my_string) . "<br>";    // Ouputs numeric string word count 

                echo strrev($my_string) . "<br>";    // Outputs reversed string 

                echo strpos($my_string, "ox") . "<br>";    // Outputs position of substring 

                echo str_replace("dog", "kangaroo", $my_string) . "<br>"; // Substitutes first substring for second substring 

                echo strtoupper($my_string) . "<br>";    // Converts string to all uppercase 

                echo strtolower($my_string) . "<br>";    // Converts string to all lowercase 

                // The following don't show up in a web browser, because web
                // browsers automatically condense all whitespace to a single 
                // space regardless.

                echo ltrim($string_spaces) . "<br>";    // Trims whitespace from left side of string 

                echo rtrim($string_spaces) . "<br>";    // Trims whitespace from right side of string

                echo trim($string_spaces) . "<br>";    // Trims whitespace from both sides of string

                // See the entire list of string functions available to use at 
                // https://www.w3schools.com/php/php_ref_string.asp 

            ?>

    </body>
</html>