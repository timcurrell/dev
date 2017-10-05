<?php

    // Algorithm converting monetary amount to cents

    $amount_in_cents = $amount = $decimal = 0;
    $amount_str = $dollars = $cents = "";

    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $amount = test_input($_POST["amount"]);
    }

    $amount_str = strval($amount);
    $decimal = strpos($amount_str, ".");
    if(gettype($decimal) == "boolean") {
        $decimal = -1;
    }

    if ($decimal == 0) {
        $cents = $amount . "00";
        $amount_in_cents = substr($cents, 1, 2);
        $message = "Decimal == 0 used.";
    } elseif ($decimal > 0) {
        $amt_array = explode(".", $amount_str);
        if($amt_array[0] == "0") {
            $dollars = "";
        } else {
            $dollars = $amt_array[0];
        }
        $cents = $amt_array[1] . "00";
        $cents = substr($cents, 0, 2);
        $amount_in_cents = $dollars . $cents;
        $message = "Decimal > 0 used.";
    } else {
        $amount_in_cents = $amount_str . "00";
        $message = "Default used.";
    }

    if($amount_in_cents == "00") {
        $amount_in_cents = "0";
    }

//    return $amount_in_cents;

    echo $amount . "|" . $amount_str . "|" . $decimal . "|" . $amount_in_cents . "|" . $message;

    function test_input($data) {
        $data = trim($data);
        $data = stripslashes($data);
        $data = htmlspecialchars($data);

        return $data;
    }

?>
