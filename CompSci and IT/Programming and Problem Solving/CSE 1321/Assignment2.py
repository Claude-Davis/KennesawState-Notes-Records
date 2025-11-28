# Course CSE 1321L
# Section: BJK
# Semester: Fall 2024
# Name: Starlan Davis
# Date: 26 August 2024


print ("Assignment.2.A. - Movie Ticket Pricing System")

age = int(input("Enter your age: "))

if (age < 12):
    print ("Your ticket price is: $8")
elif (12 <= age <= 17):
    print ("Your ticket price is: $12")
elif (18 <= age <= 64):
    member = str(input("Are you a member of the cinema club (yes or no)? "))
    if (member == "yes"):
        print ("Your ticket price is: $12")
    else:
        print ("Your ticket price is $15")
elif (65<= age):
    print ("Your ticket price is: $10")

print (" ")
print ("----------------------------------------------------")
print (" ")

print ("Assignment.2.B. - Animal Classifier")

name = input("Enter the name of an animal: ")

if name in ["cat", "dog", "whale", "dolphin", "human", "wolf", "elephant", "raccoon", "chipmunk", "squirrel"]:
    print ("The animal is a Mammal.")
elif name in ["eagle", "hawk", "flamingo", "pigeon", "sparrow", "penguin", "parrot", "owl", "finch", "swallow", "wren", "woodpecker", "crow", "raven", "cuckoo", "heron", "turkey", "chicken"]:
    print ("This animal is a Bird.")
elif name in ["snake", "lizard", "alligator", "crocodile", "turtle", "tortoise", "gecko", "chameleon", "iguana", "gila monster"]:
    print ("This animal is a Reptile.")
elif name in ["salmon", "cod", "fish", "shark", "cod", "goldfish", "tuna", "minnow", "pufferfish", "mackerel", "snapper", "bass", "sunfish", "tetra", "angelfish"]:
    print ("This animal is a Fish.")
elif name in ["frog", "newt", "salamander", "toad", "axolotl", "bullfrog", "mudpuppy", "olm", "hellbender"]:
    print ("This animal is an Amphibian.")
else:
    print ("Unknown category")

print (" ")
print ("----------------------------------------------------")
print (" ")

print ("Assignment.2.C. - Day of the Week Translator")

num = int(input("Enter a number (1-7): "))

match (num):
    case 1:
        print ("Monday")
    case 2:
        print("Tuesday")
    case 3:
        print ("Wednesday")
    case 4:
        print ("Thursday")
    case 5:
        print ("Friday")
    case 6:
        print ("Saturday")
    case 7:
        print ("Sunday")
    case _:
        print ("Invalid input. Please enter a number between 1 and 7.")
