package Refueler_Station;

abstract class Car{
    private int id;
    private static int nextId = 0;

    public Car(){
        this.id = nextId;
        this.nextId++;
    }

    //getter (id)
    public int getId()   {return id;}


    //abstract methods for gas engines
    public abstract double refuelTank(double refuel);
    public abstract double getCurrentVolume();
    public abstract double getTankCapacity();

    //abstract methods for electric engines
    public abstract double rechargeBattery(double recharge);
    public abstract double getMaxBattery();
    public abstract double getCurrentCharge();
}