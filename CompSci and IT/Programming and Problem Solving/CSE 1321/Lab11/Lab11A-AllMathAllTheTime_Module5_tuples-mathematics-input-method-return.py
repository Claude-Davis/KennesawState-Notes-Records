# Course CSE 1321
# Section: BB
# Semester: Fall 2024

# prompt: https://view.officeapps.live.com/op/view.aspx?src=https%3A%2F%2Fwww.kennesaw.edu%2Fccse%2Ffirst-year-experience%2Fcse1321l_python%2Flabs%2Flab11-sequence-types.docx&wdOrigin=BROWSELINK

#print("Lab.11.A. - All Math, All the Time")

def allMath():   # when called, this method will perform a series of math equations
    addition = num1 + num2
    subtraction = num1 - num2
    multiplication = num1 * num2
    if num2 == 0:  # the user's second int input is a 0...
        division = None  # "None" is saved to division
        floor_division = None   # "None" is saved to floor division
        modulus = None    # "None" is saved to modulus
    # these variables are given the value "None", because a number divided by 0 would otherwise evoke an error. 
    else:
        division = num1 / num2
        floor_division = num1 // num2
        modulus = num1 % num2
    power = pow(num1, num2)
    #power = num1**num2   # alternative to the line above

    allMath_tuple = (addition, subtraction, multiplication, division, floor_division, modulus, power)

    return allMath_tuple

num1 = int(input("Enter your first number: "))
num2 = int(input("Enter yiur second number: "))

print("Your resulting tuple is", allMath())
