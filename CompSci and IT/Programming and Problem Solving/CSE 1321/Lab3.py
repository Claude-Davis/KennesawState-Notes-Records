# Course CSE 1321L
# Section: BJK
# Semester: Fall 2024
# Name: Starlan Davis
# 14 August 2024

print ("Lab.3.A - Credit Cards")

# request credit card balance and APR from user
balance = int(input ("Amount Owed: $ "))
apr = float(input("APR: "))

# calculate apr to decimal
apr = float(apr / 100)

# calculate and print monthly percentage rate
monthlyRate = (apr / 12) * 100
print ("Monthly Percentage Rate: " + str (round(monthlyRate, 3)))   # rounds monthlyRate to 3 decimal points

# calculate and print Minimum Payment
minPayment = balance * apr / 12
print ("Minimum Payment: $ " + str(round(minPayment, 2)))


print ("---------------------------------")


print ("Lab.3.B - GPA Calculator")

# Number of hours and quality points earned for 4 courses
course1 = input("Course 1 hours: ")
grade1 = input("Grade for course 1: ")

course2 = input("Course 2 hours: ")
grade2 = input("Grade for course 2: ")

course3 = input("Course 3 hours: ")
grade3 = input("Grade for course 3: ")

course4 = input("Course 4 hours: ")
grade4 = input("Grade for course 4: ")

# calculate total course hours
totalH = int(course1) + int(course2) + int(course3) + int(course4)
print ("Total hours: " + str(totalH))

# calculate total points
totalP = (int(course1) * int(grade1)) + (int(course2) * int(grade2)) + (int(course3) * int(grade3)) + (int(course4) * int(grade4));
print ("Total quality points: " + str(totalP))

# calculate GPA
gpa = int(totalP) / int(totalH)
gpa = float(gpa)
print ("Your GPA for this semester is " + str(round(gpa, 2)))


print ("---------------------------------")


print ("Lab.3.C - Sandwich Cooking Time")

# request amount of each sandwhich
small = input("Enter the number of small sandwiches: ")
medium = input("Enter the number of medium sandwiches: ")
large = input("Enter the number of large sandwiches: ")
xl = input("Enter the number of extra-large sandwiches: ")

# space
print (" ")

# confirm amount of each sandwhich
print ("You've entered " + str(small) + " small sandwiches")
print ("You've entered " + str(medium) + " medium sandwhiches")
print ("You've entered " + str(large) + " large sandwches")
print ("You've entered " + str(xl) + " extra-large sandwiches")

# space
print (" ");

# calculate and print total cooking time
smallT = int(small) * 30
medT = int(medium) * 60
largeT = int(large) * 75
xlT = int(xl) * 135
total = int(smallT) + int(medT) + int(largeT) + int(xlT)

mins = int(total) / 60
secs = int(total) % 60

print ("Total cooking time is " + str(int(mins)) + " minutes and " + str(secs) + " seconds.")
