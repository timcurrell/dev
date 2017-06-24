# Logical Operators

# The logical operators 'and', 'or', and 'not' function the way you would expect them to.
# However, those three operators are reserved words in lower case only. So while 'and' will
# give you the desired result, 'AND' will not!


a = True        # Python is case-sensitive, and these keywords are ALL functional in the precise
b = True        # spelling and capitalization in which you see them. A positive boolean result
c = False       # is 'True', not 'true' or 'TRUE'. The same is correct for a negative result.

if(a and b):
    print("The 'and' expression is true.")

if(a or c):
    print("The 'or' expression is true.")

if not(a or c):
    print("The 'not' expression evaluated to true.")
else:
    print("The 'not' expression evaluated to false.")


# The keyword 'not' is the Boolean NOT. If x is True, not x returns False, and vice versa.

x = True
print(not x)
x = False
print(not x)


# The keyword 'and' is the Boolean AND. x and y returns False if x is False, else it returns evaluation of y.

x = True
y = False
print(x and y)


# In the following case, Python will not evaluate y since it knows that the left hand side of the 'and'
# expression is False which implies that the whole expression will be False irrespective of the other
# values. This is called short-circuit evaluation.

x = False
y = True
print(x and y)


# The keyword 'or' is the Boolean OR. If x is True, it returns True, else it returns evaluation of y.
# Short-circuit evaluation applies here as well.

x = True
y = False
print(x or y)

x = False
y = True
print(x or y)
