# Function parameters
 
def printMax(a, b):                # declare function with parameters a & b
    if a > b:
        print a, 'is maximum'
    elif a == b:
        print 'a is equal to b, value is', b
    else:
        print b, 'is maximum'
 
printMax(3, 4)                       # pass literal values directly
 
x = 5
y = 7
 
printMax(x, y)                       # pass variables as arguments

printMax(x+2, y)                   # pass derived values from variables, literals
