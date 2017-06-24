
# Interesting fact: 'i' is considered to be short for 'index',
# and as such it is considered an appropriate variable name
# for loop control.

for i in range(1, 20):
    print("i is now {}".format(i))

# Characters in a given string are accessed in the same way
# that you would access elements in a list.

number = "9,223,372,036,854,775,807"
for i in range(0, len(number)):
    print(number[i])

# ------------------------------------------

number = "9,223,372,036,854,775,807"
for i in range(0, len(number)):
    if number[i] in "0123456789":
        print(number[i])

# ------------------------------------------

number = "9,223,372,036,854,775,807"
for i in range(0, len(number)):
    if number[i].isdigit():         # isnumeric() also works
        print(number[i], end="")    # overrides "\n" line terminator
print()

# ------------------------------------------

number = "9,223,372,036,854,775,807"
cleanNumber = ""

for i in range(0, len(number)):
    if number[i].isnumeric():
        cleanNumber = cleanNumber + number[i]

newIntValue = int(cleanNumber)
print("The integer value is {}.".format(newIntValue))
