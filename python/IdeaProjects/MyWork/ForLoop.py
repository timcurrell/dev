# Loops - for

# The Python 'for' loop implementation is simpler than that of
# Java, but has more iterative options. And again, no brackets.

# In the following examples, the 'for' loop iterates through the
# bytes in a string, then the items in a list.

for letter in 'Python':
   print('Current Letter :', letter)

fruits = ['banana', 'apple',  'mango']
for fruit in fruits:
   print('Current fruit :', fruit)

print("Good bye!")

# Notice that the iterative statement is not enclosed in parenteses.


# A numeric iterative sequence can be achieved by using the
# range() built-in function. The iteration starts on the first
# value and stops PRIOR TO the second value.

for x in range(10, 25):
    print(x)


# Python allows for the 'else' statement to be used in association
# with loops. With 'for' loops, the 'else' statement is executed 
# when the iterative statement has been exhausted.

for y in range(3, 15):
    print(2 ** y)
else:
    print("I can't count any higher...")
