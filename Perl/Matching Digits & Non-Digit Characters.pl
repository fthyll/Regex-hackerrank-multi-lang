$Regex_Pattern = '\d{2}\D\d{2}\D\d{4}';
$Test_String = <STDIN>;
chomp($Test_String);
if($Test_String =~ /$Regex_Pattern/){
    print "True";
} else {
    print "False";
}