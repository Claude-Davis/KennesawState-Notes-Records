package Refueler_Station;

import java.text.DecimalFormat;

class GasCar extends Car implements GasEngine{
    private double tankCapacity;
    private double currentVolume;


    public GasCar(double tankCapacity, double currentVolume){
        this.tankCapacity = tankCapacity;
        this.currentVolume = currentVolume;
    }


//implementation of GasEngine methods
    @Override
    public double refuelTank(double refuel){  //This method will: 1) refuel all gas engines, 2) track how much gas is provided in order to calculate the balance
        double fuel = 0;  //this variable will save the amount of fuel that the vehicle needs in order to == tankCapacity
        if ((refuel + currentVolume) > tankCapacity){
            refuel =  tankCapacity - currentVolume;
            currentVolume += refuel; //alt. code: currentVolume=tankCapacity;
            fuel = refuel;
        } else if (refuel + currentVolume <= tankCapacity) {
            currentVolume += refuel;
            fuel = refuel;
        }
        return fuel;
    }

    @Override
    public double getTankCapacity()  {return tankCapacity;}
    public double getCurrentVolume() {return currentVolume;}

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("0.00");
        return "Car: " + getId() + " | Current Fuel: " + df.format(currentVolume) + "/" + df.format(tankCapacity) + " gals";
    }



//implementation of ElectricEngine methods | REQUIRED due to the methods' presence in the abstract parent class, Car | will not be used/called in Main
    @Override 
    public double rechargeBattery(double recharge)  {return 0;}  
    @Override 
    public double getMaxBattery()     {return 0;}
    @Override
    public double getCurrentCharge()  {return 0;}
}