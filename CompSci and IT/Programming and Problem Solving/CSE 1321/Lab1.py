# Course CSE 1321L
# Section: BJK
# Semester: Fall 2024
# Name: Starlan Davis
# Date: 12 August 2024

# Module 1:  I/O and Variables, Types, Operator, and Expressions

# Program Lab1A.py
print ("Lab.1.A - Lift Off")
print (" ")
# Demonstrate the difference between print with and without a newline.
# Prints two lines of output representing a rocket countdown.
print ("Three... ", end =" ")
print ("Two... ", end =" ")
print ("One... ", end =" ")
print ("Zero..." , end =" ")
print ("Liftoff!")
# appears on first line
print ("Houston, we have a problem.")


print ("------------------------------")


# Program Lab1B.py
print ("Lab.1.B - Message")
print (" ")
# Demonstrate reading a string from the user.
# Reads a character string from the user and prints it.
message = input ("Enter a line of text: ");
print ("You Wrote: '" + message + "'");


print ("------------------------------")


# Program Lab1C.py
print ("Lab.1.C - Calculator")
print (" ")
# Demonstrate the use of the input function to read numeric data.
# Calculates fuel efficiency based on values entered by the user.
miles = input ("Enter the number of miles: ")
gallons = input ("Enter the gallons of fuel used: ")
mpg = int (miles) / float (gallons)
print ("Miles Per Gallon: " + str (mpg))
