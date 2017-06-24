# Python variable Assignment

# Variables in Python do need explicit declaration, but in a 
# minimalist way. The type is derived, not declared, by the
# type of the value initially assigned to it. Assignment is
# made using a single '=' sign.

counter = 100

miles = 98.7

driver = "John"

print(counter, miles, driver)


# Python allows multiple variable assignments, illustrated 
# as follows:

a = b = c = d = e = 100

print(a, b, c ,d ,e)


x, y, z = 77, 78, 79

print(x, y, z)


# In the second example, the variable types do not have to be
# the same. The following is perfectly legal:

ex_int, ex_float, ex_string = 66, 45.6, "lazy"

print(ex_int, ex_float, ex_string)


