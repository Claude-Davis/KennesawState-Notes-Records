# Write two programs to operate on variables a, b, and c.
# The first program will write all three variables to a file,
# the second will read the file and place the data back into the three respective variables.

a = 10
b = 24.12
c = "1423"  # This is a string

delim = ","

fout = open("data.txt", "w")

fout.write(str(a) + delim) # Remember that the .write() method will only accept one (1) single string.
fout.write(str(b) + delim) # It will aslo only write exactly what is given to it. It will not add
fout.write(c + delim)      # any additional characters, unlike the print() method

fout.close()

# ----------------------------------------------------------

a2 = None
b2 = None
c2 = None

fin = open("data.txt", "r")

file_data = fin.readline()           # Read in a single line (int this case it containes all our data)
data_parts = file_data.split(",")    # Split on a comma (the delimiter we decided on up above)

a2 = data_parts[0]
b2 = data_parts[1]
c2 = data_parts[2]

print(a, a2)
print(b, b2)
print(c, c2)