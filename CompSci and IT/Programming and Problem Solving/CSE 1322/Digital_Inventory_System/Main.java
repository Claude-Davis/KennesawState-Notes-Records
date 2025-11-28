package Digital_Inventory_System;

import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
        //imports
        Scanner scan = new Scanner (System.in);
        ArrayList<Item> items = new ArrayList<>();  //creates an arraylist of Item (class)
        ArrayList<String> targetPlatforms = new ArrayList<>(); //for use in case 2, for DevelopmentKit

        //title
        System.out.println("[VaporStore Item System]");
        System.out.println(" ");

        //initiate "choice"
        int choice = 0;

        //main loop
        while (choice != 7){
            //menu
            System.out.println("1. Add Video Game");
            System.out.println("2. Add Development Kit");
            System.out.println("3. Add Tradable");
            System.out.println("4. Add Collectable");
            System.out.println("5. List All Items");
            System.out.println("6. Update Price");
            System.out.println("7. Quit Program");

            System.out.print("Enter option: ");
            choice = scan.nextInt();

            switch (choice){
                default:
                    if (choice != 7){System.out.println("Invalid Entry.");}

                    System.out.println(" ");
                    break;
                case 1: //VideoGame , creating a VideoGame object
                    System.out.println(" ");

                    //prompt user for necessary info
                    System.out.print("Enter name of item: ");
                    scan.nextLine();
                    String name = scan.nextLine();
                        System.out.print("Enter price of item: $");
                        double price = scan.nextDouble();
                            System.out.print("Enter name of publisher: ");
                            scan.nextLine();
                            String publisher = scan.nextLine();
                                System.out.print("Does this game have multiplayer support? ");
                                String multiplayerSupport = scan.nextLine();

                    //create object (VideoGame)
                    VideoGame newGame = new VideoGame(name, price, publisher, false); //initiate multiplayerSupport to false to create object
                    //call setters
                    newGame.setName(name);
                    newGame.setPrice(price);
                    newGame.setPublisher(publisher);
                    newGame.setSupport(multiplayerSupport);  //user setter to determine actual value of multiplayerSupport
                    //add the object the arraylist "items"
                    items.add(newGame);
                    System.out.println("Item added.");

                    //System.out.println(newGame.toString());           //debugging purposes

                    System.out.println(" ");
                    break;

                case 2: //DevelopmentKit
                    System.out.println(" ");

                    //prompt user for info
                    System.out.print("Enter name of item: ");
                    scan.nextLine();
                    name = scan.nextLine();
                        System.out.print("Enter price of item: $");
                        price = scan.nextDouble();
                            System.out.print("Enter name of publisher: ");
                            scan.nextLine();
                            publisher = scan.nextLine();
                                System.out.println("Enter the name of each supported platform, one per line. Enter an empty line when done.");
                                String platform = "None";
                                while (!(platform.equals(""))) {  //continue the loop until user enters an empty string value
                                    platform = scan.nextLine();
                                    targetPlatforms.add(platform);
                                }
                    //create object
                    DevelopmentKit newKit = new DevelopmentKit(name, price, publisher, targetPlatforms);
                    //call setters
                    newKit.setName(name);
                    newKit.setPrice(price);
                    newKit.setPublisher(publisher);
                    newKit.setPlatforms(targetPlatforms);
                    //add newKit to "items"
                    items.add(newKit);
                    System.out.println("Item added.");

                    System.out.println(" ");
                    break;
                case 3: // Tradable
                    System.out.println(" ");

                    //prompt for info
                    System.out.print("Enter name of item: ");
                    scan.nextLine();
                    name = scan.nextLine();
                        System.out.print("Enter price of item: $");
                        price = scan.nextDouble();
                            System.out.print("Enter item's description: ");
                            scan.nextLine();
                            String description = scan.nextLine();
                                System.out.print("How many days before this item can be resold? ");
                                int saleDelay = scan.nextInt();
                    //create object
                    Tradable newTrade = new Tradable(name, price, description, saleDelay);
                    //call setters
                    newTrade.setName(name);
                    newTrade.setPrice(price);
                    newTrade.setDescription(description);
                    newTrade.setDelay(saleDelay);
                    //add object to array list, "items"
                    items.add(newTrade);
                    System.out.println("Item added.");

                    //System.out.println(newTrade.toString()); //debugging purposes

                    System.out.println(" ");
                    break;
                case 4: //Collectable
                    System.out.println(" ");

                    //prompt info
                    System.out.print("Enter name of item: ");
                    scan.nextLine();
                    name = scan.nextLine();
                        System.out.print("Enter price of item: $");
                        price = scan.nextDouble();
                            System.out.print("Enter item's description: ");
                            scan.nextLine();
                            description = scan.nextLine();
                                System.out.print("Where can this collectable be used? ");
                                String type = scan.nextLine();

                    //create object
                    Collectable newCollect = new Collectable(name, price, description, type);
                    //call setters
                    newCollect.setName(name);
                    newCollect.setPrice(price);
                    newCollect.setType(type);
                    newCollect.setDescription(description);
                    //add object to "items"
                    items.add(newCollect);
                    System.out.println("Item added.");

                    //System.out.println(newCollect.toString()); //for debugging purposes

                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println(" ");

                    System.out.println("Here's a list of all items currently available: ");

                    //print all items in the "items" list
                    for (int i=0; i<=items.size(); i++)   { //
                        while (i != items.size()){ //while variable "i" has a value <= the size of the "items" list, continue to...
                            System.out.println(items.get(i).toString()); //print the .toString() method of each element ("i")
                            System.out.println(" ");
                            i++;
                        }
                    }

                    System.out.println(" ");
                    break;
                case 6: //update price
                    System.out.println(" ");

                    //prompt info, pt. 1
                    System.out.print("Enter id of item: ");
                    int idInput = scan.nextInt();

                    //search items list for id match
                    boolean idFound = false;
                    for (int i=0; i<items.size();i++){ //initialize i as 0, continues loop until i == the size of items list, increase i by 1 w/ each loop
                        if (items.get(i).getId() == (idInput)) {  //if the user input matches an id, continue to update the price
                                System.out.print("Enter item's new price: $");
                                price = scan.nextDouble();

                                items.get(i).setPrice(price); //sets the items new price to the user's input

                                System.out.println("Price updated.");

                                //System.out.println(items.get(i).toString()); //for debugging purposes

                                idFound = true;
                                break;
                        }
                    }
                    if (!idFound){System.out.println("No item matches this id number.");}

                    System.out.println(" ");
                    break;
            }
        }
        System.out.println("Goodbye!");
        System.out.print("  Shutting off...");
    }
}
