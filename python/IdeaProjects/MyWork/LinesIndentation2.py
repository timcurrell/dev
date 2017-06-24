# Python Lines & Indentation

# Python has substituted the use of indentation and
# line placement in place of brackets and braces
# as is done in languages like Java. This, command
# line placement and indentation are rigidly enforced.

isItTrue = False

if isItTrue:
	print("True!")
	print("Booyah, motherfucker!")
else:
	print("False...")
	print("Bloody hell...")

# Python recognizes any sequential lines that are indented 
# by the same number of spaces as being in a block. Thus, 
# the following will not get the result you think it will.

if isItTrue:
	print("This is the positive portion of the if statement.")
	print("This is also the positive portion of the if statement.")
	print("This is inside the if statement, positive.")
else:
	print("This is the negative portion of the if statement.")
	print("This is also the negative portion of the if statement.")
	print("This is inside the if statement, negative.")
print("This is outside the if statement.")

# Tinker around with the True/False value and see what happens.
# Also, putting the "outside" print statement above the "else" 
# will cause an error.
