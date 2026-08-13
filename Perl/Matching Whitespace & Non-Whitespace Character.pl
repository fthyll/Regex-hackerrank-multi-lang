$Regex_Pattern = '\S+\s\S+\s\S+';
$Test_String = <STDIN>;
chomp($Test_String);
if($Test_String =~ /$Regex_Pattern/){
    print "True";
} else {
    print "False";
}