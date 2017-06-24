# Suites

# A group of individual statements which make a single code 
# block are called suites in Python. Compound or complex 
# statements, such as if, while, def, and class require a 
# header line and a suite. Header lines begin the statement 
# (with the keyword) and terminate with a colon ( : ) and are 
# followed by one or more indented lines which make up the suite.

isThisASuite = "Yes"

if isThisASuite == "Yes":
	print("Begin the suite!")
	print("Isn't this a lovely suite.")
	print("Wonder if they pronounce it 'sweet' or 'soot'...")
else:
	print("This is a suite too.")
	print("It's just not going to get run until that variable is set to 'No'.")


# Remember that indentation is the key. Anything not conforming
# to the indentation guidelines will send things sideways.
