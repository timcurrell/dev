
# The first way to print strings and numerics in the same print statement
# is using a cast str() function to convert the numeric value.

age = 24

print("My age is " + str(age) + " years.")


# If you have a lot of these to do, casting every value can be tedious.
# Instead you can use replacement fields.

print("My age is {0} years.".format(age))

print("Our paydays in {0} occur on the {1}th, {2}th, {3}th, and {4}th of the month.".format("June", 5, 12, 19, 26))

# Any type of data -- numeric or string -- can be fed into a replacement
# field with the format() function. Each parameter is numbered in sequence
# from 0 to n.

# You can also leave the values blank inside the curly brackets, and Python
# will assume that you have the proper number of parameters and that you
# wish to use them in order.

print("{}, {}, {}, {}, Come on baby say you love me, {}, {}, {} times".format(1, 2, 3, 4, 5, 6, 7))

# Also, you can use the reference to a given parameter multiple times, as
# in the following example.

print("""Days in each month
January: {2}
February: {0}
March: {2}
April: {1}
May: {2}
June: {1}
July: {2}
August: {2}
September: {1}
October: {2}
November: {1}
December: {2}""".format(28, 30, 31))


# The substitution method similar to the one used in C and Java code
# was valid in Python 2; the function is now deprecated, and the
# replacement field method should be used.

print("My age is %d years." % 24)
