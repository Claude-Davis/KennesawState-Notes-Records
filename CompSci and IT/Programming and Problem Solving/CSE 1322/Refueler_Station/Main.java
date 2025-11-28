package Refueler_Station;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("0.00");
        Random r = new Random();

        //title
        System.out.println("[The Refueler Station]");

        //initialize "option"
        int option = 0;

        //initialize "balance"
        double balance = 0;  //will track the profit of the gas station

        while (option != 9){
            //menu
            System.out.println("1. Add gas car");
            System.out.println("2. Add electric car");
            System.out.println("3. Add hybrid car");
            System.out.println("4. Refuel all gas engines");
            System.out.println("5. Recharge all electric engines");
            System.out.println("6. Refuel and recharge all vehicles");
            System.out.println("7. Display all vehicles");
            System.out.println("8. Dispatch all vehicles");
            System.out.println("9. Quit program");
            
            //prices
            System.out.println("Gas: $4.00/gal | Electricity: $0.20/kW");

            System.out.print("Enter option #: ");
            option = sc.nextInt();

            switch(option){
                default: 
                    System.out.println(" ");

                    if (option != 9) {System.out.println("Invalid Entry.");}
                    else {break;}

                    System.out.println(" ");
                    break;
                case 1:  //add gas car
                    System.out.println(" ");

                    //generate needed values
                    double currentVolume = r.nextInt(14) + 2; //range of 2-14
                    double tankCapacity = r.nextInt(30) + 15; //range of 15-30

                    //create object
                    GasCar gasCar = new GasCar(tankCapacity, currentVolume);

                    //add object to "cars" ArrayList
                    cars.add(gasCar);

                    //statement
                    System.out.println("Vehicle #" + gasCar.getId() + " parked at a pump.");

                    System.out.println(" ");
                    break;
                case 2:  //add electric car
                    System.out.println(" ");

                    //generate needed values
                    double currentCharge = r.nextInt(14) + 2;
                    double maxBattery = r.nextInt(30) + 15;
                    
                    //create object
                    ElectricCar electricCar = new ElectricCar(maxBattery, currentCharge);

                    //add object to "cars"
                    cars.add(electricCar);

                    //Statement
                    System.out.println("Vehicle #" + electricCar.getId() + " parked at a charger.");

                    System.out.println(" ");
                    break;
                case 3: //add hybrid car
                    System.out.println(" ");

                    //generate needed information
                    currentCharge = r.nextInt(14) + 2;
                    currentVolume = r.nextInt(14) + 2;
                    maxBattery = r.nextInt(30) + 15;
                    tankCapacity = r.nextInt(30) + 15;

                    //create object
                    HybridCar hybridCar = new HybridCar(maxBattery, currentCharge, tankCapacity, currentVolume);

                    //add object to "cars"
                    cars.add(hybridCar);

                    //statement
                    System.out.println("Vehicle #" + hybridCar.getId() + " parked at a pump-charger.");

                    System.out.println(" ");
                    break;
                case 4:  //refuel all gas engines
                    System.out.println(" ");

                    //initialize variable to hold total amount of fuel distributed [in order to calculate balance]
                    double totalFuel = 0;

                    //refuel gas engines
                    for (int g=0; g<=cars.size(); g++) {
                        while (g<cars.size()) { 
                            double refuel = cars.get(g).getTankCapacity() - cars.get(g).getCurrentVolume();
                            cars.get(g).refuelTank(refuel);
                            totalFuel += refuel;
                            g++;  //to ensure the while loop eventually ends
                        }
                    }

                    //calculate balance
                    balance += (4 * totalFuel);

                    //Statement
                    System.out.println("All gas engines have been fueled. THe current balance is $" + df.format(balance) + ".");

                    System.out.println(" ");
                    break;
                case 5:  //recharge all electric engines
                    System.out.println(" ");

                    //initialize variable to store all charges distributed
                    double totalCharges = 0;

                    //recharge electric engines
                    for (int e=0; e<=cars.size(); e++) {
                        while (e<cars.size()) {
                            double recharge = cars.get(e).getMaxBattery() - cars.get(e).getCurrentCharge();
                            cars.get(e).rechargeBattery(recharge);
                            totalCharges += recharge;
                            e++;  //to ensure the while loop eventually ends
                        }
                    }

                    //calculate balance
                    balance += (0.2 * totalCharges);

                    //Statement
                    System.out.println("All electric engines have been charged. The current balance is $" + df.format(balance) + ".");

                    System.out.println(" ");
                    break;
                case 6:  //refuel and recharge all engines
                    System.out.println(" ");

                    //variables to store all charges and fuel distributed
                    totalCharges = 0;
                    totalFuel = 0;

                    //recharge and refuel all engines
                    for (int h=0; h<=cars.size(); h++) {
                        while (h<cars.size()){
                            double recharge = cars.get(h).getMaxBattery() - cars.get(h).getCurrentCharge();
                            double refuel = cars.get(h).getTankCapacity() - cars.get(h).getCurrentVolume();
                            cars.get(h).rechargeBattery(recharge);
                            cars.get(h).refuelTank(refuel);
                            totalCharges += recharge;
                            totalFuel += refuel;
                            h++; //to ensure the while loop eventually ends
                        }
                    }

                    //calculate balance 
                    balance = (totalCharges * 0.2) + (totalFuel * 4);

                    //Statement
                    System.out.println("All engines have been recharged and refueled. The current balance is $" + df.format(balance) + ".");

                    System.out.println(" ");
                    break;
                case 7: //display all vehicles and their stats
                    System.out.println(" ");

                    //print all vehicles
                    if (cars.size() > 0) {
                        for (int c=0; c<cars.size(); c++){
                            while (c<cars.size()){
                                System.out.println(cars.get(c).toString());
                                c++; //to ensure the while loop eventually ends
                            }
                        }
                    } else {System.out.println("No vehicles are parked.");}

                    System.out.println(" ");
                    break;
                case 8:  //dispatch all vehicles
                    System.out.println(" ");

                    //clear the "cars" ArrayList
                    cars.clear();

                    //Statement
                    System.out.println("All vehicles have left.");

                    System.out.println(" ");
                    break;
            }
        }
        System.out.println(" ");
        System.out.println("The Refueler Station made $" + df.format(balance) + " today.");
        System.out.println("Shutting off...");
    }
    
}
