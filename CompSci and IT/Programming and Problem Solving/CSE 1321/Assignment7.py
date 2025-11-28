# Course CSE 1321
# Section: BB
# Semester: Fall 2024

# prompt: https://www.kennesaw.edu/ccse/first-year-experience/cse1321l_python/assignments/cse1321l_assignment7_v2_fall24.pdf

#print("Assignment.7. - Library System with Borrow Limits")


class Book():
    def __init__(self, title, author):
        self.title = " "
        self.author = " "
        self.is_borrowed = False
    def borrow(self):
        if not self.is_borrowed:  # checks if the book has been borrowed or not. if the book is NOT borrowed...
            self.is_borrowed = True  # ...then the status of the book is updated to borrowed (True)
            return "You borrowed the book"                                                              # inform user that they now posses the book
        elif self.is_borrowed:  # checks if the book has been borrowed or not. if the book IS borrowed, then its status will remain True
            return "Book already borrowed"                                                              # inform user that the book is not available / is already checked out
    def return_book(self):
        if self.is_borrowed:  # if the book is borrowed (status is True)...
            self.is_borrowed = False # ...then its status is updated to False
            return "You returned the book"                                          # inform user that they no longer posses the book
        elif not self.is_borrowed:  # if the book os NOT borrowed, nothing changes
            return "Book is not borrowed"                                                               # inform user that they do not posses the book

class Member():
    def __init__(self, name):
        self.name = " "
        self.borrowed_books = []
    def borrow_book(self, book):
        if len(self.borrowed_books) < 3:   # if the user has possesion of less than 3 books / the length of their "borrowed_books" list is less than 3...
            if book in self.borrowed_books:  # ...then the list of the member is checked for possession of the specified book. if the member currently has the book, nothing changes
                return "Book already borrowed by this member"           # user is informed that they already have the specified book
            if book.is_borrowed:       # ...then the status of the book is checked (attribute of class Book).  if the status of "is_borrowed" is True, nothing changes and the book cannot be checked out by the current member
                return "Book already borrowed by someone else"                                # user is informed that someone else currently has the specified book
            else:     # if neither of the previous conditions is True,...
                self.borrowed_books.append(book) # ...the book is added to the member's "borrowed_books" list and...
                book.borrow()   # the "borrow" method of the class Book is called to update the book's status
                return "Book borrowed succesfully"                                                                  # user is informed that they now posses the book
        elif len(self.borrowed_books) >= 3: # if the user has possesion of at least 3 books / the length of their "borrowed_books" list is at least 3...
            return "Borrow limit reached"  # no books are added to their list. the user is informed thatthey cannot check out anymore books
    def return_book(self, book):
        if book not in self.borrowed_books:   # if the book is NOT in the member's list...
            return "Book not borrowed by this member"  # ...nothing changes.  the user is informed that they do not have the specified book
        elif book in self.borrowed_books:   # if the book IS in the member's list...
            self.borrowed_books.remove(book)  # ...the book is removed from the list and...
            book.return_book()  # the "retunr_book" method in class Book is called
            return "Book returned succesfully"                      # the user is informed that they no longer posses the book

# Define a Book and Member for testing
book1 = Book("1984", "George Orwell")
member1 = Member("Alice")

# Scenario 1: Alice borrows the book "1984"
print(member1.borrow_book(book1))

# Scenario 2: Alice tries to borrow "1984" again
print(member1.borrow_book(book1))

# Scenario 3: Alice returns "1984"
print(member1.return_book(book1))

# Scenario 4: Alice tries to return "1984" again
print(member1.return_book(book1))


# Scenario 5: Bob tries to borrow "1984"
member2 = Member("Bob")
print(member2.borrow_book(book1))


# Scenario 6: Alice tries to borrow more than the limit of 3 books
book2 = Book("To Kill a Mockingbird", "Harper Lee")
book3 = Book("The Catcher in the Rye", "J.D. Salinger")
book4 = Book("Pride and Prejudice", "Jane Austen")
book5 = Book("Angus and Sadie", "Cynthia Voigt")

print(member1.borrow_book(book2))
print(member1.borrow_book(book3))
print(member1.borrow_book(book4))
print(member1.borrow_book(book5))
