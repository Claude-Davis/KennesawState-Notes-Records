# Course CSE 1321L
# Section: BJK
# Semester: Fall 2024
# Name: Starlan Davis
# Date: 3 September 2024

# Module 2: Flow Control - Selection, Repetition

#LAB 4
# Learning Outcomes: Selection structures (if/else and match statements), Repetition structures (for loops), Review I/O (input and output)

#Lab.4.A
# PROMPT: 
print ("Lab.4.A - What is My Grade?")
print (" ")

score = float(input("Enter the score of your exam: "))

if (score <= 64.4):
    print ("Letter grade is: F")
elif (64.5 <= score <= 67.4):
    print ("Letter grade is: D-")
elif (67.5 <= score <= 70.4):
    print ("Letter grade is: D")
elif (70.5 <= score <= 73.4):
    print ("Letter grade is: D+")
elif (73.5 <= score <= 76.4):
    print ("Letter grade is: C-")
elif (76.5 <= score <= 79.4):
    print ("Letter grade is: C")
elif (79.5 <= score <= 82.4):
    print ("Letter grade is: C+")
elif (82.5 <= score <= 85.4):
    print ("Letter gradde is: B-")
elif (85.5 <= score <= 88.4):
    print ("Letter grade is: B")
elif (88.5 <= score <= 91.4):
    print ("Letter grade is: B+")
elif (91.5 <= score <= 94.4):
    print ("Letter grade is: A-")
elif (94.5 <= score <= 97.4):
    print ("Letter grade is: A")
elif (97.5 <= score <= 100):
    print ("Letter grade is: A+")


# dividing line 
print ("-----------------------------------------------------")


#Lab.4.B
# PROMPT: 
print (" ")
print ("Lab.4.B - Creating A Menu")
print (" ")

print ("Welcome!")
num = float(input("Please input a number: "))

# menu displayed
print ("What would you like to do to this number:")
print ("0) Get the additive inverse of the number")
print ("1) Get the reciprocal of the number")
print ("2) Square the number")
print ("3) Cube the number")
print ("4) Exit the program")

num1 = int(input(" "))

# menu
match num1:
    case 0:
        inverse = float(num * (-1))
        print ("The additive inverse of " + str(num) + " is " + str(inverse))
    case 1:
        if (num == 0):
            print ("Cannot divide by 0!")
        else:
            recp = 1/num
            print ("The reciprocal of " + str(num) + " is " + str(recp))
    case 2:
        sq = float(num * num)
        print ("The square of " + str(num) + " is " + str(sq))
    case 3:
        cube = num * num * num
        print ("The cube of " + str(num) + " is " + str(cube))
    case 4:
        print ("Thank you, goodbye!")
    case _:
        print ("Invalid option!")

# dividing line 
print ("-----------------------------------------------------")

print (" ")
print ("Lab.4.C - Cha-Ching")
print (" ")

balance = 1000

# start
print ("Welcome!")
print ("You have $" + str(balance) + " in your account.")
print (" ")

mainMenu = "Y"

while (mainMenu == "Y" or mainMenu == "y"):

    print("Menu")
    print("0 - Make a deposit")
    print("1 - Make a withdrawal")
    print("2 - Display account value")
    print(" ")

    select = str(input("Please make a selection: "))

    match select:
        case "0":
            deposit = float(input("How much would you like to deposit?: "))
            balance = float(round(balance + deposit, 2))
            print("Your current balance is $" + str(balance))
            mainMenu = str(input("Would you like to return to the main menu (Y/N)?: "))
            print (" ")
        case "1":
            withdraw = float(input("How much would you like to withdraw?: "))
            if withdraw <= balance:
                balance = float(round(balance - withdraw, 2))
                print("Your current balance is $" + str(balance))
            elif withdraw > balance:
                print ("Not enough balance. Withdrawal cancelled.")
            mainMenu = str(input("Would you like to return to the main menu (Y/N)?: "))
            print(" ")
        case "2":
            print("Your current balance is $" + str(float(round((balance, 2)))))
            mainMenu = str(input("Would you like to return to the main menu (Y/N)?: "))
            print(" ")
        case _:
            print("Invalid entry, please try again.")
            mainMenu = str(input("Would you like to return to the main menu (Y/N)?: "))
            print(" ")

print ("Thank you for banking with us!")
