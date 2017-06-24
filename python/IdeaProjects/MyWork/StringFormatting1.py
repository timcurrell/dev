# String Formatting %

# Python provides string functionality similar to the java
# printf() function. This is where a string is generated
# which includes placeholders which are later filled with
# either string literals or variable values.
#
# The placeholders are specific to the type of value:
#
#	%c	single character		%s	string
#	%i	signed integer			%d	signed integer
#	%u	unsigned integer		%f	floating point number
#
# The '%' is also used to separate the string from the tuple
# that provides the values to be inserted.

print("St. Louis penalty to number %d, %s, two minutes for %s." % (35, 'Steve Ott', 'slashing'))


ex_form1 = "Lions"
ex_form2 = "Tigers"
ex_form3 = "Bears"

print("%s and %s and %s, oh my!" % (ex_form1, ex_form2, ex_form3))

ex_form1 = "Patriots"
ex_form2 = "Packers"
ex_form3 = "Rams"

print("%s and %s and %s, oh my!" % (ex_form1, ex_form2, ex_form3))
