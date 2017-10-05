<?php

// Code "borrowed" -- and used verbatim -- from:
// https://stackoverflow.com/questions/5647461/how-do-i-send-a-post-request-with-php

function httpPOST($url, $data)
{
    $curl = curl_init($url);
    curl_setopt($curl, CURLOPT_POST, true);
    curl_setopt($curl, CURLOPT_POSTFIELDS, http_build_query($data));
    curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
    $response = curl_exec($curl);
    curl_close($curl);
    return $response;
}

?>