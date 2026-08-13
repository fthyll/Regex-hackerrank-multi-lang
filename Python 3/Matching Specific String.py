regex_pattern = r"hackerrank"	# Do not delete 'r'.
import re
import sys

test_string = input()
matches = re.findall(regex_pattern, test_string)
print("Number of matches :", len(matches))