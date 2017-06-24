# String Methods 1

# Python has numerous built-in methods that can be used to perform
# various functions on strings. A breakdown of some of the more
# commonly used ones are outlined below.

ex_str1 = "phooey"
ex_str2 = "The quick brown fox jumps over the lazy dog."
ex_str3 = "1"
ex_str4 = "98765"
ex_str5 = "!B@SsbA1"
ex_str6 = "abc123"
ex_str7 = "ALLCAPS"


# upper() and lower() return the respective case of
# the string being referenced. capitalize() returns 
# a copy of the string with the first character capitalized
# (assuming it is an alphabetic)

ex_upper = ex_str2.upper()
print(ex_upper)
ex_lower = ex_str7.lower()
print(ex_lower)
ex_caps = ex_str1.capitalize()
print(ex_caps)


# count() returns the number of occurrences of a specified
# substring within the string. The beginning and end position
# for the search may optionally be specified.

ex_count1 = ex_str2.count("o")
ex_count2 = ex_str2.count("o", 20, 30)
print("First count is", ex_count1)
print("Second count is", ex_count2)


# The find() and index() methods provide identical functionality.
# They both provide the location of a specified substring within 
# a given string. The beginning and end position for the search 
# may optionally be specified. The difference is that the find() 
# will return -1 if the substring is not found, whereas index()
# will raise an exception.

print(ex_str2.find("i"))
print(ex_str2.find("x", 0, 10))
print(ex_str2.index("j"))
print(ex_str2.index("q", 0, 10))


# There are many boolean functions beginning with 'is' to analyze
# string values to look for certain characteristics.
# 
# isalnum() looks for both alpha and numeric digits
# isdigit() and isnumeric() look for all numeric characters
# isalpha() looks for all alphabetic characters
# islower() looks for all lower-case characters
# isupper() looks for all upper-case characters
# isspace() looks for only whitespace characters

if(ex_str1.isalnum() == "True"):
        print("ex_str1 is alpha-numeric.")
else:
        print("ex_str1 is not alpha-numeric.")


# startswith() and endswith() are boolean functions that 
# indicate whether a string begins or ends with the string
# indicated in quotes

ex_starts = ex_str1.startswith('p')
print(ex_starts)
ex_ends = ex_str1.endswith('z')
print(ex_ends)
