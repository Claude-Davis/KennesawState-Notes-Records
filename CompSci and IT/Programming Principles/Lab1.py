# Lab1.py
# IT1114/Section W01
# Starlan Davis
# Lab #1
# Due: 3 June 2025
# Purpose: This program takes user input for a room's length and width and the cost of flooring per square foot. The program will then calculate the total sq.ft., flooring cost, tax (7%) and total amount due.
# Resources:


# define variables [as float types]
length = 0.0
width = 0.0
costPerSF = 0.0

tax = 0.0
flooringCost = 0.0

# request user inputs
length = float(input("Room Length: ")) #lentgth of the room
width = float(input("Room Width: "))
costPerSF = float(input("Cost per Sq. Foot: $"))

# calculations | sq.ft formula: length * width
squareft = length * width
flooringCost = squareft * costPerSF
tax = flooringCost * 0.07
totalCost = flooringCost + tax

print(" ") # space break between sections

# output (NOTE- cast all int values to str)
print("Square feet: " + str(squareft))
print("Flooring Cost: $" + str(flooringCost))
print("Tax: $" + str(tax))
print("Total Cost: $" + str(totalCost))
