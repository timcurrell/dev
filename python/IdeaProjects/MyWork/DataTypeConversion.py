# Data Type Conversion

# Converting from one data type to another is done simply by
# preceding the variable name with the desired data type.
# There is no guarantee it will work, however...

ex_int = 123

ex_float = 456.789

ex_string = "Please work..."


conv_int_to_float = float(ex_int)

print(conv_int_to_float)

conv_float_to_int = int(ex_float)  # truncates decimal value, does not round up/down

print(conv_float_to_int)

conv_float_to_string = str(ex_float)

print(conv_float_to_string)


# There are also some fancy conversion functions:

ex_char1 = "C"

ex_char2 = "c"

ex_num1 = 987

ex_num2 = 765

conv_ord_uc = ord(ex_char1)  # Converts single character to its integer value

conv_ord_lc = ord(ex_char2)

conv_hex = hex(ex_num1)  # Converts integer to a hexadecimal string

conv_oct = oct(ex_num2)  # Converts integer to an octal string

print(conv_ord_uc, conv_ord_lc, conv_hex, conv_oct)
