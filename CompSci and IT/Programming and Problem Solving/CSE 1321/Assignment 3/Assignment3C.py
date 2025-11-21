# Course CSE 1321L
# Section: BJK
# Semester: Fall 2024
# Name: Starlan Davis

# PROMPT:
   # Use loops to fill a 5x5 grid with numbers from 1 to 25
   #  Use nested loops and conditional statements (if, if-else-if, or match) to classify each number as "E" for even or "O" for odd.
   # Print 5x5 grid showing each number along with its classification

grid = 5
num = 1

for i in range(grid):
    for j in range(grid):
        if num % 2 == 0:
            print(f"{num}(E) ", end="")
        else:
            print(f"{num}(O) ", end="")
        num += 1
    print()
