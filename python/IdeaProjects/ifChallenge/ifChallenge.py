
# ifChallenge
#
# Write a small program to ask for a name and an age.
# When both values have been entered, check if the person
# is the right age to on an 18 - 30 holiday (they must be
# 18 or over and under 31). If they are, welcome them to
# the holiday. If not, print a (polite) message refusing
# them entry.

ent_Name = input("Hello! Please enter your name: ")

ent_Age = int(input("Thanks joining us, {}. Please enter your age: ".format(ent_Name)))

if 18 <= ent_Age <= 30:
    print("Welcome to the holiday! We're glad you've joined us.")
else:
    print("I'm terribly sorry, but your age prevents you from joining us today.")
