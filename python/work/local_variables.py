# Local variables

def func(x):                               # function declaration
    print 'x is', x 
    x = 2
    print 'Changed local x to', x

# begin main program

x = 50
func(x)
print 'x is still', x

# end main program
