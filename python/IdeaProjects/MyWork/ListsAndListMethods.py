# Python Lists & List Methods


# A list in Python is similar to an array in Pascal or Java.
# Unlike arrays however, lists can contain elements of any
# data type mixed together. List elements are accessed like
# an array, using their index inside of square brackets.

ex_List1 = ["Example", 12345, "Woodland animals in chain mail.", 3.14159, True]
print(ex_List1)
for i in range(0, 5):
    print("List element {}: ".format(i) + str(ex_List1[i]))
print()

ex_List2 = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]

print(ex_List2[2])
print(ex_List2[1])
print(ex_List2[0])
print(ex_List2[-1])
print(ex_List2[-2])
print()


# A list is an object, and there are many methods associated with
# list objects that can be used to determine list characteristics,
# view list contents, and manipulate list members.

ex_List3 = [1, 7, 2, 4, 0, 8, 5, 3, 6, 9]
ex_List4 = [1, 1]
ex_List5 = ["Mares", "Does", "Pigs", "eat", "oats", "and"]

print(ex_List3)
print(len(ex_List3))
print(max(ex_List3))
print(min(ex_List3))
ex_List3.sort()
print(ex_List3)
print()

for i in range(2, 12):
    newElement = ex_List4[-2] + ex_List4[-1]
    ex_List4.append(newElement)
print(ex_List4)
print()

print(ex_List5)
ex_Eat = ex_List5[3]
ex_Oat = ex_List5[4]
ex_And = ex_List5[5]
ex_List5.insert(1, ex_Eat)
ex_List5.insert(2, ex_Oat)
ex_List5.insert(3, ex_And)
ex_List5.remove("Pigs")
print(ex_List5)
ex_List5.append("Little")
ex_List5.append("lambs")
ex_List5.append(ex_Eat)
ex_List5.append("ivy")
print(ex_List5)
ex_List5.reverse()
print(ex_List5)
ex_List5.reverse()
print(ex_List5.count("eat"))
print(ex_List5.index("Little"))
print()
