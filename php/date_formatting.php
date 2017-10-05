<?php

    // Algorithm formatting date to MM-DD-YYYY
    
    $hyphen = $slash = 0;
    $str_date = $f_date = $array_date = "";

    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $amount = test_input($_POST["date"]);
    }

    $str_date = strval($date);
    
    $hyphen = strpos($str_date, "-");
    $slash = strpos($str_date, "/");
    
    if($hyphen > 0) {
    	$array_date = explode("-", $str_date);
    } elseif($slash > 0) {
    	$array_date = explode("/", $str_date);
    } else {
    	$array_date = array(substr($str_date, 0, 2),
    					substr($str_date, 2, 2),
    					substr($str_date, 4));
    }

    if(strlen($array_date[2]) == 2) {
        if(intval($array_date[2]) > 80) {
        	$array_date[2] = "19" . $array_date[2];
        } else {
        	$array_date[2] = "20" . $array_date[2];
        }
    }

    $f_date = $array_date[0] . "-" . $array_date[1] . "-" . $array_date[2];

	return $f_date;

    function test_input($data) {
        $data = trim($data);
        $data = stripslashes($data);
        $data = htmlspecialchars($data);
        
        return $data;
    }

?>
