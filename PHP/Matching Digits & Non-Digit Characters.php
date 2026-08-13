<?php
$Regex_Pattern = "/\d{2}\D\d{2}\D\d{4}/";
$Test_String = trim(fgets(STDIN));
if(preg_match($Regex_Pattern, $Test_String)) {
    print("True");
} else {
    print("False");
}
?>