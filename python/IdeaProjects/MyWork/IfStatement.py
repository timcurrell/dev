# Simple IF statement

# The IF statement in Python is similar to the implementation
# in other languages. The boolean condition is enclosed in 
# parentheses and followed by a colon; and remember that 
# code suites are denoted by indentation, not overt syntax.

a = 4
b = 8

if(b > a):
    print("The condition is true.")
    
    
# Python does support unary comparisons.

if(a):
    print("The unary condition is true.")
    

# Python also allows for a single statement suite when there
# is only one statement to follow a single IF condition.

if(b): print("The single statement suite is permitted.")


# For multiple line suites, indentation denotes what is
# part of the suite and what is not. These two statements
# produce different results:

if(a > b):
    b += a
    print(a)
    print(b)
print(a + b)
print(a ** b)
    

if(a > b):
    b += a
print(a)
print(b)
print(a + b)
print(a ** b)
