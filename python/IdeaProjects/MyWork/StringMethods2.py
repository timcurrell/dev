# String Methods 2

# Python has numerous built-in methods that can be used to perform
# various functions on strings. A breakdown of some of the more
# commonly used ones are outlined below.

ex_str1 = "phooey"
ex_str2 = "The quick brown fox jumps over the lazy dog."
ex_str3 = "1"
ex_str4 = "98765"
ex_str5 = "not-technically-in-a-recession"
ex_str6 = "abc123"
ex_str7 = "ALLCAPS"


# replace('old', 'new') returns a string where all instances 
# of 'old' are replaced with 'new'

ex_repl = ex_str2.replace('o', '0')
print(ex_repl)


# split('delim') divides the given string into substrings based
# on the specified 'delim' delimiter. When no delimiter text value
# is provided the function recognizes whitespace as the delimeter.
# The results are returned as a list variable. 

ex_split = ex_str5.split('-')
print(ex_split)
print(ex_split[2], ex_split[-1])


# join() is the opposite of split(). It joins the elements in a 
# given list together using the string as a delimeter. The syntax
# is backwards: the delimiter is the string on which the function
# is executed, and the list is the parameter.

ex_join = '|'.join(ex_split)
print(ex_join)
