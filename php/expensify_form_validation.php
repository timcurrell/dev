<html>
    <head></head>
    <body>

        <?php

            $vendor = $date = $amount = "";

            if ($_SERVER["REQUEST_METHOD"] == "POST") {
                $vendor = test_input($_POST["vendor"]);
                $date = test_input($_POST["date"]);
                $amount = test_input($_POST["amount"]);
            }

            echo "$vendor <br>";
            echo "$date <br>";
            echo "$ $amount <br>";

            function test_input($data) {
                $data = trim($data);
                $data = stripslashes($data);
                $data = htmlspecialchars($data);
                return $data;
            }

        ?>
    </body>
</html>
