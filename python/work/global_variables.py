# Global variables
 
def func():                                    # function declaration
    global x
    print 'x is', x
    x = 2
    print 'Changed global x to', x

# begin main program

x = 50 
func()
print 'Value of x is', x

# end main program
