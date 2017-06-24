# Loop Control Statements

# Python supports 3 loop control statements: break,
# continue, and pass.

# The 'break' statement terminates the loop and transfers
# control to the statement immediately following the loop.

for a in range(1, 10):
    print(a, "is the number.")
    if(a == 5):
        break
    print("The number is ", a)
else:
    print("We have reached the number 10.")
    
print("The loop is finished.")

# The most common use of break is when the condition to exit
# the loop is not contained within the loop itself.

while True:
    s = (input('Enter something : '))
    if s == 'quit':
        break
    print ('Length of the string is', len(s))
print ('Done.')


# The 'continue' statement causes the loop to skip the rest
# of its body, revert to the top and re-test its condition.

for b in range(1, 6):
    print(b, "is the number.")
    if(b == 3):
        continue
    print("The number is ", b)
    print("It really is, I swear.")
    print("No, I'm not kidding.")
else:
    print("We have reached the number 10.")
    
print("The loop is finished.")


# The 'pass' statement is used as a placeholder where a
# statement is required, but you want no code to be executed.
# It is most frequently used in an 'if' statement.

for a in range(1, 10):
    if(a == 5):
        pass
    else:
        print(a, "is a nice number.")
