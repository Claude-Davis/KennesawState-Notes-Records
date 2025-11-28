# Course CSE 1321
# Section: BB
# Semester: Fall 2024

# prompt: https://view.officeapps.live.com/op/view.aspx?src=https%3A%2F%2Fwww.kennesaw.edu%2Fccse%2Ffirst-year-experience%2Fcse1321l_python%2Flabs%2Flab12-oop.docx&wdOrigin=BROWSELINK

#print("Lab.12.A. - Having A Seat")


class Chair:
    def __init__(self,num_of_legs,rolling,material):
        self.num_of_legs = 4
        self.rolling = False
        self.material = "plastic"

print("You are about to create a chair.")


num_of_legs = input("How many legs does your chair have?: ")
rolling = input("Is your chair rolling (true/false)?: ")
material = input("What is your chair made of?: ")

c1 = Chair(num_of_legs, rolling, material)   # this line saves the class "Chair" and all of its original attributes as "c1" 

if rolling:
    roll = "rolling"
if not rolling:
    roll = "not rolling"

print("Your chair has", num_of_legs, "legs,", "is",rolling, "and is made of", material + ".")  # this lineof code prints t e user input

print("This program is going to change that.")

print("Your chair has", c1.num_of_legs, "legs,", "is", c1.rolling, "and is made of", c1.material + ".")  # this line prints the class's original attributes (because of "c1.")
