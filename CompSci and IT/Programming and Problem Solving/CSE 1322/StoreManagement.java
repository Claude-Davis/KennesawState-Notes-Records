//prompt: https://www.kennesaw.edu/ccse/first-year-experience/cse1322l/assignments/cse-1322l-spring-2025-assignment-1.pdf

import java.util.Scanner; //for inputs
import java.text.DecimalFormat; //to decide the number of places shown after the decimal

public class StoreManagement {
    public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("0.00"); //all decimals will show up to the hundredths place

            int applesStored = 0;       //# of apples in storage
            int orangesStored = 0;      //# of oranges in storage
            double applePrice = 0;      //price of apples
            double orangePrice = 0;     //price of oranges
            double storeBalance = 0;    //store's balance

            //title
            System.out.println("[Fruit Management System]");

            //the options menu
            System.out.println("1. Buy apples");
            System.out.println("2. Buy oranges");
            System.out.println("3. Sell apples");
            System.out.println("4. Sell oranges");
            System.out.println("5. Change price of apples");
            System.out.println("6. Change price of oranges");
            System.out.println("7. List inventory");
            System.out.println("8. Show balance");
            System.out.println("0. Quit");

            //user choice
            System.out.print("Enter option: ");
            int user_option = scan.nextInt();


         //main program loop
         while (user_option != 0){

             switch(user_option){
                 case 1: //Buying apples
                     System.out.print("How many apples do you want to buy? ");
                     int apples_amount = scan.nextInt();
                                //ensure that the user cannot buy a negative amount of apples
                                 while (apples_amount < 0) {
                                        System.out.print("Invalid quantity. Enter a non-negative number: ");
                                         apples_amount = scan.nextInt();
                                 }

                                //this section will return the user to the main menu [if zero is entered]
                                 if (apples_amount == 0) {
                                     System.out.println("Buying no apples.");
                                     break;
                                 }

                     System.out.print("What is the cost of each apple? $");
                     double apples_cost = scan.nextDouble();    //allows user to update the price of apples

                     //calculate and print total amount paid for the apples
                     double apples_amountPaid = apples_amount * apples_cost;
                     System.out.println("Bought " + apples_amount + " apples at $" + df.format(apples_cost) + " for a total of $" + df.format(apples_amountPaid) + ".");

                     //update "applesStored" variable
                     applesStored = (applesStored + apples_amount);

                     //update store balance
                     storeBalance = storeBalance - apples_amountPaid;

                                //System.out.println("Inventory of Apples: " + applesStored);   //to check functionality of code

                     break;
                 case 2:  //buying oranges
                     System.out.print("How many oranges do you want to buy? ");
                     int oranges_amount = scan.nextInt();
                                //ensure that the user cannot buy a neg. amount of oranges
                                while (oranges_amount < 0){
                                    System.out.print("Invalid quantity. Enter a non-negative number: ");
                                    oranges_amount = scan.nextInt();
                                }

                                //this section will return the user to the main menu [if zero is entered]
                                if (oranges_amount == 0) {
                                    System.out.println("Buying no oranges.");
                                    break;
                                }

                     System.out.print("What is the cost of each orange? $");
                     double oranges_cost = scan.nextDouble();   //allows user to update the price of oranges

                     //calculate and print total amount paid for the oranges
                     double oranges_amountPaid = oranges_amount * oranges_cost;
                     System.out.println("Bought " + oranges_amount + " at $" + df.format(oranges_cost) + " for a total of $" + df.format(oranges_amountPaid) + ".");

                     //update "orangesStored" variable
                     orangesStored = orangesStored + oranges_amount;

                     //update store balance
                     storeBalance = storeBalance - oranges_amountPaid;

                                //System.out.println("Inventory of Oranges: " + orangesStored);  //to check functionality of code

                     break;
                 case 3:  //selling apples
                    System.out.print("How many apples do you want to sell ($" + df.format(applePrice) + " each)? ");
                    int selling_apples = scan.nextInt();

                     while (selling_apples < 0) {  //if user tries to sell a negative amount
                         System.out.print("Invalid quantity. Enter a non-negative number: ");
                         selling_apples = scan.nextInt();
                     }
                    if (selling_apples > applesStored){  //if user tries to sell more than is available
                        //calculate total income from sale
                        double apples_totalIncome = applePrice * applesStored;

                        System.out.println("Not enough apples. Selling instead " + applesStored + " apples at $" + df.format(applePrice) + " for a total of $" + df.format(apples_totalIncome) + ".");

                        //update "applesStored"/inventory of apples
                        applesStored = 0;

                        //update store balance
                        storeBalance = storeBalance + apples_totalIncome;
                    } else if (selling_apples == applesStored){  //if user sells all available apples
                        //calculate total income from sale
                        double apples_totalIncome = applePrice * applesStored;

                        System.out.println("Sold all apples at $" + df.format(applePrice) + " for a total of $" + df.format(apples_totalIncome) + ".");

                        //update "applesStored"/inventory of apples
                        applesStored = 0;

                        //update store balance
                        storeBalance = storeBalance + apples_totalIncome;
                    } else if ((selling_apples < applesStored) && (selling_apples >= 0)) {  //if user sells less than total available apples
                        //calculate total income for sale
                        double apples_totalIncome = selling_apples * applePrice;

                        System.out.println("Sold " + selling_apples + " apples at $" + df.format(applePrice) + " for a total of $" + df.format(apples_totalIncome) + ".");

                        //update "applesStored"/inventory of apples
                        applesStored = applesStored - selling_apples;

                        //update store balance
                        storeBalance = storeBalance + apples_totalIncome;
                    }

                    break;
                 case 4:
                     System.out.print("How many oranges do you want to sell ($" + df.format(orangePrice) + " each)? ");
                     int selling_oranges = scan.nextInt();

                     while (selling_oranges < 0) {  //if user tries to sell a negative amount
                         System.out.print("Invalid quantity. Enter a non-negative number: ");
                         selling_oranges = scan.nextInt();
                     }
                     if (selling_oranges > orangesStored){  //if user tries to sell more than is available
                         //calculate total income from sale
                         double oranges_totalIncome = orangePrice * orangesStored;

                         System.out.println("Not enough oranges. Selling instead " + orangesStored + " oranges at $" + df.format(orangePrice) + " for a total of $" + df.format(oranges_totalIncome) + ".");

                         //update "orangesStored"/inventory of oranges
                         orangesStored = 0;

                         //update store balance
                         storeBalance = storeBalance + oranges_totalIncome;
                     } else if (selling_oranges == orangesStored){  //if user sells all available oranges
                         //calculate total income from sale
                         double oranges_totalIncome = orangePrice * orangesStored;

                         System.out.println("Sold all oranges at $" + df.format(orangePrice) + " for a total of $" + df.format(oranges_totalIncome) + ".");

                         //update "orangesStored"/inventory of oranges
                         orangesStored = 0;

                         //update store balance
                         storeBalance = storeBalance + oranges_totalIncome;
                     } else if ((selling_oranges < orangesStored) && (selling_oranges >= 0)) {  //if user sells less than total available oranges
                         //calculate total income for sale
                         double oranges_totalIncome = selling_oranges * orangePrice;

                         System.out.println("Sold " + selling_oranges + " oranges at $" + df.format(orangePrice) + " for a total of $" + df.format(oranges_totalIncome) + ".");

                         //update "orangesStored"/inventory of oranges
                         orangesStored = orangesStored - selling_oranges;

                         //update store balance
                         storeBalance = storeBalance + oranges_totalIncome;
                     }

                     break;
                 case 5:  //change price of apples
                     System.out.print("What is the new price of your apples? $");
                     applePrice = scan.nextDouble();

                     //prevent negative prices
                     while(applePrice < 0){
                         System.out.print("Invalid price. Enter a non-negative value: $");
                         applePrice = scan.nextDouble();
                     }

                     //display new selling price
                     System.out.println("Selling price set at $" + df.format(applePrice) + " per apple.");

                     break;
                 case 6:  //change price of oranges
                     System.out.print("What is the new selling price of your oranges? $");
                     orangePrice = scan.nextDouble();

                     //prevent negative prices
                     while (orangePrice < 0) {
                         System.out.print("Invalid price. Enter a non-negative value: $");
                         orangePrice = scan.nextDouble();
                     }

                     //display new selling price
                     System.out.println("Selling price set at $" + df.format(orangePrice) + " per orange.");

                     break;
                 case 7:  //store's inventory
                     System.out.println("Current inventory is:");
                     System.out.println(applesStored + " apples currently selling at $"  + df.format(applePrice) + ".");
                     System.out.println(orangesStored + " oranges currently selling at $" + df.format(orangePrice) + ".");

                     break;
                 case 8:  //store's balance
                     System.out.println("Current balance is:");
                     System.out.println("$" + df.format(storeBalance));
             }

             System.out.println(" ");

             System.out.println("1. Buy apples");
             System.out.println("2. Buy oranges");
             System.out.println("3. Sell apples");
             System.out.println("4. Sell oranges");
             System.out.println("5. Change price of apples");
             System.out.println("6. Change price of oranges");
             System.out.println("7. List inventory");
             System.out.println("8. Show balance");
             System.out.println("0. Quit");

             //user choice
             System.out.print("Enter option: ");
             user_option = scan.nextInt();
         }
         //option == 0 | program loop stops
         System.out.print("Shutting off...");
    }
}
