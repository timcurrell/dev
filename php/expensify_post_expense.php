<?php

    $vendor = $date = $amount = $username = $password = $email = "";
//	$vendor = $date = $amount = "";
//	$vendor = "Charlies Horses";
//	$date = "10/30/2017";
//	$amount = 9.87;
	$username = "timcurrell";
	$password = "myPassw0rd";
	$email = "timcurrell@gmail.com";
    $method = "POST";
    $url = "https://integrations.expensify.com/Integration-Server/ExpensifyIntegrations";

    if ($_SERVER["REQUEST_METHOD"] == "POST") {
//      $username = test_input($_POST["username"]);
//      $password = test_input($_POST["password"]);
//      $email = test_input($_POST["email"]);
      $vendor = test_input($_POST["vendor"]);
      $date = test_input($_POST["date"]);
      $amount = test_input($_POST["amount"]);
    }

	$formatted_date = date_formatting($date);
	
	$amount_in_cents = conversion_to_cents($amount);

    $json_string = 'requestJobDescription={
	    "type":"create",
	    "credentials":{"partnerUserID":"' . $username . '",
            "partnerUserSecret":"' . $password . '"},
	    "inputSettings":{
	    	"type":"expenses",
	    	"employeeEmail":"' . $email . '",
	    	"transactionList": [{
	    		"created": "' . $formatted_date . '",
	    		"currency": "USD",
	    		"merchant": "' . $vendor . '",
	    		"amount": ' . $amount_in_cents . '}]}}';
	
	echo $method . "<br>";
	echo $url . "<br>";
	echo $json_string . "<br>";

//	$return_value = call_api($method, $url, $json_string);
	
	
	// FUNCTION test_input
	// Trims out leading and trailing spaces; removes slashes;
	// encodes sneaky stuff into HTML characters

    function test_input($data) {
        $data = trim($data);
        $data = stripslashes($data);
        $data = htmlspecialchars($data);
        return $data;
    }
    

	// FUNCTION call_api
	// Accepts basic parameters for API call using 'curl'
	// Performs call to API and returns result

    function call_api($method, $url, $data) 
    {
    	$curl = curl_init();

    	switch ($method)
	    {
	        case "POST":
	            curl_setopt($curl, CURLOPT_POST, 1);

	            if ($data)
	                curl_setopt($curl, CURLOPT_POSTFIELDS, $data);
		            break;
	        case "PUT":
	            curl_setopt($curl, CURLOPT_PUT, 1);
	            break;
	        default:
	            if ($data)
	                $url = sprintf("%s?%s", $url, http_build_query($data));
	    }

	    curl_setopt($curl, CURLOPT_HTTPAUTH, CURLAUTH_BASIC);
	    curl_setopt($curl, CURLOPT_USERPWD, "username:password");

	    curl_setopt($curl, CURLOPT_URL, $url);
	    curl_setopt($curl, CURLOPT_RETURNTRANSFER, 1);

	    $response = curl_exec($curl);
    
	    $result = json_decode($response);

	    curl_close($curl);

	    return $result;
	}
	
	function conversion_to_cents($amount) {
		
	    $amount_in_cents = $amount = $decimal = 0;
	    $amount_str = $dollars = $cents = "";

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
	
	    return $amount_in_cents;
	
	}

	function date_formatting ($date) {
		
		$hyphen = $slash = 0;
    	$str_date = $f_date = $array_date = "";

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
	}


?>