//prompt: https://www.kennesaw.edu/ccse/first-year-experience/cse1322l/labs/1322l-lab-4.pdf

import java.util.Scanner;

public class TicketManager {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ParkWallet newWallet = new ParkWallet(); // creates an instance of the class ParkWallet called "newWallet"

        //start off ParkWallet instance w/ 100 tickets
        int balance = 100;
        newWallet.setTickets(balance);

        //title of program
        System.out.println("[Theme Park Wallet Manager]");

        //initliaze the "option" variable (located outside of the while loop to avoid the error of repeated initialization of the variable
        int option = 0;

        while (option != 5) {
            System.out.println("1. Add tickets");
            System.out.println("2. Set tickets");
            System.out.println("3. Buy prize");
            System.out.println("4. Set holiday");
            System.out.println("5. Quit");

            System.out.println("Your wallet has " + newWallet.getTickets() + " tickets.");

            System.out.print("Enter option: ");
            option = scan.nextInt();

            System.out.println(" "); //blank space for break

            switch(option){
                case 1:
                    System.out.print("Add how many tickets? ");
                    int additional = scan.nextInt();

                    newWallet.addTickets(additional);

                    System.out.println(" "); //blank space for break

                    //System.out.println("tickets: " + newWallet.getTickets()); //DEBUGGING PURPOSES: print amount of tickets user has

                    break;
                case 2:
                    System.out.print("Set ticket balance to: ");
                    balance = scan.nextInt();

                    if (balance >= 0){
                        newWallet.setTickets(balance);
                        //System.out.println("tickets: " + newWallet.getTickets());  //DEBUGGING PURPOSES: print amount of tickets user has
                    }

                    System.out.println(" "); //blank space for break

                    break;
                case 3:
                    if (!newWallet.getHoliday()) { //prices if NOT holiday
                                System.out.println("1. T-shirt (150 tickets)");
                                System.out.println("2. Sun Hat (350 tickets)");
                                System.out.println("3. Sneakers (600 tickets)");
                                System.out.print("Buy which prize? ");
                                int prizeChoice = scan.nextInt();

                                switch (prizeChoice){
                                    case 1:
                                        if (newWallet.getTickets() >= 150){
                                            int cost = 150;
                                            System.out.println("You bought a T-shirt!");
                                            newWallet.subtractTickets(cost);
                                            //System.out.println("tickets: " + newWallet.getTickets());  //DEBUGGING PURPOSES: print amount of tickets user has
                                        }
                                        else if (newWallet.getTickets() < 150) {
                                            System.out.println("Not enough tickets.");
                                        }

                                        break;
                                    case 2:
                                        if (newWallet.getTickets() >= 350){
                                            int cost = 350;
                                            System.out.println("You bought a sun hat!");
                                            newWallet.subtractTickets(cost);
                                            //System.out.println("tickets: " + newWallet.getTickets());  //DEBUGGING PURPOSES: print amount of tickets user has
                                        }
                                        else if (newWallet.getTickets() < 350) {
                                            System.out.println("Not enough tickets.");
                                        }

                                        break;
                                    case 3:
                                        if (newWallet.getTickets() >= 600){
                                            int cost = 600;
                                            System.out.println("You bought sneakers!");
                                            newWallet.subtractTickets(cost);
                                            //System.out.println("tickets: " + newWallet.getTickets());  //DEBUGGING PURPOSES: print amount of tickets user has
                                        }
                                        else if (newWallet.getTickets() < 600) {
                                            System.out.println("Not enough tickets.");
                                        }

                                        break;
                                }
                    }
                    else if (newWallet.getHoliday()) { //prices if it IS a holiday
                                System.out.println("Holiday prices!");

                                System.out.println("1. T-shirt (75 tickets)");
                                System.out.println("2. Sun Hat (175 tickets)");
                                System.out.println("3. Sneakers (300 tickets)");
                                System.out.print("Buy which prize? ");
                                int prizeChoice = scan.nextInt();

                                switch (prizeChoice){
                                    case 1:
                                        if (newWallet.getTickets() >= 75){
                                            int cost = 75;
                                            System.out.println("You bought a T-shirt!");
                                            newWallet.subtractTickets(cost);
                                            //System.out.println("tickets: " + newWallet.getTickets());  //DEBUGGING PURPOSES: print amount of tickets user has
                                        }
                                        else if (newWallet.getTickets() < 75) {
                                            System.out.println("Not enough tickets.");
                                        }

                                        break;
                                    case 2:
                                        if (newWallet.getTickets() >= 175){
                                            int cost = 175;
                                            System.out.println("You bought a sun hat!");
                                            newWallet.subtractTickets(cost);
                                            //System.out.println("tickets: " + newWallet.getTickets());  //DEBUGGING PURPOSES: print amount of tickets user has
                                        }
                                        else if (newWallet.getTickets() < 175) {
                                            System.out.println("Not enough tickets.");
                                        }

                                        break;
                                    case 3:
                                        if (newWallet.getTickets() >= 300){
                                            int cost = 300;
                                            System.out.println("You bought sneakers!");
                                            newWallet.subtractTickets(cost);
                                            //System.out.println("tickets: " + newWallet.getTickets());  //DEBUGGING PURPOSES: print amount of tickets user has
                                        }
                                        else if (newWallet.getTickets() < 300) {
                                            System.out.println("Not enough tickets.");
                                        }

                                        break;
                                }
                    }

                    System.out.println(" "); //blank space for break

                    break;
                case 4:
                    //System.out.println("holiday = " + newWallet.getHoliday()); //for DEBUGGING purposes

                    if (newWallet.getHoliday()){
                        newWallet.setHoliday();
                        System.out.println("It is no longer a holiday.");
                                //System.out.println("holiday = " + newWallet.getHoliday()); //for DEBUGGING purposes
                        System.out.println(" ");
                    }
                    else if (!newWallet.getHoliday()){
                        newWallet.setHoliday();
                        System.out.println("It is now a holiday.");
                                //System.out.println("holiday = " + newWallet.getHoliday()); //for DEBUGGING purposes
                        System.out.println(" ");
                    }
                    
                    break;
            }
        }
        System.out.println("Shutting off...");
    }
}