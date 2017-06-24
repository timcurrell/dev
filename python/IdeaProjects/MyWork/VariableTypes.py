# Variable Types

# Python supports several categories of variables. They are
#   - Number
#   - String
#   - List
#   - Tuple
#   - Dictionary

# Python supports 4 different number types: integer, long integer,
# floating point decimal, and complex numbers. Note, however: 
# this is kind of misleading; all integers are long in P3.

ex_integer = 10

ex_long_int = 51924360  

ex_float = 99.99999

ex_complex = 3.14159j

print(ex_integer, ex_long_int, ex_float, ex_complex)


# Strings in Python are any contiguous characters enclosed in
# single- or double-quotes.

ex_string1 = "BOOYAH!"

ex_string2 = "99.99999"

ex_string3 = "True"

print(ex_string1, ex_string2, ex_string3)


# A list is a compound data type. It contains multiple items 
# separated by commas and enclosed in square brackets [].
# The implementation has similarities to arrays in C, however
# in Python the contents of a list can be different data types.
# Just like in C, list elements of a list of length n are
# referenced starting at 0 and incrementing by one to n-1.

ex_list = [ 'abcd', 786 , 2.23, 'john', 70.2 ]

print(ex_list)

print(ex_list[2])


# Tuples are similar to lists, except for two things. Tuples
# are read-only -- their contents cannot be changed -- and the
# syntax is to enclose the items in parentheses instead of 
# square brackets. Surprisingly, however, the reference to an
# individual tuple item is still done with square brackets.


ex_tuple = ( 'efgh', 549 , 9.87, 'Dave', 12.3 )

print(ex_tuple)

print(ex_tuple[3])


# A Dictionary in python is a series of key/value pairs.
# The pairs can be declared individually/explicitly, or
# as pairs in a sequence. The syntax is to enclose the
# key/value pairs in curly brackets on initial declaration;
# and again, confusingly, references to individual keys
# or values are done with square brackets.

ex_dict = {}

ex_dict['first'] = "This is the first element of my dictionary."
ex_dict['second'] = "Damn, this is confusing..."

print(ex_dict.keys())

print(ex_dict.values())


another_dict = {'FirstName':'Clark', 'LastName':'Kent', 'SecretIdentity':'Superman'}

print(another_dict.keys())

print(another_dict.values())


# To reference a single value based on the key, the syntax is
# roughly the same as a list reference, but instead of the
# position number in square brackets you use the value literal.

print(another_dict['SecretIdentity'])
