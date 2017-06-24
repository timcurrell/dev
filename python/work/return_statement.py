# Return statement
 
def maximum(x, y):
    if x > y:
        return x                                                       # passes value back to the function call statement
    elif x == y:
        return 'neither: the numbers are equal'         # passes value back to the function call statement
    else:
        return y                                                       # passes value back to the function call statement

# begin main program
 
print 'The larger of the first pair is', maximum(2, 3)
print 'The larger of the second pair is', maximum(7, 5)
print 'The larger of the third pair is', maximum(8, 8)

# end main program
