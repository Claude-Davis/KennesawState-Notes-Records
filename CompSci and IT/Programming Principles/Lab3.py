# Lab3.py
# IT1114/Section W01
# Starlan Davis
# Lab #3
# Due: 10 June 2025
# Purpose: This program calculates the sales of multiple salesmen over four weeks and displays the total in addition to the manager's bonus
# Resources: cse 1321

# initiates sales goal variable
salesGoal = input("What is the Sales Goal for this month?: ")
sg = salesGoal

# initiates variables 
personNum  = 1
allPersons = 0
next = ""
mngBonus = 0
total = 0

while (next.lower() != "no") and (next.lower() != "n"):
    # collect each week's sales gain
    week1 = int(input("Salesperson " + str(personNum) + " week 1: "))
    week2 = int(input("Salesperson " + str(personNum) + " week 2: "))
    week3 = int(input("Salesperson " + str(personNum) + " week 3: "))
    week4 = int(input("Salesperson " + str(personNum) + " week 4: "))

    total += float(week1+week2+week3+week4)

    mngBonus += float(week1*0.02)+(week2*0.02)+(week3*0.02)+(week4*0.02)

    # increase person's number
    allPersons = personNum
    personNum += 1

    # cont?
    next  = str(input("Another salesperson?: "))

# outputs
if (next.lower() == "no") or (next.lower() == "n"):
    print(" ")
    print("Department of Monthly Sales and Commission")
    print(" ")

    print("Number of Employees: " + str(allPersons))
    print("Department Sales Goal: $" + str(sg))
    print("Total Sales: $" + str(total))


# manager bonus
if (float(total) <= float(sg)):
    bonus = mngBonus
elif (float(total) > float(sg)):
    bonus = float(total * 0.05)

print("Mgr. Bonus: $" + str(bonus))