# String Methods 3

# Python has numerous built-in methods that can be used to perform
# various functions on strings. A breakdown of some of the more
# commonly used ones are outlined below.

ex_str1 = "    phooey    "
ex_str2 = "The quick brown fox jumps over the lazy dog."
ex_str3 = "1"
ex_str4 = "98765"
ex_str5 = "!B@SsbA1"
ex_str6 = "abc123"
ex_str7 = "ALLCAPS"


ex_Replace = ex_str2.replace("o", "0")
print(ex_Replace)
print()

ex_Ljust = ex_str4.ljust(40, "<")
ex_Center = ex_str7.center(40, "-")
ex_Rjust = ex_str6.rjust(40, ">")
print(ex_Ljust)
print(ex_Center)
print(ex_Rjust)
print()

ex_Lstrip = ex_str1.lstrip()
ex_Rstrip = ex_str1.rstrip()
ex_Strip = ex_str1.strip()
print("000" + ex_Lstrip + "000")
print("000" + ex_Rstrip + "000")
print("000" + ex_Strip + "000")
print()
