# I am using this self-assigned project to practice and gauge my coding skills. I will update the game as a I learn more.
  # 1st Contribution/Commit. 6 September 2024

# NOTE:  Potetial Additions Listed at the End!

# Based on a prompt from Kretlow's lecture

# Input Validation
# Prompt: Write a program in which you allow your user to guess a secret number. For this example, set your secret number to a literal for easy testing. When you are done, think about how you can modify the program to allow the user to continue to guess until they get it right. Also, think about how you could use conditionals to give them valuable feedback to reach the answer!

print ("Welcome!")
print ("Guess the secret number!")
print (" ")

#game level menu
print ("Menu")
print ("Level 1 - Easy")
print ("Level 2 - Intermediate")
print ("Level 3 - Difficult")
print (" ")

print ("Choose what level you want to play on:", end="")
gameLevel = int(input(" "))

match gameLevel:
    case 1:
        print ("You are playing on Level 1")
        print (" ")
        start = str(input("Press 'k' to continue. "))
        while start != "k":
            print("incorrect key")
            start = str(input(" "))
        print(" ")                                              # This and the next lines are set to print if "start" = 'k'
        print("Let's begin!")
        print("Guess a number from 0 and 10.")
        secretNum = int(7)                                     # the Secret Number
        userGuess = int(input(" "))

        while userGuess != secretNum:
            if (userGuess < 0):
                print("Oh no! Your guess is out of range.")
                print ("Try again!")
                userGuess = int(input(" "))
            elif (userGuess > 10):
                print("Oh no! Your guess is out of range.")
                print("Try again!")
                userGuess = int(input(" "))
            elif (0 <= userGuess):
                print (str(userGuess) + " is not the secret number.")
                print ("Try again!")
                userGuess = int(input(" "))
            elif (7 < userGuess):
                print(str(userGuess) + " is not the secret number.")
                print("Try again!")
                userGuess = int(input(" "))
        print ("Yay! You guessed the secret number!")
        print ("Congrats!")
        print ("Thanks for playing!")


    case 2:
        print ("You are playing on Level 2")
        print(" ")
        start = str(input("Press 'k' to continue.  "))
        while start != "k":
            print("incorrect key")
            start = str(input(" "))
        print(" ")
        print("Let's begin!")
        print("Guess a number from 0 to 35.")
        secretNum = int(29)                             # the Secret Number
        userGuess = int(input(" "))

        while userGuess != secretNum:
            if (userGuess < 0):
                print ("--Your guess is out of range--")
                print ("Try again!")
                userGuess = int(input(" "))
            elif (userGuess > 35):
                print("--Your guess is out of range--")
                print ("Try again!")
                userGuess = int(input(" "))
            elif (0 <= userGuess):
                print (str(userGuess) + " is not the secret number.")
                print ("Try again!")
                userGuess = int(input(" "))
            elif (29 < userGuess):
                print(str(userGuess) + " is not the secret number.")
                print("Try again!")
                userGuess = int(input(" "))
        print ("Nice! You guessed the secret number!")
        print ("Thanks for playing!")


    case 3:
        print ("You are playing on Level 3")
        print(" ")
        start = str(input("Press 'k' to continue.  "))
        while start != "k":
            print("incorrect key")
            start = str(input(" "))
        print (" ")
        print ("Let's begin!")
        print ("Guess a number from 0 to 100.")
        secretNum = int(86)                                     # the Secret Number
        userGuess = int(input(" "))
        counter = 2                                             # counts the player's number of attempts

        while userGuess != secretNum:
            if (userGuess < 0):
                print ("Too low; out of range.")
                userGuess = int(input(" "))
            elif (userGuess > 100):
                print ("Too high; out of range.")
                userGuess = int(input(" "))
            else:
                print ("Nope. Not what we're looking for.")
                userGuess = int(input(" "))
        print ("Congrats!", str(userGuess), "is the correct number.")
        print ("Thanks for playing!")



# Randomly generate the Secret Number each time the game is [re]started
# Hints, to help the player guess the number
# An option to quit the game midway
