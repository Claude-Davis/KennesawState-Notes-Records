package Refueler_Station;

import java.text.DecimalFormat;

class HybridCar extends Car implements GasEngine, ElectricEngine{
    private double maxBattery;
    private double currentCharge;
    private double tankCapacity;
    private double currentVolume;

    public HybridCar(double maxBattery, double currentCharge, double tankCapacity, double currentVolume){
        this.maxBattery = maxBattery;
        this.currentCharge = currentCharge;
        this.tankCapacity = tankCapacity;
        this.currentVolume = currentVolume;
    }

//Implementation of GasEngine methods
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
    @Override
    public double getCurrentVolume() {return currentVolume;}


//implementation of ElectricEngine methods
    public double rechargeBattery(double recharge){
        double charge = 0;
        if ((recharge+currentCharge) > maxBattery){
            recharge = maxBattery - currentCharge;
            currentCharge += recharge;
            charge = recharge;
        } else if ((recharge+currentCharge) <= maxBattery){
            currentCharge += recharge;
            charge = recharge;
        }
        return charge;
    }
    @Override
    public double getMaxBattery()    {return maxBattery;}
    @Override
    public double getCurrentCharge() {return currentCharge;}

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("0.00");
        return "Car: " + getId() + " | Current Charge: " + df.format(currentCharge) + "/" + df.format(maxBattery) + "kW | Current Fuel: " + currentVolume + "/" + tankCapacity + " gals";
    }
}