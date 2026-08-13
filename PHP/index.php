<?php
$Regex_Pattern = "/.../";
$Test_String = trim(fgets(STDIN));
if(preg_match($Regex_Pattern, $Test_String)) {
    print("True");
} else {
    print("False");
}
?>