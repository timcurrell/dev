# Nonlocal variables
# NOTE: THIS FUNCTIONALITY DOES NOT APPEAR TO WORK IN PYTHON 2.6
 
def func_outer():                       # outer function declaration
    x = 2
    print 'x is', x
 
    def func_inner():                    # inner or "nested" function declaration
        nonlocal x                          # system is throwing a syntax error at 'x' in this line
        x = 5
 
    func_inner()
    print 'Changed local x to', x

# begin main program

func_outer()

# end main program
