# IF - ELSE - ELIF Statements

# The ELSE statement can be married with an IF statement
# as a statement or suite to be executed if the IF condition
# is false. There is one ELSE permitted for each IF. Note that
# both the IF and ELSE statements must end with a colon.

a = 4
b = 8

if(a > b):
    print("a is greater than b")
else:
    print("a is not greater than b")


# Suites are allowed following both the IF and ELSE statements.

if (a > b):
    print("This is the 'a' suite.")
    print("The 'a' suite is cool.")
else:
    print("This is the 'b' suite.")
    print("The 'b' suite is even cooler!")


# The ELIF statement is used to nest IF conditions into a string.
# This helps facilitate a makeshift CASE statement structure, or
# simplify complicated multi-condition statements.

if(b <= 3):
    print("b is less than three.")
elif(b == 4):
    print("b is equal to four.")
elif(b == a):
    print("b is equal to a.")
elif(b > 4):
    print("b is greater than 4.")
else:
    print("b is apparently non-existent.")
