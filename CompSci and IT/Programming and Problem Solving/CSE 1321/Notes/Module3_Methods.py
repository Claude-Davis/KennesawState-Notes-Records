## myFunction and sumNumbers have REQUIRED PARAMETERS
def myFunction(num1, num2):          # defines a method called "myFunction"
    avg = (num1 + num2)/2
    print ("average is", str(avg))

myFunction(num1=67, num2=5)
myFunction(num1=4, num2=9)

# print ("--------------------------------------------")

def sumNumbers (num1, num2):
    sum = 0
    for i in range (num2):
        sum += num1

    return sum

print ("--------------------------------------------")
print ("--------------------------------------------")

## theName has an OPTIONAL PARAMETER
def theName(name = "Tanya"):
    print (name)

theName()
theName("Stallan")

print ("--------------------------------------------")
print ("--------------------------------------------")

## twoParas has both an OPTIONAL AND REQUIRED PARAMETER
def twoParas(name, age=22):
    print(name, "is", str(age), "years old.")


twoParas(name="Sandy", age=30)
twoParas(name="Jeneane", )



print ("--------------------------------------------")
print ("--------------------------------------------")



# no value is stored, but the sum is printed on the screen
# returns no output and cannot be used elsewhere in the program
def sumNumbers (num1, num2):
    sum = 0
    for i in range (num2):
        sum += num1
    print(sum)

print ("--------------------------------------------")
print ("--------------------------------------------")
print ("--------------------------------------------")


def name(n1, n2, n3 = "Kathy"):
    print(n1 + ", " + n2 + ", and " + n3, "are going to Texas.")
    print(str.capitalize(n1) + ", " + str.capitalize(n2) + ", and " + str.capitalize(n3), "are going to Texas." )

name(n1="jorge", n2="jazzy", n3="jack")

print(" ")

name(n1="steve", n2="alex", )
