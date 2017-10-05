<!DOCTYPE html>
<html>
    <body>

        <h2>Superglobals -- $POST</h2>

            <!--  
                The PHP $_POST super global variable is used to 
                collect data after submitting an HTML form. 

                The first part of this page is an HTML <form> tag 
                that has an input field and a submit button. The 
                input field is given an internal name of 'fname'
                to identify it to the system. The "action" attribute 
                in the <form> tag points to the PHP script that 
                is to be executed when the user presses the "submit"
                button. In this case it is self-referencing.
            -->

                <form method="post" action="<?php echo $_SERVER['PHP_SELF'];?>">
                    Name: <input type="text" name="fname">
                    <input type="submit">
                </form>

            <?php

                // In the PHP script, the first thing to do is check to 
                // see that the request method is "POST", which it is. 
                // Next, the array $_REQUEST is referenced using the index 
                // of 'fname' (see above) and the value assigned to the 
                // variable $name. Now the value that the user entered is 
                // available for the system to use. 

                if ($_SERVER["REQUEST_METHOD"] == "POST") {
                    $name = $_POST['fname'];
                    if (empty($name)) {
                        echo "Name is empty";
                    } else {
                        echo "Bugger me, if it isn't $name again...";
                    }
                }
            ?>

    </body>
</html>