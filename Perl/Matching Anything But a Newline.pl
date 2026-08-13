$Regex_Pattern = '^.{3}\..{3}\..{3}\..{3}$';
$Test_String = <STDIN>;
chomp($Test_String);
if($Test_String =~ /$Regex_Pattern/){
    print "True";
} else {
    print "False";
}