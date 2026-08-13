regex_pattern = r"\S+\s\S+\s\S+"	# Do not delete 'r'.
import re
import sys

test_string = raw_input()
match = re.search(regex_pattern, test_string) is not None
print str(match).lower()