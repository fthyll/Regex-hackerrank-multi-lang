<?php
$Regex_Pattern = "/hackerrank/";
$Test_String = trim(fgets(STDIN));
$matches = preg_match_all($Regex_Pattern, $Test_String);
print("Number of matches : " . $matches);
?>