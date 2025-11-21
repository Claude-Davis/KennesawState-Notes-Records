# Course CSE 1321
# Section: BB
# Semester: Fall 2024

# prompt: https://view.officeapps.live.com/op/view.aspx?src=https%3A%2F%2Fwww.kennesaw.edu%2Fccse%2Ffirst-year-experience%2Fcse1321l_python%2Flabs%2Flab10-sequence-types.docx&wdOrigin=BROWSELINK

#print("Lab.10.A. - Sign Me Up")


email_list = []

def options():
    print("1 - Add Email")
    print("2 - Delete email")
    print("3 - List All Emails")
    print("4 - Quit")

print("MAILING LIST")

options()
select_option = input("Please make your selection: ")


code_run = True
while code_run:
    match select_option:
        case "1":
            email = input("Enter the email to be added: ")
            email_list.append(email)
            print("Email added to mailing list.")
            print(" ")

            options()
            select_option = input("Please make your selection: ")
            

        case "2":
            email = input("Enter the email to be removed: ")

            if email not in email_list:
                print('The email address "' + email + '" does not appear in the mailing list.' )
                print(" ")
            elif email in email_list:
                email_list.remove(email)
                print("Email removed from mailing list.")
                print(" ")

            options()
            select_option = input("Please make your selection: ")

        case "3":
            for email in email_list:
                print(email)
            print(" ")

            options()
            select_option = input("Please make your selection: ")
            
        case "4":
            print("Shutting down...")
            code_run = False
    
