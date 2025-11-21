package Digital_Inventory_System;
//subclass of Item


class DigitalGood extends Item{
    private String description;

    //constructor
    public DigitalGood(String name, double price, String description){
        super(name, price);
        this.description = description;
    }

    //getter (description)
    public String getDescription(){
        return description;
    }

    //setter (description)
    public String setDescription(String desc){
        this.description = desc;
        return description;
    }

    @Override
    public String toString(){
        return "Item: " + getName() + " (#" + getId() + ") | Price: $" + df.format(getPrice()) + "\n    Description: " + description;  //The "\n" allows the remaining content to be printed on a new line
    }
}
