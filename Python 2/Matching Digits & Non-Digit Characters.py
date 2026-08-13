regex_pattern = r"\d{2}\D\d{2}\D\d{4}"	# Do not delete 'r'.
import re
import sys

test_string = raw_input()
match = re.search(regex_pattern, test_string) is not None
print str(match).lower()