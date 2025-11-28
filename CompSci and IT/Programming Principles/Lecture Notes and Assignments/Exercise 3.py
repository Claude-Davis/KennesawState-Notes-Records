# Write a program that asks for the user's name and year if birth.
# Then, greet the user and tell them how old they are in 2022.

# define variables
name = ""
birthYear = 0
currentYear = 0

# request input
name = input("What is your name?  ")
birthYear = int(input("What year were you born?  "))
currentYear = int(input("What year is it now?   "))

# age calculations
ageNow = currentYear - birthYear
distanceFrom2022 = currentYear - 2022
ageIn22 = ageNow - distanceFrom2022

print(" ")

print("Hello, " + name + ".")
print("In the year 2022, you were " + str(ageIn22) + " years old.")