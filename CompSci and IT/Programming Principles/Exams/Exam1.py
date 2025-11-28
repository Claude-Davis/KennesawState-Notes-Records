# Exam1.py
# IT1114/Section W01
# Starlan Davis
# Exa, #1
# Due: 17 June 2025
# Purpose: To simplify the process of doing taxes


# initiating variable
tax = 0

# user input
income = float(input("What was your total income for this tax year?: "))
maritalStatus = str(input("Are you married? [y/n]: "))

if (maritalStatus == "y"):
    maritalYrs = int(input("How long have you been married?: "))
    
elevation = int(input("Is the elevation of your home address below-1, at-2, or above-3 sea level? [1/2/3]: "))

print(" ")

# calculations - income
if (income < 10000):
    tax += income * 0.023
if ((income >= 10000) and (income <= 50000)):
    tax += income * 0.045
if (income > 50000):
    tax += income * 0.061

# calculations - marital status and years
married = False
if (maritalStatus == "y"):
    married = True

if (married == True):
    tax -= (maritalYrs * 1.62)
else:
    tax = tax

# calculations - elevation
if (elevation == 1):
    tax += 18.32
elif (elevation == 2):
    tax += income * 0.016
elif (elevation == 3):
    bedrooms = int(input("How many bedrooms are in your home?: "))
    tax += bedrooms * 5


# output
print("The total tax for $" + str(income) + " is: $" + str(tax))