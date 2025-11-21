# Starlan Davis
# Lab #9
# Due: 8 July 2025
# Purpose: program for password verification
# Resources: used github copilot to learn/remind myself of certain ethods (ex: isdigit())

def capsCasing_check(contrasena):
    upper_case_char = False
    for A in contrasena:
        if A.isupper():
            upper_case_char = True
            return upper_case_char
        
def lowerCasing_check(contrasena):
    lower_case_char = False
    for a in contrasena:
        if a.islower():
            lower_case_char = True
            return lower_case_char
    
def number_check(contrasena):
    number_present = False
    for n in contrasena:
        if n.isdigit():
            number_present = True
            return number_present
        
def specialChar_check(contrasena):
    specialChar_present = False
    for s in contrasena:
        if (s == "!") or (s == "@") or (s == "#") or (s == "$") or (s == "%") or (s == "/"):
            specialChar_present = True
            return specialChar_present
        elif (s == "*") or (s == "(") or (s == ")") or (s == "-") or (s == "_"):
            specialChar_present = True
            return specialChar_present





cont = 0

while (cont != 1):
    password = input("Password: ")

    lower_case_char = lowerCasing_check(password)
    upper_case_char = capsCasing_check(password)
    number_present = number_check(password)
    specialChar_present = specialChar_check(password)

    if (len(password) < 9):  # verify length of password
        print("Invalid Password")

    elif (len(password)>=9):
        if ((not lower_case_char) or (not upper_case_char)):   # verify presence of lower and upper case letters
            print("Invalid Password")

        elif (lower_case_char and upper_case_char):  
            if(not number_present):     # very presence of a number
                print("Invalid Password")

            elif (number_present):
                if (not specialChar_present):   # verify presence of a special character
                    print("Invalid Password")

                elif (specialChar_present):
                    print("Valid Password")
                    cont = 1