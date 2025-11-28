# range . "Times Table Generator
num = int(input("Which times table do you want?: "))
for line in range (13):  # "line" does not really mean anythin on its own. it can be replaced with just about any word.
  print (line, "x", num, "=", (num * line), " | ", end="")
###
for num in range (0, 50, 7):
  print (num)


# while loop
num = 75
while num < 101:
    print (num)
    num += 1
###
counter = 0
while counter <= 10:
  print ("This is a message")
  counter += 1
###
num = 75
while num < 101:
    print (num)             # this loop is INFINITE


# nested loops
count1 = 1
while count1 <= 10:
    count2 = 1
    while count2 <= 5:
        print (str(count1), ".", str(count2), "text")
        count2 += 1
    count1 += 1
  ###
sum = 0
num = 0
while (num < 20):
    num += 1
    sum = sum + num
    if (sum >= 100):           # STOP if sum is over 100
        break
print ("The # is", str(num))
print ("The sum is", str(sum))


# BREAK
count1 = 1
while count1 <= 10:
    count2 = 1
    while count2 <= 5:
        print (str(count1), ".", str(count2), "text")
        count2 += 1
    break                    # stops the program after the 1st while loop runs once
    count1 += 1
  ###
  sum = 0
num = 0
while (num < 20):
    num += 1
    sum = sum + num
    if (sum >= 100):           # STOP if sum is over 100
        break
print ("The # is", str(num))
print ("The sum is", str(sum))


# CONTINUE
count1 = 1
while count1 <= 10:
    count2 = 1
    while count2 <= 5:
        print (str(count1), ".", str(count2), "text")
        count2 += 1
    continue                 #causes the program to run only the first while loop, while count1 = 1, abd for an infinite number of times
    count1 += 1
  ###
  sum = 0
num = 0
while (num < 20):
    num += 1
    sum = sum + num
    if (sum >= 100):           
        continue
print ("The # is", str(num))
print ("The sum is", str(sum))
