package Refueler_Station;

//defines the ESSENTIAL methods that must be implemented in HybridCar and ElectricCar

public interface GasEngine {
    double refuelTank(double refuel);

    double getTankCapacity();  //tankCapacity is the maximum value of charge the vehicle can have

    double getCurrentVolume();  //currentVolume is the amount of charge the vehicle currently has
}
