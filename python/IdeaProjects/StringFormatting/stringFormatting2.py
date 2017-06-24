
# Using the old method of string subsitution we can specify some formatting
# parameters to make our output look neater.

for i in range(1, 12):
    print("Number %2d squared is %3d and cubed is %4d." % (i, i**2, i**3))

# The substitution placeholder specifies a width for the incoming value, and
# that allows the output to be justified as desired.

# This same effect can be achieved with replacement field notation as noted
# below.

for i in range(1, 12):
    print("Number {0:2} squared is {1:3} and cubed is {2:4}.".format(i, i**2, i**3))

# The first value is the sequence of the parameter as before, and the second
# value is the width. Values can be left-justified by inserting a less-than
# sign.

for i in range(1, 12):
    print("Number {0:<2} squared is {1:<3} and cubed is {2:<4}.".format(i, i**2, i**3))


# For decimal precision, the desired formatting is achieved using the
# substitution method as shown below.

print("Pi is approximately %3.12f" % (22/7))

# It is the same notation in field replacement, adding the precision after
# the decimal point.

print("Pi is approximately {0:3.12f}".format(22/7))

# Note that the 'f' is included to specify a floating point number.

