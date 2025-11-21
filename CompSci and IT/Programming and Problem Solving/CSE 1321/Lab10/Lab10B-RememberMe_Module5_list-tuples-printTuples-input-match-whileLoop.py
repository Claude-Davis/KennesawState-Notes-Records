# Course CSE 1321
# Section: BB
# Semester: Fall 2024

# prompt: https://view.officeapps.live.com/op/view.aspx?src=https%3A%2F%2Fwww.kennesaw.edu%2Fccse%2Ffirst-year-experience%2Fcse1321l_python%2Flabs%2Flab10-sequence-types.docx&wdOrigin=BROWSELINK

#print("Lab.10.B. - Remember Me")

friend_list = []

def options():
    print("1 - Add Friend")
    print("2 - List Friends")
    print("3 - Quit")

print("FRIEND LIST")
options()
select = input("Make your selection: ")

run_program = True  # this code is used alongside the code under "case 3" to continue the while loop

while run_program: # this while loop only works while the value for "run_program" is True

    match select:
        case "1":
            name = input("Enter your friend's name: ")
            age = input("Enter your friend's age: ")

            friend_tuple = ("Name: " + name, "Age: " + age)  
            friend_list.append(friend_tuple)   # the tuple "friend_tuple" is added to the list "friend_list"
            print("Friend Added")
            print(" ")

            # the two lines below print the starting options list and the user's option to input ("select") in order to continue the loop
            options()
            select = input("Make your selection: ")
        
        case "2":
            for friend in friend_list:
                print(f"{friend[0]}, {friend[1]}")   # this line prints the content of the "friend_tuple" that are located in the "friend_list"
                    # "friend[0]" accesses the content in the first index of the tuple and "friend[1]" accesses the content in the second index of the tuple
                    # the "f" indicates an f-string which allows for the insertion of variablses directly into the string
            print(" ")

            # the two lines below print the starting options list and the user's option to input ("select") in order to continue the loop
            options()
            select = input("Make your selection: ")

        case "3":
            print("Shutting down...")
            run_program = False  # if the user inputs "3", the value of "run_program" is updated to False the while loop is stopped
