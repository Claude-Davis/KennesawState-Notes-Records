# Write a program that finds the surface area of a cylinder.
# The formula is given as: 2𝜋𝑟ℎ+2𝜋𝑟^2
#
r = 0
h = 0

pi = 3.141592653  # Define the constant pi

# 1- Get user input
r = input("Enter the radius: ")
print("Enter the height: ", end="") # setting 'end' to empty string will not put a new line at the end of the line
h = input()
# 	- cast r to float
r = float(r)
# 	- cast h to float
h = float(h)

# 2- Calculate formula
surface_area = (2 * pi * r * h) + (2 * pi * (r * r))

# 3- produce output
print("Surface area:", surface_area)