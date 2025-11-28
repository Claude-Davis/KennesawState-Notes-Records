# Course CSE 1321L
# Section: BJK
# Semester: Fall 2024
# Name: Starlan Davis

numInput = int(input("Enter a positive number: "))

num = 1

for i in range(1, numInput + 1):
 for j in range(i):
    print(num, end=" ")
    num += 1
    print()
