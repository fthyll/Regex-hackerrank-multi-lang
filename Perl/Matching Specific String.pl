$Regex_Pattern = 'hackerrank';
$Test_String = <STDIN>;
my @matches = $Test_String =~ /$Regex_Pattern/g;
print "Number of matches : ", scalar(@matches);