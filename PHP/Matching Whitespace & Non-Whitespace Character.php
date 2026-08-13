<?php
$Regex_Pattern = "/\S+\s\S+\s\S+/";
$Test_String = trim(fgets(STDIN));
if(preg_match($Regex_Pattern, $Test_String)) {
    print("True");
} else {
    print("False");
}
?>