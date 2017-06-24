# Membership Operators

# The Python membership operator 'in' returns a 'True' or 'False'
# based on the presence of a value in a given set. Target sets can
# be (but are not limited to) strings, lists, or tuples. Again, the
# reserved words are functional in lower case only. The logical 
# operator 'not' can be paired with 'in' to achieve the opposite
# result.


sports_cars = ["Aston Martin", "Ferrari", "Maserati", "McLaren", "Porsche"]
alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

if("Ferrari" in sports_cars):
    print("Ferrari is a sports car.")
else:
    print("Ferrari sucks.")
    

if("Alfa Romeo" not in sports_cars):
    print("Alfa Romeo sucks.")
else:
    print("Alfa Romeo is a sports car.")


if("A" in alphabet):
    print("Sesame Street is brought to you today by the letter 'A'.")
    
if("a" in alphabet):
    print("Sesame Street is brought to you today by the letter 'a'.")
    
if("a" not in alphabet):
    print("Remember, Python is case-sensitive.")
