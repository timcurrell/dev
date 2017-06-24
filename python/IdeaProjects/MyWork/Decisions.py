# Decisions, True-False, Single-line 'if'

# Pay attention, this is important: Python views ANY
# NON-ZERO, NON-NULL value as TRUE. Zero or null is
# interpreted as FALSE.

# There are 3 decision constructs in Python: IF, IF-ELSE,
# and nested IF statements. There is no reserved-word 
# CASE-style statement built into Python. That must be
# done using a dictionary.

# Boolean comparisons in the IF statement are enclosed 
# in parentheses and followed by a colon.

a = 3
b = 6

if(b > a):
    print("The statement is true.")
    

# With the statement above, Python allows for something
# called a "single statement suite". This allows for the
# following construct:

if(b > a): print("This is a single statement suite.")
