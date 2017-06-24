# python print function

# Simple print statement

print('This is a print statement in single quotes.')
print("Double-quotes are also allowed.")
print("Single quotes are allowed 'as-is' inside double quotes, and vice-versa.")


# A carriage return inside a single line statement is backslash, lower-case 'n'

print("Never gonna give you up\nNever gonna let you down\nNever gonna run around\nAnd desert you")


# Concatenating strings can be done with a comma or a plus sign
# The comma adds a space between them, a plus sign does not

print("ABC", "123")
print("ABC" + "123")


# Printing numbers & espressions

print(65)
print(123+456)
print(23*45)
print("na-na-"*8 + "BATMAAAAANNNN!")


# But how do you get dynamically constructed prints to show up on
# the same line?

for x in range(1, 20): print(x)

# Use the 'end' keyword within the print( ) function. The statement
# below will print the numbers 1 through 19 on a single line separated
# by spaces.

for x in range(1, 20): print(x, end=" ", flush=True)


# Similarly, for printing multiple strings in the same statement
# separated by commas, you can replace the <space> separator
# by using the 'sep' keyword.

print("\nMerry", "Little", "Christmas", sep='~')
