# Initialize a variable to keep track of the largest number
largest_number = 0

print("Please enter 10 numbers and this program will display the largest.")

# Use a for loop to ask the user for 10 numbers
for i in range(1, 11):
    # Ask the user for input and convert it to an integer
    num = int(input(f"Please enter number {i}: "))
    
    # Check if the current number is larger than the largest number so far
    if num > largest_number:
        largest_number = num

# After the loop, display the largest number
print(f"\nThe largest number was {largest_number}")
