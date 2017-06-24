# Keyword parameters
 
def func(a, b=5, c=10):                             # function declared with one standard parameter,
    print 'a is', a, 'and b is', b, 'and c is', c      # two parameters with default values

# begin main program

func(3, 7)                                                  # values for 'a' and 'b' passed as literals; 'c' assumed as default
func(25, c=24)                                          # value for 'a' passed as literal; value for 'c' passed as literal; 'b' assumed as default
func(c=50, a=100)                                    # value for 'c' and 'a' passed as literals, in reverse order; 'b' assumed as default

# end main program
