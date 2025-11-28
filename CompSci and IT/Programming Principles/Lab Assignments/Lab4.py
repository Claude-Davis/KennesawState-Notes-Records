# Lab4.py
# IT1114/Section W01
# Starlan Davis
# Lab #4
# Due: 17 June 2025
# Purpose: Allows a manager to determine and the cost of a resort vacation.  A resort client will be able to book a vacation, dining and special excursions
# Resources:


# define req'd functions
def roomCost(nights, roomType):
    if (roomType == 1):
        totalCost = 375 * nights
    elif (roomType == 2):
        totalCost = 350 * nights
    elif (roomType == 3):
        totalCost = 525 * nights
    elif (roomType == 4):
        totalCost = 475 * nights
    return totalCost
def mealCost(brunches, dinners):
    brunchCost = 25 * brunches
    dinnerCost = 75 * dinners
    tip = (brunchCost+dinnerCost) * 0.15
    totalMealCost = brunchCost + dinnerCost + tip
    return totalMealCost
def excursionCost(p, s, h, d, peopleNum):
    totalExcCost = 0
    if (p=="y"):
        totalExcCost += 50
    if (s=="y"):
        totalExcCost += 25 * peopleNum
    if (h=="y"):
        totalExcCost += 17 * peopleNum
    if (d=="y"):
        totalExcCost += 200
    return totalExcCost



# inputs list
nights= int(input("Number of nights: "))
people= int(input("Number of people: "))
print("Room Types:\n   (1) - Two Queen Beds\n   (2) - One King Bed\n   (3) - Queen Suite\n   (4) - King Suite")
room= int(input("Select Type: "))
brunchNum= int(input("How many Brunches: "))
dinnerNum= int(input("How many Dinners: "))
picnic= input("Picnic?: ")
snorkeling= input("Snorkeling?: ")
hike= input("Guided Hike?: ")
boatDinner= input("Boat Dinner?: ")

print(" ")
print(" ")

#total calculations
rC = roomCost(nights, room)
mC = mealCost(brunchNum, dinnerNum)
eC = excursionCost(picnic, snorkeling, hike, boatDinner, people)
total = rC + mC + eC


# outputs list
print("Room Cost: $" + str(rC))
print("Meal Cost: $" + str(mC))
print("Excursion Cost: $" + str(eC))
print("Total Cost: $" + str(total))