# Numeric Functions & Constants

# Python supports a number of native functions that provide
# versatility in performing actions on numbers within programs.
# Some of these functions are native, but others need the 'math'
# module imported in order to use them.

import math

ex_list = [-10000, -1000, -100, -99, -98, -97, -45.678, -23.456, -2.5, -1, 0, 1, 2, 3, 4, 5, 6, 7, 10, 22.222, 33, 44.4444444, 55.555555, 66.666666, 100, 200, 1000, 5000, 10000, 1000000]


# abs() provides the absolute value of the number

print(abs(ex_list[5]))


# ceil() and floor() provides the ceiling and floor of the value
# being referenced. The ceiling is defined as the smallest integer
# not less than the parameter; the floor as the largest integer
# not more than the parameter.

print(math.ceil(ex_list[6]))

print(math.floor(ex_list[19]))


# log() provides the logarithm of the parameter

print(math.log(ex_list[17]))


# min() and max() provide the smallest and largest value in the list
# referenced as a parameter. 

print(min(ex_list))

print(max(ex_list))


# pow(x,y) provides the same result as x**y.

print(ex_list[14]**ex_list[15])
print(pow(ex_list[14], ex_list[15]))


# sqrt() provides the square root of the parameter.

print(math.sqrt(ex_list[23]))


# round(x[,n]) provides the result of the x parameter rounded
# to n decimal places. 0.5 is the cut-off, and Python rounds
# away from zero as the tie-breaker. Not providing the n
# parameter defaults to an integer. I have seen some inconsistent
# behavior with this, so be careful.

print(round(ex_list[6]))
print(round(ex_list[7], 1))
print(round(ex_list[8]))
print(round(ex_list[22], 5))
print(round(ex_list[23], 5))


# Python has a number of randon number functions that are available.
# The 'random' module must be imported in order to function.

import random

random.seed()  # Invoke this before referencing random module functions.


# random() generates a float value between 0 and 1.

print("Random number is", random.random())


# randrange([start,] stop [,step]) generates a random number
# between either 0 or the 'start' value and the 'stop' value.
# The 'step' value is ???, so use an integer between 1 and 5

print("Random integer from a specified range is", random.randrange(1, 1000, 3))


# shuffle() randomizes the order of the list parameter in place.

print("List item 6:",ex_list[6])
print("List item 7:",ex_list[7])
print("List item 8:",ex_list[8])

print("Shuffle...")
random.shuffle(ex_list)

print("List item 6:",ex_list[6])
print("List item 7:",ex_list[7])
print("List item 8:",ex_list[8])

print("Shuffle...")
random.shuffle(ex_list)

print("List item 6:",ex_list[6])
print("List item 7:",ex_list[7])
print("List item 8:",ex_list[8])


# Python has two constants: pi and e. The present as floats
# formatted (1,15).

print("The constant pi is equal to\t", math.pi)
print("The constant e is equal to\t", math.e)
