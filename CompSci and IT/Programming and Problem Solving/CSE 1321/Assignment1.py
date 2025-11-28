# Course CSE 1321L
# Section: BJK
# Semester: Fall 2024
# Name: Starlan Davis
# Date: 19 August 2024

# Module 1:  I/O and Variables, Types, Operator, and Expressions

print ("Assignment.1.A - Construct A Mailing Address")

# request user info for address
name = input("Name: ")
street = input("Street Address: ")
city = input("City: ")
state = input("State: ")
zip = input("Zip Code: ")

# space
print (" ")

# output mailing address
print ("Your mailing address is:")
print (name)
print (street)
print (city + ", ", state, zip)


print (" ")
print ("------------------------------------------------")
print (" ")


print ("Assignment.1.B - Loan Payment Calculator")

# request loan info
principal = input ("Enter the loan amount: ")
rate = input ("Enter the annual interest rate (in %): ")
term = input ("Enter the loan term (in years): ")

# calculations
rateMonthly = (int(rate) / 12) /100
numerator = int(principal) * float(rateMonthly) * ((1 + float(rateMonthly))**(12 * int(term)))
denominator = ((1 + float(rateMonthly))**(12 * int(term))) - 1
payment = float(numerator) /  float(denominator)

# monthly payment
print ("Your monthly payment is: $" + str(round(payment, 2)))


print (" ")
print ("------------------------------------------------")
print (" ")


print ("Assignment.1.C - Body Mass Index (BMI) Calculator")

kilo = float(input("Enter your weight in kilograms: "))
centi = float(input("Enter your height in centimeters: "))

# calculations
height = float(centi) / 100
bmi = float(round((kilo / (height**2)), 1))

print ("Your BMI is:", bmi)

# categories
if (bmi < 18.5):
    print ("You are classified as: 1 weight")
if (18.5 <= bmi <= 24.9):
    print ("You are classified as: 2 weight")
if (25 <= bmi < 30):
    print("You are classified as: 3 weight")
if (bmi >= 30):
    print("You are classified as: 4 weight")
