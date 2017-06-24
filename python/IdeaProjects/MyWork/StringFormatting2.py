# Field Substitution Formatting

# Field substitution is an updated version of field replacement
# using the %d, %f, %s placeholders. It allows you to use the
# built-in function format() to insert parameters from a list
# and format them for output. Numerics do not have to be
# explicitly converted to strings when using this method.

print("Little pig, little pig, let me come in\nOr I'll {0} and I'll {1} and I'll {2}".format("huff", "puff", "blow your house in!"))

print("{} little {} little {} little indians".format (1, 2, 3))

print("You can't take {0} from {1}, {1} is less than {0} so you look at the {0} in the {2}'s place.".format(9, 5, 10))

print("{}-{}-{}, Easy as {}-{}-{}...".format(*"ABC123"))

name = "GOMER PYLE"
print("FROM NOW ON YOUR NAME IS {}!".format(name))

print("Dave ordered {dave}\nand Bill ordered {bill}.".format(dave="a cheeseburger and onion rings", bill="salad with French dressing"))

fib = (1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89)
print("The fibonacci sequence begins with {0[0]}, then continues\nwith {0[1]}, then {0[2]}, {0[3]}, {0[4]}, {0[5]}, {0[6]}, and {0[7]}.".format(fib))


# Field substitution also allows some rudimentary formatting
# features that allow you to format numbers, align fields, and
# pad output.

myPi = 355/113
myLarge = 12345678987654321
print(myPi)
print(myLarge)

print("{0:<40} is left-justified.".format(myLarge))
print("{0:>40} is right-justified.".format(myLarge))
print("{0:^40} is centered.".format(myLarge))
print("{0:*^40} is centered with a '*' fill character.".format(myLarge))
print("{0:,}".format(myLarge))
print("{0:5.3f}".format(myPi))
print("{0:11.9f}".format(myPi))
print("{0:17.15f}".format(myPi))
