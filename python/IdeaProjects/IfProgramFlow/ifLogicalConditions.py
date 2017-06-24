
# Comment out one or the other of these blocks. They each use a
# different logical condition to extend a single if statement
# to cover more than one scenario.

age = int(input("How old are you? "))

# -------------------------------------

# if (age >= 16) and (age <= 65):
#     print("Have a good day at work.")
# else:
#     print("Enjoy your free time.")

# -------------------------------------

if (age < 16) or (age > 65):
    print("Enjoy some free time.")
else:
    print("Have a nice day at work.")
