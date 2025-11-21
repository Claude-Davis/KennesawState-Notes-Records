# Course CSE 1321
# Section: BB
# Semester: Fall 2024

# prompt: https://view.officeapps.live.com/op/view.aspx?src=https%3A%2F%2Fwww.kennesaw.edu%2Fccse%2Ffirst-year-experience%2Fcse1321l_python%2Flabs%2Flab11-sequence-types.docx&wdOrigin=BROWSELINK
    # this program locates the position of a letter within a given word/phrase

#print("Lab.11.B. - Show Me Where It Is")


def letterPositions(phrase, letter):   
    #creates a list to store the index later. this list will be added to a tuple (which is what is really wanted/required). a list is used first because, once a tuple is created it cannot be edited (in this case, we need something that can be added to).
    positions = []

    if letter.isupper():                                    # "if the letter (provided by the user) is uppercase,"
        phrase = phrase.upper()                             # "then the phrase (provided by the user) is made all uppercase."
    if letter.islower():                                    # "if the provided letter is lowercase,"
        phrase = phrase.lower()                             # "then the provided phrase is made all lowercase."
# this conversion of the phrase is necessaryto be able to detect the letter in the following lines and avoid any issues in the case that the given phrase contains both upper and lowercase letters.

            #range(len(phrase)) : the length of the given phrase is determind and "range" gives the range of the phrases length {example: the phrase "no thanks" has the range(0,9)}
    for l in range(len(phrase)):                            # "loop over each index in the given phrase."
        if phrase[l] == letter:                             # "if the item/character within the phrase matches (or is equal to) the given letter,"
            positions.append(l)                             # "the index of that item/character is added to the created list"


    letterPositions_tuple = tuple(positions)                # "a tuple is created and the contents of the list are copied and placed into the tuple"
    return letterPositions_tuple
    # the "return" line makes to so that, when the method is called and after all the previous actions are performed, then that which is returned (in this case "letterPositions_tuple") is sent to where the method is called and, if there is a print statenebt, it can be displayed.

phrase = input("Enter your phrase: ")
letter = input("Enter your letter: ")

print(letter, "appears in your phrase in the following positions:", letterPositions(phrase, letter))
print(range(len(phrase)))
