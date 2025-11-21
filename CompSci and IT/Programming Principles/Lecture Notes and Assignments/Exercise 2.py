# Write a program that accepts four departmental totals and calculates the
# percentage each department contributed to the overall total.
# Ex: If the department totals are as follows:
# D1 - $500, D2 - $500, D3 - $500, D4 - $500
# Result:
# D1 - %25
# D2 - %25
# D3 - %25
# D4 - %25


# User input 4 department totals
d1 = input("Total for department 1: ")
d1 = float(d1)

d2 = input("Total for department 2: ")
d2 = float(d2)

d3 = input("Total for department 3: ")
d3 = float(d3)

d4 = float(input("Total for department 4: "))

# Overall total = add all department totals
overall_total = d1 + d2 + d3 + d4

# Calculate department percentages
# D1 percentage = (d1 / total) * 100
print("Department 1: ", (d1 / overall_total) * 100)
print("Department 2: ", (d2 / overall_total) * 100)
print("Department 3: ", (d3 / overall_total) * 100)
print("Department 4: ", (d4 / overall_total) * 100)
