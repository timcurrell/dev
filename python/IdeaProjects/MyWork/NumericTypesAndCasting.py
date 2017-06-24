# Numeric Types and Casting


# Python 3 has reduced the categories of numeric types to three:
# integer, floating point, and complex. Memory allocation is
# dynamic, and precision is unlimited.

myInt = 12345
myFloat = 3.14159
myComplex = 35j

print(myInt)
print(myFloat)
print(myComplex)


# Casting of numeric types to strings or vice-versa is done using
# cast functions mimicking the desired type.

myIntString = str(myInt)

myStrInt = int("2001")

myStrFloat = float("12.3456")

print("This is how you tell " + myIntString + " is a string.")
print(myStrInt + 6789)
print(myStrFloat ** 3)
