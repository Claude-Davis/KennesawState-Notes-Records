package Refueler_Station;

//defines the ESSENTIAL methods that must be implemented by HybridCar and ElectricCar

public interface ElectricEngine {

    double rechargeBattery(double recharge);

    double getMaxBattery(); //maxBattery is the maximum value of charge the vehicle can have

    double getCurrentCharge(); //currentCharge is the amount of charge the vehicle currently has
}
