/*
        String Methods Used:
        .contains() //checks if a variable contains another string or character (specified or variable for user input)
        .equals()  //checks if a variable is the same/matches another variable's value or specified string
*/

//prompt: https://www.kennesaw.edu/ccse/first-year-experience/cse1322l/labs/1322l-lab-3-v1.pdf

/* Pending updates:
        - case 4: search
                - make the case irrelevant (code takes either lower or uppercase letters)
        - case 4: search
                - fix error: currently only outputs the first match, should output all
*/

import java.util.Scanner;
import java.util.ArrayList; //imports array lists from java package

//class for user's contacts
class Contact {
    //attributes
    public String name;
    public String phoneNum;

    //constructor
    public Contact(String name, String phoneNum){
        this.name=name;
        this.phoneNum=phoneNum;
    }

    //method to display contact info
    public void listAll(){
        System.out.println("Name: " + name + " | " + "Phone: " + phoneNum);
    }
}

//the main class
public class Phonebook{
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        ArrayList<Contact> allContacts = new ArrayList<>(); // creates an array list to hold the objects of the class "Contact"

        System.out.println("[Phonebook]");

        System.out.println("1. Add contact");
        System.out.println("2. Remove contact");
        System.out.println("3. List contacts");
        System.out.println("4. Search contacts");
        System.out.println("5. Quit");

        System.out.print("Enter option: ");
        int option = scan.nextInt();

        //main loop
        while (option != 5){

            switch (option){
                case 1: //add contact
                            System.out.print("Enter the contact's name: ");
                            String name = scan.nextLine();
                            name = scan.nextLine(); //consumes the new line

                            System.out.print("Enter the contact's phone number: ");
                            String phoneNum = scan.nextLine();

                            //create an object of the class "Contact"
                            Contact newContact = new Contact (name, phoneNum);
                            //add the contact to the "allContacts" arraylist
                            allContacts.add(newContact);

                            System.out.println("Contact added.");
                            break;
                case 2: //remove contact
                                System.out.print("Enter contact to remove: ");
                                String removeCon = scan.nextLine();
                                removeCon = scan.nextLine();

                                for (int i = 0; i <= allContacts.size(); i++) { //initialize the value of i as 0; cont' loop until i is equal to the size of the list; increase i by 1 with each loop
                                    if (allContacts.get(i).name.equals(removeCon)) { //if the "name" variable of "i" (the current element w/in the allContacts list) matches the input for "removeCon"
                                        allContacts.remove(i); //the element (name and phoneNum) is removed from the list

                                        System.out.println("Contact removed.");
                                        break;
                                    }
                                    else if (false){
                                        System.out.println("No contact with that name.");
                                    }
                                }
                            break;
                case 3: //list contacts
                            if (allContacts.size() > 0) {
                                System.out.println("Listing all contacts...");

                                //display all contacts using the method in the class, "Contact"
                                for (Contact x : allContacts) { //format: for (ClassName elementVariable : ListName)
                                    x.listAll(); //calls the "listAll" method for the Contact class
                                }

                                System.out.println("Done listing contacts.");
                                break;
                            } else if (allContacts.size() == 0){
                                System.out.println("The phonebook is empty.");
                            }
                            break;
                case 4: //search contacts
                            /*System.out.print("Enter keyword: ");
                            String key = scan.nextLine();
                            scan.nextLine();

                            for (int i=0; i < allContacts.size(); i++){
                                if (allContacts.get(i).name.contains(key)){
                                    System.out.println("Name: " + allContacts.get(i).name + " | " + allContacts.get(i).phoneNum);
                                }
                            }
                            break; */ //(here for reference) this section of code prints every object w/in the arraylist

                            System.out.print("Enter keyword: ");
                            scan.nextLine();
                            String key = scan.nextLine();

                            for (Contact c : allContacts){ //for-each loop; for each object (or element of the Contact class), w/in the allContacts list...
                                if (c.name.contains(key)){ //if the name includes the user's key...
                                    System.out.println("Name: " + c.name + " | " + c.phoneNum);
                                    break;
                                } else {
                                    System.out.println("No contacts contained the keyword.");
                                    break;
                                }
                            }
            }
            optionsList();
            System.out.print("Enter option: ");
            option = scan.nextInt();
        }
        System.out.print("Shutting off...");
    }

    //method for main menu
    public static void optionsList(){
        System.out.println(" ");

        System.out.println("1. Add contact");
        System.out.println("2. Remove contact");
        System.out.println("3. List contacts");
        System.out.println("4. Search contacts");
        System.out.println("5. Quit");
    }
}
