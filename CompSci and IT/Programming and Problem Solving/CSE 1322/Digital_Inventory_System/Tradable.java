package Digital_Inventory_System;
//subclass of DigitalGood


class Tradable extends DigitalGood{
    private int saleDelay;

    //constructor
    public Tradable(String name, double price, String description, int saleDelay){
        super(name, price, description);
        this.saleDelay = saleDelay;
    }

    //getter (saleDelay)
    public int getDelay(){
        return saleDelay;
    }

    //setter (saleDelay)
    public int setDelay(int sD){
        //check if user value is negative or positive
        if (sD < 0){
            this.saleDelay = 0;
        } else{
            this.saleDelay = sD;
        }

        return saleDelay;
    }

    @Override
    public String toString(){
        //The "\t" allows the remaining content to be printed on a new line
        return "Item: " + getName() + "(#" + getId() + ") | Price: $" + df.format(getPrice()) + "\n    Description: " + getDescription() + "\n    Item can only be sold after being owned for " + saleDelay + " days.";
    }
}
