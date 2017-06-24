# String Slices

# Slices are a shorthand for sub-strings in Python.
# They can be extracted from both strings and lists.
# The general syntax for string myString is 
#
#     myString[x:y]
#
# where x and y are numeric identifications of portions
# of the string. Positive numbers 0 through n are the
# characters or elements starting at the beginning of
# the string/list and moving forward; negative numbers
# -1 through -n are start at the end and move backwards.

ex_slice1 = "Supercalifragilisticexpialidocious"
ex_slice2 = "Congratulations"

print(ex_slice1[5])			# prints 6th character

print(ex_slice1[-6])		# prints 6th character from the end

print(ex_slice1[3:19])		# prints "ercalifragilisti"

print(ex_slice1[-23:-9])	# prints "agilisticexpia"

print(ex_slice2[:])			# prints entire string

print(ex_slice2[5:50])		# prints 6th through end of string
							# (second index exceeds length)


# Leaving the first or second index off with the colon in 
# place is legal, and produces predictable results. When the
# first index is missing, a 0 is assumed; when the second
# index is missing a -1 is assumed.

print(ex_slice1[:-9])       # prints up to but not including the last 9 characters

print(ex_slice1[12:])       # prints from the 12th character through the end
