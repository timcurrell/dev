
# I'm going to enter a bunch of lines of comments here
# without actually putting the comment character at
# the beginning of the line. Then when I select this
# block and hold down CTRL and hit '/' (slash), it
# comments out the block! This is a toggle feature,
# the same keystrokes will un-comment as well.

name = input("Please enter your name: ")
age = int(input("How old are you, {}? ".format(name)))
print(age)

if age >= 18:
    print("You are old enough to vote!")
    print("Please put an X in the box.")
else:
    print("Please come back in {} years.".format(18 - age))
    print("We look forward to seeing you!")
