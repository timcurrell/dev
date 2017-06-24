# Assignment Math Operators

# Assignment operators consist of the normal '=' sign,
# plus a series of '=' combined with another math operator.
# This is used as a shorthand for a longer math equation.
# It's essentially lazy programmers trying to type less.


# Equals (as assignment)

a = 5

ex_var = "lazy programmers"

print(a, ex_var)


# "Add AND" assignemnt operator
# In the example below, 'b += a' is the same as 'b = b + a'
# Note that the original value of b is now gone.

a = 3
b = 6
b += a
print(b)


# "Subtract AND" assignemnt operator

a = 22
b = 66
b -= a
print(b)


# "Multiply AND" assignemnt operator

a = 3
b = 6
b *= a
print(b)


# "Divide AND" assignemnt operator

a = 3
b = 6
b /= a
print(b)


# "Modulus AND" assignemnt operator

a = 17
b = 567
b %= a
print(b)


# "Exponent AND" assignemnt operator
# Note: this is 'b = b ** a', not 'b = a ** b'

a = 3
b = 6
b **= a
print(b)


