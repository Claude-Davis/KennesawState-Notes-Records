# Course CSE 1321L
# Section: BJK
# Semester: Fall 2024
# Name: Starlan Davis

print("Lab.6.A.")

width = float(input("Enter width: "))
height = float(input("Enter height: "))

def isValid(width, height):

    def area(width, height):
        area = width * height
        print("The area is: ", str(area))
        return area

    def perimeter(width, height):
        perimeter = 2 * (width + height)
        print("The perimeter is: ", str(perimeter))
        return perimeter

    sum = width + height
    over30 = sum > 30

    if ((sum) > 30):
        print("This is a valid rectangle.")
        area(width, height)
        perimeter(width, height)

        print(" ")
        restart = input("Do you want to enter another width and height (Y/N)?: ")

        if restart == "Y":
            width =float(input("Enter width: "))
            height =float(input("Enter height: "))
            isValid(width, height)
        elif restart == "N":
            print (" ")
            print("Program Ends")

    else:
        print("This rectangle is invalid.")

        print(" ")
        restart = input("Do you want to enter another width and height (Y/N)?: ")
        print(" ")

        if restart == "Y":
            width = float(input("Enter width: "))
            height = float(input("Enter height: "))
            isValid(width, height)
        elif restart == "N":
            print(" ")
            print("Program Ends")

    return over30

isValid(width, height)

print("--------------------------------------------------------------")
print(" ")

print("Lab.6.B.")

num_one = int(input("Enter number 1: "))
num_two = int(input("Enter number 2: "))

from Lab6B_MyMath.py import my_min
my_min(num_one, num_two)

from Lab6B_MyMath.py import my_max
my_max(num_one, num_two)

from Lab6B_MyMath.py import my_avg
my_avg(num_one, num_two)
