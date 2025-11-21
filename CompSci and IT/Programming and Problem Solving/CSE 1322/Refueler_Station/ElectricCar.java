package Refueler_Station;

import java.text.DecimalFormat;

class ElectricCar extends Car implements ElectricEngine{
    private double maxBattery;
    private double currentCharge;

    public ElectricCar(double maxBattery, double currentCharge){
        this.maxBattery = maxBattery;
        this.currentCharge = currentCharge;
    }

//implementation of ElectricEngine methods
    @Override 
    public double rechargeBattery(double recharge){  //this method will 1) recharge all electric engines and 2) will track the value of charge dispersed in order to calculate balance
        double charge = 0; //this variable will save the total amount of charge given out
        if ((recharge + currentCharge) > maxBattery){
            recharge = maxBattery - currentCharge;
            currentCharge += recharge; //alt. code: currentCharge = maxBattery;
            charge = recharge;
        } else if ((recharge + currentCharge) <= maxBattery){
            currentCharge += recharge;
            charge = recharge;
        }
        return charge;
    }
    @Override 
    public double getMaxBattery()     {return maxBattery;}
    @Override
    public double getCurrentCharge()  {return currentCharge;}

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("0.00");
        return "Car: " + getId() + " | Current Charge: " + df.format(currentCharge) + "/" + df.format(maxBattery) + "kW";
    }




//implementation of GasEngine methods | REQUIRED due to presence of abstarct, parent class, Car | will NOT be used/called
    @Override
    public double refuelTank(double refuel)  {return 0;}
    @Override
    public double getTankCapacity()  {return 0;}
    @Override
    public double getCurrentVolume() {return 0;}
}
