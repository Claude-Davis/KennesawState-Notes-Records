

# option 1
    # becomes more difficult w/ larger numbers
def fib(n):
    if (n==1) or (n==2):
        result = 1
    else: 
        result = fib(n-1) + fib(n-2)
    return result


# option 2: Memoized Solution
    # uses an array, "memo", to store all calculated numbers for "n"
def fib1(n, memo):
    if memo[n] != null:
        return memo[n]
    
    if (n==1) or (n==2):
        result = 1
    else: 
        result = fib(n-1) + fib(n-2)
    memo[n] = result
    return result



num = int(input("Enter a number: "))
print(" ")

print("Calling fib(" + str(num)+ ")...\t" + str(fib(num)))
print(" ")

memo = []
print("Calling fib1(" + str(num)+ ")...\t" + str(fib1(num, memo)))