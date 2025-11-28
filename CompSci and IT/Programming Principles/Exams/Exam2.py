# Exam2.py
# IT1114/Section W01
# Starlan Davis
# Exam, #2
# Due: 8 July 2025
# Purpose: calculate the volume of a water tower


# import math package for use of pi
import math

# setting the 'pi' variable
pi = math.pi

# functions for calculations
def calculate_halfSphere(radius):
    return ((4/3) * pi * radius**3) / 2

def calculate_cylinder(radius, height):
    return pi * radius**2 * height


# user input 
sphere_radius = int(input("What is the radius of the sphere portion: "))
cylinder_radius = int(input("What is the radius of the cylinder portion: "))
cylinder_height = int(input("What is the height of the cylinder portion: "))

# call functions
volume = calculate_halfSphere(sphere_radius) + calculate_cylinder(cylinder_radius, cylinder_height)

# display volume
print("Volume: " + str(volume))