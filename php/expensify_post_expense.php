<html>
    <head></head>
    <body>

        <?php

//          $vendor = $date = $amount = $username = $password = $email = "";
			$vendor = $date = $amount = "";
			$username = "timcurrell";
			$password = "myPassw0rd";
			$email = "timcurrell@gmail.com";
            $method = "POST";
            $url = "https://integrations.expensify.com/Integration-Server/ExpensifyIntegrations";

            if ($_SERVER["REQUEST_METHOD"] == "POST") {
//              $username = test_input($_POST["username"]);
//              $password = test_input($_POST["password"]);
//              $email = test_input($_POST["email"]);
                $vendor = test_input($_POST["vendor"]);
                $date = test_input($_POST["date"]);
                $amount = test_input($_POST["amount"]);
            }

            $json_string = 'requestJobDescription={
		        "type":"create",
		        "credentials":{"partnerUserID":"' . $username . '",
                    "partnerUserSecret":"' . $password . '"},
		        "inputSettings":{
		        	"type":"expenses",
		        	"employeeEmail":"' . $email . '",
		        	"transactionList": [{
		        		"created": "' . $date . '",
		        		"currency": "USD",
		        		"merchant": "' . $vendor . '",
		        		"amount": ' . $amount . '}]}}';

			echo $method . "<br>";
			echo $url . "<br>";
		    echo $json_string . "<br>";

//		    $return_value = call_api($method, $url, $json_string);


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

			    // Optional Authentication:
			    curl_setopt($curl, CURLOPT_HTTPAUTH, CURLAUTH_BASIC);
			    curl_setopt($curl, CURLOPT_USERPWD, "username:password");

			    curl_setopt($curl, CURLOPT_URL, $url);
			    curl_setopt($curl, CURLOPT_RETURNTRANSFER, 1);

			    $response = curl_exec($curl);

			    $result = json_decode($response);

			    curl_close($curl);

			    return $result;
			}


        ?>
    </body>
</html>
