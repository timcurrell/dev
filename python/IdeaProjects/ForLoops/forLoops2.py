
# This is a different way to iterate through the characters in
# a given string. My question is, how does python *know* that's
# what you are trying to achieve?

number = "9,223,372,036,854,775,807"
cleanNumber = ""

for char in number:
    if char in "0123456789":
#   if char.isdigit():
        cleanNumber = cleanNumber + char

newIntValue = int(cleanNumber)
print("The integer value of the string is {}.".format(newIntValue))

# -----------------------------------------------------------

# Python can iterate through lists, either literals or previously
# declared values.

for state in ["give you up", "let you down", "run around and hurt you", "make you cry", "say goodbye", "tell a lie and hurt you"]:
    print("Never gonna {}".format(state))

# -----------------------------------------------------------

# The keyword 'range' isn't just specifying a start and end point;
# the values within that range constitute a sequence within python
# with elements that can be accessed using the [] notation.

for i in range(0, 100, 5):          # The third value is 'step'
    print("i is {}".format(i))      # which says how many to skip

# -----------------------------------------------------------

# Loops can be nested, just like in other programming languages.

for i in range(1, 13):
    for j in range(1, 13):
        print("{1} times {0} is {2}".format(j, i, i*j))
    print("=======================")
