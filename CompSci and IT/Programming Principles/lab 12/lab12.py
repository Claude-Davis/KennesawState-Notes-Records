# Lab12.py
# IT1114/Section W01
# Starlan Davis
# Lab #12
# Due: 22 July 2025
# Purpose: analyze grades in files
# Resources: https://www.youtube.com/watch?v=Uh2ebFW8OYM, AI for specific questions/debugging aid



# Function for grade conversion
def grade_conversion(letter):
    if letter == 'A':
        return 100
    elif letter == 'B':
        return 89
    elif letter == 'C':
        return 79
    elif letter == 'D':
        return 74
    elif letter == 'F':
        return 69

section_grades = {}

# Read file and sort grades into section arrays
with open("grades.txt", "r") as file:
    for line in file:
        parts = line.strip().split("\t")
        if len(parts) != 3:
            continue
        id, section_num, letter_grade = parts
        section = int(section_num)

        # create list for section if it doesn't exist
        if section not in section_grades:
            section_grades[section] = []

        # add the letter grade to appropriate section list
        section_grades[section].append(letter_grade)

# convert grades and calculate avg
for section in sorted(section_grades.keys()):
    letter_list = section_grades[section]
    numeric_list = []

    for letter in letter_list:
        numeric_list.append(grade_conversion(letter))

    average = sum(numeric_list) / len(numeric_list)
    print(f"Section {section} average: {average}")
