# Course CSE 1321L
# Section: BJK
# Semester: Fall 2024
# Name: Starlan Davis

print("Assignment.6.A. - Sorting with Bubble Sort")
print(" ")

num = input("Enter numbers separated by space: ")  # take input from user for the list
numbers = list(map(int, num.split()))  # convert input into int type using split() function


# takes in numerical parameters and performs bubble sort on the list
def bubble_sort(numbers):
    n = len(numbers)  # calculates the length of "numbers" list
    for i in range(n):  # starts a loop that iterates "n" times whre "i" is the loop variable
        for z in range(n-i-1):  # starts a loop that iterates from the first # in the "numbers" list to the last. "z" is used to compare the next elements in the list. the range n-i-1 ensures that, with each pass through the list, the last "i" elements are already sorted and can be ignored moving forward.
            if numbers[z] > numbers[z+1]:   # checks if the current element is greater than the nexy element. if True, the elements need to be swapped.
                numbers[z], numbers[z+1] = numbers[z+1], numbers[z]   # swaps the two elements if the previous condition is trie. uses tuple unpacking to simultaneously assign the values, effective;y placing the larger number in the correct position
    return numbers

sort = bubble_sort(numbers)
print("Sorted List: " + str(sort))


# takes in a list of numbers and counts how many positives are present
def count_positive(numbers):
    countP = 0  # initializes the counter
    n = len(numbers)
    for i in range(n):
        if numbers[i] >= 0:  # checks if the # in the list is greater than or equal to 0 (i.e. if it is positive)
            countP += 1   # if the above condition is True, the counter increases by 1
    return countP

counterP = count_positive(numbers)
print("Positive Numbers: " + str(counterP))


# takes in a list of numbers and counts how many negatives are present
def count_negative(numbers):
    countN = 0  # initializes the counter
    n = len(numbers)
    for i in range(n):
        if numbers[i] < 0:  # checks if the # in the list is less than 0 (i.e. if it is negative)
            countN += 1   # if the above condition is True, the counter increases by 1
    return countN

counterN = count_negative(numbers)
print("Negative Numbers: " + str(counterN))

print(" ")
print("---------------------------------------------")
print(" ")


print("Assignment.6.B. - Dungeon Treasure Map")
print(" ")

import random

width = int(input("Enter dungeon width: "))
height = int(input("Enter dungeon height: "))

board = []

numberOfUndiscoveredTreasures = 0  # initializes the count to track the number of undiscovered treasures

# hides the treasures
for r in range (height):
    board_row = []
    for c in range (width):
        rand_num = random.random()      # generates a random float between 0 and 1 for EACH element until the user-assigned width is reach
        if rand_num >= 0.7:   # if the randomly generated number is 0.7 or higher, the letter assigned to the array T, indicating the presence of a treasure
            board_row.append("T") # inserts the 'T'
            numberOfUndiscoveredTreasures += 1  # increases the count of undiscoverded treasure
        else:
            board_row.append("O")
    board.append(board_row)

print("Treasures are hidden in", str(numberOfUndiscoveredTreasures), "locations.")
print(" ")

row_max_range = height - 1
column_max_range = width - 1

while numberOfUndiscoveredTreasures > 0:
    check_row = int(input("Enter row to check(0-" + str(row_max_range) + "): "))
    check_column = int(input("Enter a column to check (0-" + str(column_max_range) + "): "))

    if 0 <= check_row < len(board) and 0 <= check_column < len(board[0]):
        if board[check_row][check_column] == "T":
            print(f"You found a treasure at ({check_row},{check_column})!")
            board[check_row][check_column] = "X"        # the located treasure is replaced with the letter X
            numberOfUndiscoveredTreasures -= 1
        else:
            print(f"No treasure found at ({check_row},{check_column}). Try again.")
    else:
        print("Invalid coordinates! Please enter acceptable values.")

for r in board:         # prints out the array "board"
    print(" ".join(r))
