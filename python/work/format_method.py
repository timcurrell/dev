# format() method

# What Python does in the format method
# is substitutes each argument value into
# the place of the {specification}. Arguments
# are numbered left to right starting at 0.

age = 25
name = 'Swaroop'
 
print('{0} is {1} years old'.format(name, age))
print('Why is {0} playing with that python?'.format(name))

print '{0:.3}'.format(1.0/3.0) # decimal (.) precision of 3 for float

print '{0:_^11}'.format('hello') # fill with underscores (_) with the text centered (^) to 11 width

# You can also note the {specifications} as keywords
print '{name} wrote {book}'.format(name='Swaroop', book='A Byte of Python')
