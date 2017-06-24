# Strings, Values, Access, Formatting

# Strings are any sequential characters (including whitespace)
# enclosed in either single- or double-quotes. Single characters
# are simply short strings, or substrings. There is no "character"
# data type in Python.

# Strings are created by assigning one to a variable or using
# one as a parameter.

ex_string1 = "Flibbelty"
ex_string2 = "floo"

print(ex_string1, ex_string2 + "!")


# Individual bytes of a string can be accessed by referencing
# them as you would the elements in an array or list -- as single
# characters or a range.

print(ex_string2[2])
print(ex_string1[4:8])


# There are several useful formatting values that can be used
# as part of strings. These mimic commonly used values in
# UNIX regular expressions.

print("You\tcan\tput\ttabs\tbetween\twords...")
print("But the one\nyou are going\nto use the most\nis the newline.")

# An 'R' preceding the string will negate the formatting values, which
# will then print as a normall string.

print(R"This\thas\tall\tthe\tformatting\tcharacters\tnegated...")


# Python has some built-in string operators that provide some useful
# features. The '+' sign allows you to concatenate strings directly
# to one another. Printing two strings with a space between them can
# be accomplished by separating them with a comma. Repetition of a
# printed string can be done with a multiplication sign -- '*'.

print(ex_string1 + " " + ex_string2)
print(ex_string1, ex_string2)

print(ex_string1 * 5)


# Python gives you two membership operators to determine if a substring
# is within a given string. Value returned is a 1 or 0.

if("i" in ex_string1):
    print("The letter 'i' is in the string", ex_string1)
else:
    print("The letter 'i' is not in the string", ex_string1)
    
if("i" not in ex_string2):
    print("The letter 'i' is not in the string", ex_string2)
else:
    print("The letter 'i' is in the string", ex_string2)


# Python provides some of the formatting features of the C
# printf() function to use with strings. This is done with
# the '%' operator.

print("My name is %s and I weigh %i pounds." % ("Tim", 249))
print("The angry old man used to say %s %s!" % (ex_string1, ex_string2))
