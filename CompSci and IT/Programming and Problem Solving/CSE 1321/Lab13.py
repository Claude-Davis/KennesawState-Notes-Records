# Course CSE 1321
# Section: BB
# Semester: Fall 2024

# Prompt: https://www.kennesaw.edu/ccse/first-year-experience/cse1321l_python/labs/cse1321l_lab13.pdf



#print("Lab.13. - Weather Analyzer")

def Heat_Waves():
    list0 = []  # this list will be a temporary place holder to track temperatures above 30 degrees; it will be emptied repeatedly
    heatWaves_list = []  # this list will hold the # of days for each heat wave (3+)
    for t in temps_list:  # this line iterates over each temperature input in the list "temps_list"
        if t > 30:
            list0.append(t)  # if a number in "temps_list" is above 30, it is placed into "list0"
        elif t <= 30:  # if a number is less than or equal to 30, the previous condition stops
            if len(list0) > 2: # checks if the length of "list0" is greater than 2
                heatWaves_list.append(1)  # if the length of "list0" is greater than 2, then the # 1 is added to the list "heatWaves_list"
            list0.clear()  # "list0" is cleared
    if len(list0) > 2: # checks if the length of "list0" is greater than 2 AFTER all temperatures have been iterated over (this line takes into consideration if the last temps are a heat wave)
        heatWaves_list.append(1)  # if the length of "list0" is greater than 2, then the # 1 is added to the list "heatWaves_list"
    heatWave_count = sum(heatWaves_list)  # all of the 1's (each 1 represents a heat wave occurence) are added up and the value is saved to the variable"heatWave_count"
    print("Number of heat waves:", (heatWave_count))

def Cold_Streak():
    list0 = []  # this list will be a temporary holder to track temperatures under 15 degrees; it will be emptied repeatedly
    coldStreak_list = []  # this list will hold all of the streaks for cold days under 15 degrees
    for t in temps_list:  # this line iterates over each temperature input in the list "temps_list"
        if t < 15:
            list0.append(t)  # if a temperature is under 15 degrees, then the number is added to the list "list0". this continues until a number is >= 15
        elif t >= 15: # if a number is >= 15, the previous condition stops
            streak = len(list0)  # the current length of "list0" is recorded and the value is saved to the variable "streak". this variable will continue to be updated (aka, its value will change)
            coldStreak_list.append(streak)  # the value saved to "streak" is placed into the list "coldStreak_list"
            list0.clear()   # "list0" is cleared/emptied in order to begin tracking the next streak of cold days
    record = max(coldStreak_list)  # after all values in "temps_list" have been iterated over, the greatest value in "coldStreak_list" is saved to the variable "record". this is the longest cold streak
    print("Longest cold streak:", str(record), "days")

def Average():
    sum_of_temps = sum(temps_list) # all of the values in the list "temps_list" are added together and the sum is saved to "sum_of_temps"
    days = len(temps_list)  # the length of the list "temps_list" is saved to "days"
    avg = round(sum_of_temps/days, 2)   # the average is found by dividing the sum by "days". the value (a float type) is rounded to 2 decimal places
    print("Average temperature:", str(avg) + "°C")


# takes in input and places it directly into a list. split() handles the spaces and converts each part to an int value
temps_list = [int(x) for x in input("Enter temperatures for each day separated by space: ").split()]

Heat_Waves()
Cold_Streak()
Average()
