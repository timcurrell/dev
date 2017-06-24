
# This is an absurd example, and could be done so much better using
# a "while" loop with the condition being met with a correct guess
# inside the loop. However, I am going to write the code example
# as instructed.

print("Please guess a number between 1 and 10: ")
guess = int(input())

if guess < 5:
    print("Please guess higher")
    guess = int(input())
    if guess == 5:
        print("Well done, you guessed it!")
    else:
        print("I'm sorry, that's not correct.")
elif guess > 5:
    print("Please guess lower")
    guess = int(input())
    if guess == 5:
        print("Well done, you guessed it!")
    else:
        print("I'm sorry, that's not correct.")
else:
    print("Nice job! You guesed on the first try!")
