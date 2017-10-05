<?php

	$username = $password = "";
	$url = "https://integrations.expensify.com/Integration-Server/ExpensifyIntegrations"

	if ($_SERVER["REQUEST_METHOD"] == "POST") {
		$username = test_input($_POST["username"]);
		$password = test_input($_POST["password"]);
	}

	$ch = curl_init();

	curl_setopt($ch, CURLOPT_URL, $url);
	curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
	curl_setopt($ch, CURLOPT_USERPWD, "$username:$password");
	curl_setopt($ch, CURLOPT_HTTPAUTH, CURLAUTH_BASIC);
	$output = curl_exec($ch);
	$info = curl_getinfo($ch);
	curl_close($ch);

	print_r($info);

	print "<br>============================<br>";

	print_r($output);

?>
