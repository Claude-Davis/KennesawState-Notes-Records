# Course CSE 1321L
# Section: BJK
# Semester: Fall 2024
# Name: Starlan Davis
# Date: 10 September 2024

print ("Lab.5.A. - Largest of 10")
print (" ")
# create a program that will ask the user to input 10 positive integer numbers, one at a time. While it does this the program should also keep track of the largest number it has seen so far. After it has run 10 times, it should display the largest number you input.
print ("Please enter 10 numbers and this program will display the largest.")
num1 = str(input("Please enter number 1: "))
num2 = str(input("Please enter number 2: "))
num3 = str(input("Please enter number 3: "))
num4 = str(input("Please enter number 4: "))
num5 = str(input("Please enter number 5: "))
num6 = str(input("Please enter number 6: "))
num7 = str(input("Please enter number 7: "))
num8 = str(input("Please enter number 8: "))
num9 = str(input("Please enter number 9: "))
num10 = str(input("Please enter number 10: "))

for i in num1:
    x = int(num1)

for i in num2:
    num2 = int(num2)
    if x < num2:
      x = num2

for i in num3:
    num3 = int(num3)
    if x < num3:
      x = num3

for i in num4:
    num4 = int(num4)
    if x < num4:
      x = num4

for i in num5:
    num5 = int(num5)
    if x < num5:
      x = num5

for i in num6:
    num6 = int(num6)
    if x < num6:
      x = num6

for i in num7:
    num7 = int(num7)
    if x < num7:
      x = num7

for i in num8:
    num8 = int(num8)
    if x < num8:
      x = num8

for i in num9:
    num9 = int(num9)
    if x < num9:
      x = num9

for i in num10:
    num10 = int(num10)
    if x < num10:
      x = num10

print (" ")
print ("The largest number was", x)

print (" ")
print ("---------------")
print (" ")

print ("Lab.5.B. - The Box")
print (" ")
# Write a program that asks the user for a value. Based on the value given to the program by the user, use nested for-loops to draw a box that has the length and the width of the value specified by the user. Afterwards, use the same value and another pair of nested for-loops to draw a right-facing right-triangle. Finally, use a last pair of nested for-loops to draw a right-triangle facing the left. See the examples below for reference.
size = int(input("Please enter a value for the size: "))
print ("This is the requested", str(size) + "x" + str(size), "box:")

# box shape
for i in range (size):
    print ("*" * int(size))

 # right-facing triangle
print("This is the requested right-facing", str(size) + "x" + str(size), "right-triangle:")
num = 1
while num <= size:
    for i in range (size):
        print ("*" * int(size - (size - num)))
        num += 1

# left-facing triangle
print ("This is the requested left-facing", str(size) + "x" + str(size), "right-triangle:")
space = size - 1
num = 1
while num <= size:
    for i in range (size):
        print (" " * int(space), end=" ")
        space -= 1
        print ("*" * int(size - (size - num)))
        num += 1

print (" ")
print ("---------------")
print (" ")

print ("Lab.5.C. - Say 'please'")
print (" ")
# Write a program that prints the following message:
      # If you would like to stop this program, say “please”.
# Afterwards, prompt the user for input. If the user enters “please”, terminate the program. Otherwise, print the message above and prompt the user to input again. The program should only terminate if the user enters “please”.
while x != "please":
    x = str(input('If you would like to stop this program, say "please": '))
print ("Program complete")
