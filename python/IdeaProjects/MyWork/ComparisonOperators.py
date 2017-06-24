# Comparison Operators

# Comparison operators compare the values on either side of them,
# returning a positive (true) or negative (false) result.

# Equals (comparison) is '=='

if(12 == 6 + 6):
    print("Booyah!")
    

# Not equals is done with '!='
# The '<>' was valid, but is now deprecated

if(12 != 11):
    print("Booyah yourself...")


# Greater than and less than are angle brackets

if(30 > 29):
    print("Thirty is greater than twenty-nine.")

if(29 < 30):
    print("Twenty-nine is less than thirty.")


# Greater than or equal to, and less than or equal to,
# are done the normal way.

a = 20
b = 20

if(b >= a):
    print("b is greater than or equal to a.")

if(a <= b):
    print("a is less than or equal to b.")
