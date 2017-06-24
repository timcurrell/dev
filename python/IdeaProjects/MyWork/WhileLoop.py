# Loops -- While

# The while loop structure is similar to the implementation
# in Java, however foregoing the brackets.

a = 0

while(a < 10):
    print(a)
    a += 1


# Remember, any statements indented similarly to the first line
# following the condition are considered part of the suite, and
# thus part of the loop. When the condition becomes false, program
# control passes to the first line of code following the suite.


# Python allows the use of an 'else' statement in association
# with loops. The 'else' line executes when the condition becomes
# false.

b = 0

while(b < 10):
    print(b, "is less than 10")
    b += 1
else:
    print("Now we're done.")
print("Loop ended.")


# Similar to the if clause, if the suite following the while condition
# consists of only one statement, it can be placed on the same line
# with the while clause. This is rarely useful, but it is permitted.

c = 0

while(c < 10): c += 1

print("The single-line suite loop is complete.")


# Note: unlike the 'for' loop, iteration within the loop body must
# done manually. Failing to iterate or modify the value of the
# variable in the 'while' comparison will result in an infinite
# loop!

# DO NOT EXECUTE

# c = 0
# while(c < 10)
#     print("This is the number ", c)

