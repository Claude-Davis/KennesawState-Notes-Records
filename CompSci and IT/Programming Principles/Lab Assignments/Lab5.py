# Lab5.py
# IT1114/Section W01
# Starlan Davis
# Lab #5
# Due: 24 June 2025
# Purpose: The program will check if a given number is a prime number.
# Resources:


def is_prime(num):
    if num == 1: # ensures that an input of 1 makes the function False
        return False
    for i in range(2, num): # divides the given number by all numbers from 2 to num-1
        if num % i == 0: # if the quotient is not a whole number/if it has a remainder, the functoin is False (not prime)
            return False
    return True

num = int(input("Enter Number: "))

if is_prime(num):
    print(str(num) + " is prime")
else:
    print(str(num) + " is not prime")
