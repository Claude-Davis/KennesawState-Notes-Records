# Lab11.py
# IT1114/Section W01
# Starlan Davis
# Lab #11
# Due: 15 July 2025
# Purpose: program that creates and edits a text file.
# Resources: Module 10-1 File IO slides; google search

def create_file():
    with open("users.txt", "w") as user_file:
        user_file.write("")

def add_user(name):
    with open("users.txt", "a") as user_file:
        user_file.write(name + "/n")

def update_user(oldUser, newUser):
    with open("users.txt", "r") as user_file:     # opens and reads the file (ln 18-19)
        x = user_file.read()
    x= x.replace(oldUser, newUser)                  # replaces all occurenences of "oldUser" with "newUser"

    with open("users.txt", "w") as user_file:      
        user_file.write(x)                      # writes the updated str back into the file


def remove_user(name):
    with open("users.txt", "r") as user_file:     # opens and reads the file and saves each line into a list called "lines" (ln 27-28)
        lines = user_file.readlines()


  # overwrites the file
    with open("users.txt", "w") as user_file:   
        for line in lines:
            if line.strip() != name:   # rewrites every line except the one whose content matches "name"
                user_file.write(line)
