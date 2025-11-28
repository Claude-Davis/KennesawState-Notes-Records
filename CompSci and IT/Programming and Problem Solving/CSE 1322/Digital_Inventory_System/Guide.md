# Classes & Subclasses

## Subclasses of Item:
- Software
- DigitalGood

## Sublclasses of Software:
- VideoGame
- DevelopmentKit

## Subclasses of DigitalGood:
- Tradable
- Collectable

## Pimary class: Main

-------

# All Imports

## Scanner (saved as "scan")
- Imported and used in the Main file and to allow for inputs.

## ArrayList (saved as "items" and "targetPlatforms"(x2))
- imported in both the Main and DevelopmentKit files.
    - Main, "items": Used to create an ArrayList of the Item class that would be used to store **ALL** objects that the user creates with the program.
    - Main, "targetPlatforms": Used to create an ArrayList of type String that wpuld be used in case 2 to store the user's platform names and then create an object of the DevelopmentKit class.
    - DevelopmentKit, "targetPlatforms": Used to create the attribute targetPlatforms to later store several String type inputs (platform names).

## DecimalFormat (saved as "df")
- Imported in Item file and used in all files, except Main, in the toString() methods to format prices in the pattern "0.00".

-------

# Overview of File, "Main"

## Loops
- Uses a **while** loop to <ins>continue the entire program</ins> until the user inputs the number corresponding to the "Quit Program" option.
- **while** loop in case 2 that <ins>allows the user to continue submitting names</ins> for platforms (which are being saved to the "targetPlatforms" ArrayList) <ins>until the user inputs an empty String</ins>.
- Case 5 uses a **for** loop that <ins>continues running the encapsulated code until</ins> integer variable "i" is equal to the current size of the "items" ArrayList. This case, also, contains a **while** loop within the for loop that, <ins>while "i" does not equal the size of "items", continues to retrieve and print the elements of "items"</ins> using their respective toString() methods according to the index (which is determined by current the value of "i"); it then increases the value of "i" by 1 and continues the loop.
- Case 6 uses a **for** loop to <ins>continue running the encapsulated code until</ins> integer variable "i" is equal to the current size of the "items" ArrayList.

## Conditional Statements
- Uses a **switch** statement to allow the user to dictate what section of code the program runs based in his/her integer input for the variable "choice".
- Case 6 uses two (2) **if** statements. The first runs its encapsulated code if the id# chosen by the user matches the id# of an element within "items". the second runs only if, after searching through all the elements within "items" using the for loop, no element's id# was found to match the id# given by the user.

---

# Overview of All Other Files

## Item
This class contains the attributes "price", "id", "nextId", and "name" that are used by the all remaining classes.

Each of these attributes are used by all objects created in the Main class, the exception being "nextId" which is used only update "id" and provide each object initiated with its own id#.

This class contains a setter for "price" that utlizes an **if-else** statement in order to prevent the user from assigning a negative price to any object. If the user inputs a number greater than 0, that price is given to the object, otherwise it is multiplied by -1 and made into the positive value of the given number.

## Software

## VideoGame

## DebelopmentKit

## DigitalGood

## Tradable

## Collectable